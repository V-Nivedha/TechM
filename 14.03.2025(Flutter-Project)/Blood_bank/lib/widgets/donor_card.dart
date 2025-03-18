import 'package:flutter/material.dart';

class DonorCard extends StatelessWidget {
  final String name;
  final String bloodGroup;
  final String city;
  final String contact;

  const DonorCard({
    super.key,
    required this.name,
    required this.bloodGroup,
    required this.city,
    required this.contact,
  });

  @override
  Widget build(BuildContext context) {
    return Card(
      elevation: 4,
      margin: const EdgeInsets.symmetric(vertical: 8, horizontal: 16),
      child: Padding(
        padding: const EdgeInsets.all(12.0),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            Text(name, style: const TextStyle(fontSize: 18, fontWeight: FontWeight.bold)),
            Text("Blood Group: $bloodGroup"),
            Text("City: $city"),
            Text("Contact: $contact", style: const TextStyle(color: Colors.blue)),
          ],
        ),
      ),
    );
  }
}
