import java.util.Scanner;
public class Main{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int i, j;
        int n = sc.nextInt();
        // upper half of the patternfor(i = 0; i < n; i++)
        {
            for(j = 0; j < (2 * n); j++)
            {
                if(i + j <= n - 1)  // upper left triangle
                    System.out.print("*");
                else
                    System.out.print(" ");
                if((i + n) <= j) // upper right triangle
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        // bottom half of the patternfor(i = 0; i < n; i++)
        {
            for(j = 0; j < (2 * n); j++)
            {
                if(i >= j)  // bottom left triangle
                    System.out.print("*");
                else
                    System.out.print(" ");
                if(i >= (2 * n - 1) - j)  // bottom right triangle
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
