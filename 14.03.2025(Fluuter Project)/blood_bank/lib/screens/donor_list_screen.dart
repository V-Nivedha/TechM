import 'package:flutter/material.dart';
import 'package:cloud_firestore/cloud_firestore.dart';
import '../widgets/donor_card.dart';

class DonorListScreen extends StatefulWidget {
  const DonorListScreen({super.key});

  @override
  _DonorListScreenState createState() => _DonorListScreenState();
}

class _DonorListScreenState extends State<DonorListScreen> {
  String _searchQuery = '';

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("Donor List"),
        backgroundColor: Colors.redAccent,
        elevation: 0,
      ),
      body: Column(
        children: [
          // Search Bar
          Padding(
            padding: const EdgeInsets.all(10.0),
            child: TextField(
              decoration: InputDecoration(
                prefixIcon: const Icon(Icons.search),
                hintText: "Search by name or city...",
                border: OutlineInputBorder(
                  borderRadius: BorderRadius.circular(10),
                ),
              ),
              onChanged: (value) {
                setState(() {
                  _searchQuery = value.toLowerCase();
                });
              },
            ),
          ),
          Expanded(
            child: StreamBuilder(
              stream:
                  FirebaseFirestore.instance.collection('donors').snapshots(),
              builder: (context, snapshot) {
                if (!snapshot.hasData) {
                  return const Center(child: CircularProgressIndicator());
                }

                var donors =
                    snapshot.data!.docs.where((doc) {
                      String name = doc['name'].toLowerCase();
                      String city = doc['city'].toLowerCase();
                      return name.contains(_searchQuery) ||
                          city.contains(_searchQuery);
                    }).toList();

                if (donors.isEmpty) {
                  return const Center(
                    child: Text(
                      "No donors found",
                      style: TextStyle(fontSize: 16),
                    ),
                  );
                }

                return ListView.builder(
                  padding: const EdgeInsets.all(8.0),
                  itemCount: donors.length,
                  itemBuilder: (context, index) {
                    var doc = donors[index];
                    return DonorCard(
                      name: doc['name'],
                      bloodGroup: doc['bloodType'],
                      contact: doc['contact'],
                      city: doc['city'],
                    );
                  },
                );
              },
            ),
          ),
        ],
      ),
    );
  }
}
