import java.util.List;

public  class InsertinArrayList {
    public static void main(String[] args) {
        List<String> colors = new java.util.ArrayList<>();
        colors.add("Red");
        colors.add("pink");
        colors.add("maroon");
        colors.add("grey");
        colors.add("black");

        for(String color:colors){
            System.out.print(color+" ");
        }
        colors.add(0,"Blue");
        System.out.println("\nAfter inserting element at 1st position");

        for(String color:colors){
            System.out.print( color+" ");
        }
    }
}
