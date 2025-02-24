import java.util.List;

public  class IteratingList {
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
    }
}
