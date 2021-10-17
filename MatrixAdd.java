class MatrixAdd
{
public static void main(String args[])
{
    int a[][]={{1,2},{4,5}};
    int b[][]={{1,2},{4,5}};
    int result[][]=new int[2][2];

    for(int i=0;i<2;i++)
    {
      for(int j=0;j<2;j++)
      {
       result[i][j]=a[i][j]+b[i][j];
       System.out.println(result[i][j]+" ");
      }
   
    System.out.println();
   }
}
}
