import java.util.Scanner;
class Sumofdiagonals
{

  public static void main(String args[])
  {
    int[][] A=new int[3][3];
    int Sum=0;
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<3;i++)
    {
      for(int j=0;j<3;j++)   
      {
         A[i][j]=sc.nextInt();
         System.out.println("\n");
      }
     System.out.println("\t");
    }


    for(int i=0;i<3;i++)
    {
      for(int j=0;j<3;j++)   
      {
          if(i==j)
          {
             Sum=Sum+A[i][j];
           }
      }
     
     }
      System.out.println("\nSum of diagonals:"+Sum);
   
   }
}