import 'package:flutter/material.dart';
import 'get_book_screen.dart';
import 'stored_books_screen.dart';

class HomeScreen extends StatelessWidget {
  const HomeScreen({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text('Book Management')),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            ElevatedButton(
              onPressed: () => Navigator.push(
                context, MaterialPageRoute(builder: (context) => GetBookScreen())),
              child: const Text('Add New Book'),
            ),
            const SizedBox(height: 20),
            ElevatedButton(
              onPressed: () => Navigator.push(
                context, MaterialPageRoute(builder: (context) => StoredBooksScreen())),
              child: const Text('View Stored Books'),
            ),
          ],
        ),
      ),
    );
  }
}
