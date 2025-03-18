import 'package:flutter/material.dart';

class BloodBanksScreen extends StatelessWidget {
  const BloodBanksScreen({super.key});

  @override
  Widget build(BuildContext context) {
  
    final List<Map<String, String>> bloodBanks = [
      {
        "name": "Red Cross Blood Bank",
        "location": "Chennai",
        "address": "123, Anna Salai, Chennai",
        "contact": "+91 98765 43210",
      },
      {
        "name": "Lifeline Blood Bank",
        "location": "Bangalore",
        "address": "45, MG Road, Bangalore",
        "contact": "+91 87654 32109",
      },
      {
        "name": "Apollo Blood Bank",
        "location": "Hyderabad",
        "address": "789, Jubilee Hills, Hyderabad",
        "contact": "+91 76543 21098",
      },
      {
        "name": "Global Blood Center",
        "location": "Mumbai",
        "address": "22, Bandra West, Mumbai",
        "contact": "+91 65432 10987",
      },
    ];

    void _showContactDialog(
      BuildContext context,
      String name,
      String address,
      String contact,
    ) {
      showDialog(
        context: context,
        builder: (context) {
          return AlertDialog(
            title: Text("Contact Info for $name"),
            content: Column(
              mainAxisSize: MainAxisSize.min,
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                Text("📍 Address: $address"),
                Text("📞 Contact: $contact"),
              ],
            ),
            actions: [
              TextButton(
                onPressed: () => Navigator.pop(context),
                child: const Text("Close"),
              ),
            ],
          );
        },
      );
    }

    return Scaffold(
      appBar: AppBar(
        title: const Text("Blood Banks"),
        backgroundColor: Colors.red,
      ),
      body: bloodBanks.isEmpty
          ? const Center(child: Text("No blood banks available"))
          : ListView.builder(
              itemCount: bloodBanks.length,
              itemBuilder: (context, index) {
                return Card(
                  margin: const EdgeInsets.symmetric(vertical: 10, horizontal: 15),
                  elevation: 5,
                  shape: RoundedRectangleBorder(
                    borderRadius: BorderRadius.circular(15),
                  ),
                  child: ListTile(
                    contentPadding: const EdgeInsets.all(15),
                    leading: const Icon(
                      Icons.local_hospital,
                      color: Colors.red,
                      size: 40,
                    ),
                    title: Text(
                      bloodBanks[index]["name"]!,
                      style: const TextStyle(
                        fontWeight: FontWeight.bold,
                        fontSize: 18,
                      ),
                    ),
                    subtitle: Column(
                      crossAxisAlignment: CrossAxisAlignment.start,
                      children: [
                        Text(
                          "Location: ${bloodBanks[index]["location"]}",
                          style: TextStyle(fontSize: 14, color: Colors.grey[700]),
                        ),
                        const SizedBox(height: 5),
                        ElevatedButton(
                          onPressed: () {
                            _showContactDialog(
                              context,
                              bloodBanks[index]["name"]!,
                              bloodBanks[index]["address"]!,
                              bloodBanks[index]["contact"]!,
                            );
                          },
                          style: ElevatedButton.styleFrom(
                            backgroundColor: Colors.redAccent, 
                            shape: RoundedRectangleBorder(
                              borderRadius: BorderRadius.circular(10),
                            ),
                            padding: const EdgeInsets.symmetric(
                              horizontal: 15,
                              vertical: 8,
                            ),
                          ),
                          child: const Text(
                            "Contact",
                            style: TextStyle(
                              fontSize: 14,
                              fontWeight: FontWeight.bold,
                              color: Colors.white, 
                            ),
                          ),
                        ),
                      ],
                    ),
                  ),
                );
              },
            ),
    );
  }
}
