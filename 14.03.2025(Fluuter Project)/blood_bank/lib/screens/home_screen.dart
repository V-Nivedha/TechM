import 'package:flutter/material.dart';
import '/localization/app_localizations.dart';
import 'donor_list_screen.dart';
import 'request_blood_screen.dart';
import 'add_donor_screen.dart';
import 'add_request_screen.dart';
import 'blood_bank_screen.dart'; 

class HomeScreen extends StatelessWidget {
  final Function(Locale) setLocale;

  const HomeScreen({super.key, required this.setLocale});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text(
          AppLocalizations.of(context)!.translate('bloodBankHome'),
          style: const TextStyle(fontWeight: FontWeight.bold),
        ),
        backgroundColor: Colors.redAccent,
        elevation: 0,
        actions: [
          PopupMenuButton<Locale>(
            onSelected: setLocale,
            itemBuilder: (context) {
              return [
                const PopupMenuItem(value: Locale('en'), child: Text('English')),
                const PopupMenuItem(value: Locale('ta'), child: Text('தமிழ்')),
                const PopupMenuItem(value: Locale('hi'), child: Text('हिन्दी')),
              ];
            },
            icon: const Icon(Icons.language, color: Colors.white),
          ),
          IconButton(
            icon: const Icon(Icons.logout, color: Colors.white),
            onPressed: () {
              Navigator.pushReplacementNamed(context, '/login');
            },
          ),
        ],
      ),
      body: Column(
        children: [
          SizedBox(
            width: double.infinity,
            height: 230,
            child: Image.network(
              'https://t3.ftcdn.net/jpg/01/13/13/30/360_F_113133044_6HtBFqhVhcnqS8R1urUV0VKBVh594GJ0.jpg',
              fit: BoxFit.cover,
              errorBuilder: (context, error, stackTrace) {
                return const Icon(Icons.image_not_supported, size: 80, color: Colors.grey);
              },
            ),
          ),
          const SizedBox(height: 100),
          Expanded(
            child: Padding(
              padding: const EdgeInsets.symmetric(horizontal: 16.0),
              child: Column(
                children: [
                  _buildMenuCard(
                    context,
                    icon: Icons.people,
                    label: AppLocalizations.of(context)!.translate('viewDonors'),
                    onTap: () => Navigator.push(
                      context,
                      MaterialPageRoute(builder: (_) => const DonorListScreen()),
                    ),
                  ),
                  _buildMenuCard(
                    context,
                    icon: Icons.local_hospital,
                    label: AppLocalizations.of(context)!.translate('requestBlood'),
                    onTap: () => Navigator.push(
                      context,
                      MaterialPageRoute(builder: (_) => const RequestBloodScreen()),
                    ),
                  ),
                  _buildMenuCard(
                    context,
                    icon: Icons.person_add,
                    label: AppLocalizations.of(context)!.translate('addDonor'),
                    onTap: () => Navigator.push(
                      context,
                      MaterialPageRoute(builder: (_) => const AddDonorScreen()),
                    ),
                  ),
                  _buildMenuCard(
                    context,
                    icon: Icons.bloodtype,
                    label: AppLocalizations.of(context)!.translate('addBloodRequest'),
                    onTap: () => Navigator.push(
                      context,
                      MaterialPageRoute(builder: (_) => const AddRequestScreen()),
                    ),
                  ),
                  _buildMenuCard(
                    context,
                    icon: Icons.local_pharmacy,
                    label: AppLocalizations.of(context)!.translate('bloodBanks'),
                    onTap: () => Navigator.push(
                      context,
                      MaterialPageRoute(builder: (_) => const BloodBanksScreen()),
                    ),
                  ),
                ],
              ),
            ),
          ),
        ],
      ),
    );
  }

  Widget _buildMenuCard(
    BuildContext context, {
    required IconData icon,
    required String label,
    required VoidCallback onTap,
  }) {
    return Card(
      shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(10)),
      elevation: 4,
      margin: const EdgeInsets.symmetric(vertical: 10),
      child: ListTile(
        leading: Icon(icon, color: Colors.redAccent),
        title: Text(
          label,
          style: const TextStyle(fontSize: 18, fontWeight: FontWeight.w500),
        ),
        trailing: const Icon(Icons.arrow_forward_ios, color: Colors.redAccent),
        onTap: onTap,
      ),
    );
  }
}
