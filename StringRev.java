import java.util.Scanner;
class StringRev{
static char ch;
static String reversed=" ";
  public static void main(String[] args){
Scanner sc=new Scanner(System.in);
//input the string
System.out.print("enter a string    : ");
String input=sc.nextLine();
//reverse the string
for(int i=0;i<input.length();i++){
    ch=input.charAt(i);//extracting each character
    reversed=ch+reversed;    
}
System.out.println("Reversed word: "+ reversed);
  }
}