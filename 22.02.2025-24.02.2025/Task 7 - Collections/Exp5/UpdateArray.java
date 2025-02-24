import java.util.List;

public  class UpdateArray {
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
        colors.add(2,"Blue");
        System.out.println("\nAfter updating \n");

        for(String color:colors){
            System.out.print( color+" ");
        }
    }
}
