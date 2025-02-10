
final class FinalClass {
    public void display() {
        System.out.println("This is a final class.");
    }
}

class ParentClass {

    final int finalVariable = 100;


    final void finalMethod() {
        System.out.println("This is a final method.");
    }
}


public class Main {
    public static void main(String[] args) {
        ParentClass obj = new ParentClass();
        System.out.println("Final Variable: " + obj.finalVariable);
        obj.finalMethod();

        FinalClass finalObj = new FinalClass();
        finalObj.display();
    }
}
