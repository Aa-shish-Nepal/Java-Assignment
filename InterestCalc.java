import java.util.Scanner;
class InterestCalc{
     static int p;
    static float t;
    static float r;
    public static void main(String[] args)
    {
Scanner input=new Scanner(System.in);
System.out.println("enter principal");
 p=input.nextInt();
System.out.println("enter time");
 t=input.nextFloat();
System.out.println("enter rate");
 r=input.nextFloat();
float simpleinterest=(p*t*r)/100;
System.out.println("Simple Interest: "+simpleinterest);
  input.close();
 }
}