import java.util.List;

public  class RemoveElement {
    public static void main(String[] args) {
        List<String> colors = new java.util.ArrayList<>();
        colors.add("Red");
        colors.add("pink");
        colors.add("maroon");
        colors.add("grey");
        colors.add("black");

        for(String color:colors){
            System.out.println(color);
        }
        colors.remove(2);

        System.out.println("\nAfter removing \n");

        for(String color:colors){
            System.out.print( color+" ");
        }
    }
}
