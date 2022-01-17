import java.util.*;
class Binarysearch
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter for n:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements to the array :");
		for(int i=0; i<n;i++)
		{
			 arr[i]=sc.nextInt();
		}
		System.out.println("Enter element to be search :");
		 int x= sc.nextInt();
		int ans= binarySearch1(arr,0,n-1,x);
		System.out.println("Searched item stored in :" + ans);

	}
		 static int binarySearch1(int arr[],int l,int r,int x)
		{
			 while(l<=r)
			    {
				 int mid= (r-l)/2 +l;
		                 if(arr[mid]==x)
		 		 {
		  		    return mid;
			         }
		                  if(x < arr[mid])
		                 {
		                    r= mid-1;
		 		 }
		  		 else
		 		 {
		   		   l=mid+1;
		 		 }
	        
			    }
		         return -1;
		}

		
			
	}