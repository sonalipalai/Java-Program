//This is the modified bubble sorting algorithm
import java.util.*;
class BubbleSort
{
  public static void main(String args[])
  {
   //int arr[]={42,23,74,11,65,58,94,36,99,87}
//let's take a user define array
	  Scanner ob = new Scanner(System.in);
	  System.out.println("Enter the value of n: ");
	  int n = ob.nextInt();
	  int arr[] = new int[n];
	  for(int i=0; i<n; i++){
	  	arr[i] = ob.nextInt();
	  }
       bubblesort(arr);
  }
  static void bubblesort(int arr[])
  {
	int last= arr.length;
    for(int i=0; i<arr.length-1;i++)
    {
	int exchange=0;
	for(int j=0;j<last-1;j++)
	{
	  if(arr[j]>arr[j+1])
	  {
	    int temp=arr[j];
	    arr[j]=arr[j+1];
	    arr[j+1]=temp;
	    exchange=exchange+1;
          }
	}
 	  if(exchange==0)
          {
     	   System.out.println(Arrays.toString(arr));
	   break;
	  }
	  else
          last=last-1;
        
     }
      
   }
}
 	  
