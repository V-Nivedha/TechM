import com.sun.source.tree.Tree;

import java.util.*;


public class CollectionMap {
    public static void main(String args[]){
        Hashtable<Integer, String> ht = new Hashtable<>();
        hashTable(ht);
        HashMap<Integer, String> hm = new HashMap<>();
        hashMap(hm);
        LinkedHashMap<Integer,String> lm = new LinkedHashMap<>();
        linkedHashMap(lm);
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        treeHashMap(tm);
    }

    public static void hashTable(Hashtable<Integer,String> ht){
        ht.put(1, "java");
        ht.put(2, "python");
        ht.put(3, "c++");
        System.out.println("------HashMap------");
        System.out.println("Initial HasTable: " + ht);

        ht.put(2, "Kotlin");
        System.out.println("Updated Table: " + ht);

        ht.remove(1);
        System.out.println("Mappings after removal: " + ht);

        System.out.println("Map traversal:");
        for (Map.Entry<Integer, String> e : ht.entrySet()) {
            System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
        }
    }

    public static void hashMap(HashMap<Integer,String> hm){
        hm.put(1, "Integer");
        hm.put(2, "Float");
        hm.put(3, "String");
        System.out.println("\n------HashMap------");
        System.out.println("Initial HashMap: " + hm);

        hm.put(2, "Double");
        System.out.println("Updated Map: " + hm);

        hm.remove(1);
        System.out.println("Mappings after removal: " + hm);

        System.out.println("Map traversal:");
        for (Map.Entry<Integer, String> e : hm.entrySet()) {
            System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
        }
    }
    public static void linkedHashMap(LinkedHashMap<Integer,String> lhm){
        lhm.put(1,"Nivi");
        lhm.put(2,"pooja");
        lhm.put(3,"preethi");
        lhm.put(4,"pavi");
        System.out.println("\n------LinkedHashMap------");
        System.out.println("Initial LinkedHashMap: " + lhm);

        lhm.put(1, "krish");
        System.out.println("Updated Map: " +lhm);

        lhm.remove(1);
        System.out.println("Mappings after removal: " + lhm);

        System.out.println("Map traversal:");
        for (Map.Entry<Integer, String> e : lhm.entrySet()) {
            System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
        }
    }
    public static void treeHashMap(TreeMap<Integer,Integer> tm){
        tm.put(5,6);
        tm.put(9,2);
        tm.put(2,6);
        tm.put(7,126);

        System.out.println("\n------TreeHashMap------");
        System.out.println("TreeMAp Elements : " + tm);
        tm.replace(2,125);
        System.out.println("Updated Map"+tm);
        tm.remove(4);
        System.out.println("Updated map after removing "+tm);
        for(Map.Entry<Integer,Integer> ele: tm.entrySet()){
            System.out.println("Key: " + ele.getKey() + " Value: " + ele.getValue());
        }
    }
}