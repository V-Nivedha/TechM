import com.sun.source.tree.Tree;

import java.util.*;

public class SetExample {
    public static void main(String args[]) {


        LinkedHashSet<String> ls = new LinkedHashSet<>();

        HashSet<Integer> hs = new HashSet<>();

        TreeSet<Float> ts = new TreeSet<>();
        setSample(hs);
        setSample(ls);
        setSample(ts);




}
public static void setSample(HashSet<Integer> hs){
    hs.add(20);
    hs.add(49);
    hs.add(56);
    hs.add(36);
    hs.add(7);
    hs.add(80);
    hs.add(144);
    hs.add(1);

    System.out.print("size of the HAshSet is : "+hs.size()+"\n");
    System.out.println("hashset values are " + hs);
    hs.remove(20);
    System.out.println("After removing " +hs);
    System.out.println("hashset values are " + hs);
    System.out.println("elements divisible by 7");
    for(Integer x : hs){
        if(x%7==0)
            System.out.print(x+" ");

    }
    System.out.println();
    System.out.println("____________________________\n\n");
}
    public static void setSample(LinkedHashSet<String> ls){
        ls.add("A");
        ls.add("B");
        ls.add("ABCD");
        ls.add("SP");
        ls.add("AIA");
        ls.add("programming");
        ls.add("c");
        ls.add("nivi");
        System.out.print("size of the LinkedHAshSet is : "+ls.size()+"\n");
        System.out.println("Linkedhashset values are " +ls);
        ls.remove("B");
        System.out.println("After removing " +ls);
        System.out.println("Lnkedhashset values are " + ls);
        System.out.println("elements that have size more than 5");
        for(String x : ls){
            if(x.length()>5)
                System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("____________________________\n\n");
    }

    public static void setSample(TreeSet<Float> ts){
        ts.add(21.2f);
        ts.add(12.3f);
        ts.add(15.5f);
        ts.add(68.8f);
        ts.add(73.3f);
        ts.add(22.33f);
        ts.add(19.3f);
        ts.add(2.34f);
        System.out.print("size of the HAshSet is : "+ts.size()+"\n");
        System.out.println("hashset values are " + ts);
        ts.remove(12.3f);
        System.out.println("After removing " +ts);
        System.out.println("hashset values are " + ts);
        System.out.println("elements greater than 20");
        for(Float x : ts){
            if(x>20)
                System.out.print(x+" ");
        }

        System.out.println();
        System.out.println("____________________________\n\n");
    }


}