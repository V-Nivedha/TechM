import 'package:sqflite/sqflite.dart';
import 'package:path/path.dart';

class DatabaseHelper {
  static Database? _database;

  Future<Database> get database async {
    if (_database != null) return _database!;
    _database = await _initDB();
    return _database!;
  }

  Future<Database> _initDB() async {
    String path = join(await getDatabasesPath(), 'books.db');
    return await openDatabase(
      path,
      version: 1,
      onCreate: (db, version) {
        return db.execute(
          'CREATE TABLE books (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, author TEXT, description TEXT, imageUrl TEXT)',
        );
      },
    );
  }

  Future<void> insertBook(Map<String, dynamic> book) async {
    final db = await database;
    await db.insert('books', book);
  }

  Future<List<Map<String, dynamic>>> getBooks() async {
    final db = await database;
    return await db.query('books');
  }
}
