import java.util.Scanner;

class QS

{
 
 public void quick_sort(int []a,int first,int last)
 
 {
  
  int i,j,pivot,temp;
  
  if(first<last)
  
  {
   
  pivot=a[first];
   
  i=first;
   
  j=last;
   
  while(i<j)
  
  {
   
   while(a[i]<=pivot && i<last)
   
   {
    
    i++;
   
   }
   
   while((a[j]>=pivot) && (j>first))
   
   {
   
     j--;
   
   }
   
   if(i<j)
   
   {
    
   temp=a[i];
    
   a[i]=a[j];
    
   a[j]=temp;
   
   }
  
  }
  
  temp=a[j];
  
  a[j]=a[first];
  
  a[first]=temp;
   
  quick_sort(a,first,j-1);
  
  quick_sort(a,j+1,last);
 
 }

 }
}
class QuickSort

{
 
 public static void main(String[]args)
 
 {
  
  QS q=new QS();
  
  Scanner s=new Scanner(System.in);
  
  System.out.print("ENTER THE NO.OF ELEMENTS:");
  
  int n=s.nextInt();
  
  int a[]=new int[n];
  
  System.out.println("ENTER THE ARRAY:");
  
  for(int i=0;i<n;i++)
  
  {
   
   a[i]=s.nextInt();
   
  }
  
  int first=0;
  
  int last=n-1;
  
  q.quick_sort(a,first,last);
  
  System.out.println(" THE SORTED ARRAY IS:");
  
  for(int i=0;i<n;i++)
  
  {
   
  System.out.print(a[i]+" ");
  
  }
 
 }

}



  
   
   
  