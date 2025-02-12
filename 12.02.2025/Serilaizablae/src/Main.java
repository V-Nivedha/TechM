import java.io.*;

class Employee implements Serializable {

    int Eno;
    String Ename;
    transient String email;

    public Employee(int Eno, String Ename, String email) {
        this.Eno = Eno;
        this.Ename = Ename;
        this.email = email;
    }
}

public class Main {
    public static void main(String[] args)  {
        Employee emp = new Employee(101, "John Doe", "john.doe@example.com");
    try{
FileOutputStream filename=new FileOutputStream("employee.txt");

        ObjectOutputStream out = new ObjectOutputStream(filename) ;
            out.writeObject(emp);
            System.out.println("Object has been serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try{

            //Creating stream to read the object
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("employee.txt"));
            Employee s=(Employee)in.readObject();
            //printing the data of the serialized object
            System.out.println(s.Eno+s.email+s.Ename);
            //closing the stream
            in.close();
        }catch(Exception e){System.out.println(e);}
    }}


