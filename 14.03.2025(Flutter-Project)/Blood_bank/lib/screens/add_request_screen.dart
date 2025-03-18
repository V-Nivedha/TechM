import 'package:flutter/material.dart';
import 'package:cloud_firestore/cloud_firestore.dart';

class AddRequestScreen extends StatefulWidget {
  const AddRequestScreen({super.key});

  @override
  _AddRequestScreenState createState() => _AddRequestScreenState();
}

class _AddRequestScreenState extends State<AddRequestScreen> {
  final TextEditingController _patientNameController = TextEditingController();
  final TextEditingController _hospitalController = TextEditingController();
  final TextEditingController _contactController = TextEditingController();
  final _formKey = GlobalKey<FormState>();
  String? _selectedBloodGroup;

  Future<void> _submitRequest() async {
    if (_formKey.currentState!.validate()) {
      await FirebaseFirestore.instance.collection('requests').add({
        'patientName': _patientNameController.text.trim(),
        'requiredBloodType': _selectedBloodGroup,
        'hospital': _hospitalController.text.trim(),
        'contact': _contactController.text.trim(),
        'status': 'pending',
      });

      ScaffoldMessenger.of(context).showSnackBar(
        SnackBar(
          content: const Text("Blood request submitted successfully"),
          backgroundColor: Colors.green.shade600,
        ),
      );
      Navigator.pop(context);
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("Add Blood Request"),
        backgroundColor: Colors.redAccent,
        elevation: 0,
      ),
      body: Padding(
        padding: const EdgeInsets.all(20.0),
        child: Form(
          key: _formKey,
          child: Column(
            crossAxisAlignment: CrossAxisAlignment.start,
            children: [
              const Text(
                "Enter Request Details",
                style: TextStyle(fontSize: 18, fontWeight: FontWeight.bold),
              ),
              const SizedBox(height: 15),

              TextFormField(
                controller: _patientNameController,
                decoration: InputDecoration(
                  labelText: "Patient Name",
                  prefixIcon: const Icon(Icons.person),
                  border: OutlineInputBorder(
                    borderRadius: BorderRadius.circular(10),
                  ),
                ),
                validator:
                    (value) =>
                        value!.isEmpty ? "Please enter patient name" : null,
              ),
              const SizedBox(height: 15),

              DropdownButtonFormField<String>(
                value: _selectedBloodGroup,
                items:
                    ['A+', 'A-', 'B+', 'B-', 'O+', 'O-', 'AB+', 'AB-']
                        .map(
                          (bloodType) => DropdownMenuItem(
                            value: bloodType,
                            child: Text(bloodType),
                          ),
                        )
                        .toList(),
                onChanged:
                    (value) => setState(() => _selectedBloodGroup = value),
                decoration: InputDecoration(
                  labelText: "Required Blood Type",
                  prefixIcon: const Icon(Icons.bloodtype),
                  border: OutlineInputBorder(
                    borderRadius: BorderRadius.circular(10),
                  ),
                ),
                validator:
                    (value) =>
                        value == null ? "Please select a blood group" : null,
              ),
              const SizedBox(height: 15),

              TextFormField(
                controller: _hospitalController,
                decoration: InputDecoration(
                  labelText: "Hospital",
                  prefixIcon: const Icon(Icons.local_hospital),
                  border: OutlineInputBorder(
                    borderRadius: BorderRadius.circular(10),
                  ),
                ),
                validator:
                    (value) =>
                        value!.isEmpty ? "Please enter hospital name" : null,
              ),
              const SizedBox(height: 15),

             
              TextFormField(
                controller: _contactController,
                decoration: InputDecoration(
                  labelText: "Contact",
                  prefixIcon: const Icon(Icons.phone),
                  border: OutlineInputBorder(
                    borderRadius: BorderRadius.circular(10),
                  ),
                ),
                keyboardType: TextInputType.phone,
                validator:
                    (value) =>
                        value!.isEmpty || value.length != 10
                            ? "Enter a valid 10-digit number"
                            : null,
              ),
              const SizedBox(height: 20),

           
              SizedBox(
                width: double.infinity,
                child: ElevatedButton.icon(
                  onPressed: _submitRequest,
                  icon: const Icon(Icons.send),
                  label: const Text("Submit Request"),
                  style: ElevatedButton.styleFrom(
                    backgroundColor: Colors.redAccent,
                    foregroundColor: Colors.white,
                    padding: const EdgeInsets.symmetric(vertical: 12),
                    textStyle: const TextStyle(fontSize: 16),
                    shape: RoundedRectangleBorder(
                      borderRadius: BorderRadius.circular(10),
                    ),
                  ),
                ),
              ),
            ],
          ),
        ),
      ),
    );
  }
}
