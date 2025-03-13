import 'package:flutter/material.dart';
import '../databse/db_helper.dart';
class StoredBooksScreen extends StatefulWidget {
  final String? message;
  const StoredBooksScreen({super.key, this.message});

  @override
  _StoredBooksScreenState createState() => _StoredBooksScreenState();
}

class _StoredBooksScreenState extends State<StoredBooksScreen> {
  final dbHelper = DatabaseHelper();
  List<Map<String, dynamic>> books = [];

  @override
  void initState() {
    super.initState();
    _loadBooks();
  }

  void _loadBooks() async {
    List<Map<String, dynamic>> data = await dbHelper.getBooks();
    setState(() {
      books = data;
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('Stored Books')),
      body: Column(
        children: [
          if (widget.message != null) 
            Padding(
              padding: const EdgeInsets.all(10.0),
              child: Text(widget.message!, style: const TextStyle(fontSize: 18, color: Colors.green)),
            ),
          Expanded(
            child: books.isEmpty
                ? const Center(child: Text('No books stored yet!'))
                : ListView.builder(
                    itemCount: books.length,
                    itemBuilder: (context, index) {
                      final book = books[index];
                      return Card(
                        child: ListTile(
                          leading: book['imageUrl'].isNotEmpty
                              ? Image.network(book['imageUrl'], width: 50, height: 50, fit: BoxFit.cover)
                              : const Icon(Icons.book, size: 50),
                          title: Text(book['name']),
                          subtitle: Text('Author: ${book['author']}\n${book['description']}'),
                        ),
                      );
                    },
                  ),
          ),
        ],
      ),
    );
  }
}
