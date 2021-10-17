import java.util.Scanner;
public class Frequency
{
 public static void main(String[]args)
 {
  char ch;
  Scanner s=new Scanner(System.in);
  System.out.print("ENTER THE STRING:");
  String str=s.nextLine();
  String str1=str.toLowerCase();
  System.out.print("ENTER THE CHARACTER:");
  ch=s.nextLine().charAt(0);
  int frequency=0;
  for(int i=0;i<str.length();i++)
  {
   if(ch==str.charAt(i))
   {
    frequency++;
   }
  }
  System.out.println("FREQUENCY OF '"+ch+"'="+frequency);
 }
}

 
