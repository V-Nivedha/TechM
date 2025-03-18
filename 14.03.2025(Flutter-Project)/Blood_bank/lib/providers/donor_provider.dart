import 'package:cloud_firestore/cloud_firestore.dart';
import 'package:flutter/material.dart';

class DonorProvider with ChangeNotifier {
  final FirebaseFirestore _firestore = FirebaseFirestore.instance;

  Stream<QuerySnapshot> getDonors() {
    return _firestore.collection('donors').snapshots();
  }

  Future<void> addDonor(String name, String bloodType, String city, String contact) async {
    await _firestore.collection('donors').add({
      'name': name,
      'bloodType': bloodType,
      'city': city,
      'contact': contact,
    });
    notifyListeners();
  }
}
