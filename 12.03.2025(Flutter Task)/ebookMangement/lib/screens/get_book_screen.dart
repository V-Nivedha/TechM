import 'package:flutter/material.dart';
import '../databse/db_helper.dart';
import 'confirmation_screen.dart';

class GetBookScreen extends StatefulWidget {
  const GetBookScreen({super.key});

  @override
  _GetBookScreenState createState() => _GetBookScreenState();
}

class _GetBookScreenState extends State<GetBookScreen> {
  final _formKey = GlobalKey<FormState>();
  final TextEditingController nameController = TextEditingController();
  final TextEditingController authorController = TextEditingController();
  final TextEditingController descController = TextEditingController();
  final TextEditingController imageController = TextEditingController();
  final dbHelper = DatabaseHelper();

  void _saveBook() async {
    if (_formKey.currentState!.validate()) {
      final book = {
        'name': nameController.text,
        'author': authorController.text,
        'description': descController.text,
        'imageUrl': imageController.text,
      };
      await dbHelper.insertBook(book);
      Navigator.pushReplacement(
        context,
        MaterialPageRoute(
          builder: (context) => ConfirmationScreen(),
        ),
      );
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('Add a Book')),
      body: Padding(
        padding: const EdgeInsets.all(16.0),
        child: Form(
          key: _formKey,
          child: Column(
            children: [
              TextFormField(
                controller: nameController,
                decoration: const InputDecoration(labelText: 'Book Name'),
                validator: (value) => value!.isEmpty ? 'Enter book name' : null,
              ),
              TextFormField(
                controller: authorController,
                decoration: const InputDecoration(labelText: 'Author'),
                validator: (value) => value!.isEmpty ? 'Enter author name' : null,
              ),
              TextFormField(
                controller: descController,
                decoration: const InputDecoration(labelText: 'Description'),
                validator: (value) => value!.isEmpty ? 'Enter description' : null,
              ),
              TextFormField(
                controller: imageController,
                decoration: const InputDecoration(labelText: 'Image URL'),
                validator: (value) => value!.isEmpty ? 'Enter image URL' : null,
              ),
              const SizedBox(height: 20),
              ElevatedButton(
                onPressed: _saveBook,
                child: const Text('Save Book'),
              ),
            ],
          ),
        ),
      ),
    );
  }
}
