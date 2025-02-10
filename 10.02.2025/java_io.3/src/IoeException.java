import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class IoeException {
public static void main(String args[]) throws IOException{
    fetchDataWithBufferedStream();
    IoeException obj=new IoeException();
    obj.gatherInputUsingScannerPro();
}

    static void fetchDataWithBufferedStream() throws IOException {

        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Kindly provide your input:");

        String inputFromUser = bufferedReader.readLine();


        System.out.println("You have provided: " + inputFromUser);
    }

    void gatherInputUsingScannerPro() {
        // Using Scanner for user input
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please provide your text:");
        String textInput = inputScanner.nextLine();
        System.out.println("The text you have entered: " + textInput);

        System.out.println("Now, kindly enter an integer:");
        int integerInput = inputScanner.nextInt();
        System.out.println("The integer you entered: " + integerInput);

        System.out.println("Lastly, please provide a decimal number:");
        float floatInput = inputScanner.nextFloat();
        System.out.println("The decimal number you entered: " + floatInput);
    }
}