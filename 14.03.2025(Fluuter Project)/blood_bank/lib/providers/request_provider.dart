import 'package:cloud_firestore/cloud_firestore.dart';
import 'package:flutter/material.dart';

class RequestProvider with ChangeNotifier {
  final CollectionReference requests = FirebaseFirestore.instance.collection('requests');

  Future<void> addRequest(String patientName, String requiredBloodType, String hospital, String contact) async {
    await requests.add({
      'patientName': patientName,
      'requiredBloodType': requiredBloodType,
      'hospital': hospital,
      'contact': contact,
      'status': 'pending',
      'createdAt': FieldValue.serverTimestamp(),
    });
    notifyListeners();
  }

  Stream<QuerySnapshot> getRequests() => requests.orderBy('createdAt', descending: true).snapshots();
}
