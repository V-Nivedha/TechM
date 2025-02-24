
import java.util.Scanner;


public class Employee {
    int empid;
    String empName;
    double sal;
    int yearsWorked;

    public  void getEmployeeDetails()
    {
    System.out.println("empid: "+empid);
    System.out.println("empName: "+empName);
    System.out.println("Salary: "+sal);
    System.out.println("Experience:  "+yearsWorked+" years");

    }

    public  void setEmployeeDetails(int id,int years,double salary,String name){
        empid=id;
        empName=name;
        sal=salary;
        yearsWorked = years;



    }
    public  void getLosnEligiblity(){
        double annualSal = sal*12;
        System.out.println("Annual salary = "+annualSal);
    if(yearsWorked>=5){
        if(annualSal>=600000&&annualSal<1000000){
            System.out.println("Loan amount of Rs. 2 Lakhs is granted ");

        }
        else if(annualSal>=1000000&&annualSal<1500000){
            System.out.println("Loan amount of Rs. 5 Lakhs is granted ");

        }
        else if(annualSal>=1500000){
            System.out.println("Loan amount of Rs. 7 Lakhs is granted ");
        }
        else{
            System.out.println("Not eligible for Loan");
        }
    }
    else{
        System.out.println("Not eligible for Loan");
    }
    }

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("enter the employee's id");
       int id= sc.nextInt();

        System.out.println("enter the employee's name");
        sc.nextLine();
        String name=sc.nextLine();

        System.out.println("enter the employee's salary");
        double salary = sc.nextDouble();

        System.out.println("enter the employee's Experience ");
        int exp=sc.nextInt();

        Employee emp = new Employee();
        emp.setEmployeeDetails(id, exp,salary,name);
        emp.getEmployeeDetails();
        emp.getLosnEligiblity();

    }
}