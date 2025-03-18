import 'package:cloud_firestore/cloud_firestore.dart';

class FirebaseService {
  final CollectionReference donors = FirebaseFirestore.instance.collection('donors');
  final CollectionReference requests = FirebaseFirestore.instance.collection('requests');

  Future<void> addDonor(String name, String bloodGroup, String city, String contact) {
    return donors.add({
      'name': name,
      'bloodGroup': bloodGroup,
      'city': city,
      'contact': contact,
      'createdAt': FieldValue.serverTimestamp()
    });
  }
}
