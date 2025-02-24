public class Main {
    public static void main(String[] args) {
String name ="nivedha vinayagam";
StringBuilder name1=new StringBuilder();
for(int i =0;i<name.length();i++)
{
    if(i%2==0){
    name1.append(Character.toUpperCase(name.charAt(i)));}
else {
    name1.append(name.charAt(i));
    }
}

System.out.println(name1.toString());
    }
}