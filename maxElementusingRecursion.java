import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n;
	    System.out.println("Enter length of array :");
	    n=sc.nextInt();
	    int a[]=new int[n];
	   System.out.println("Enter array");

	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }
	    
		System.out.println("The maximum element in array is : "+ maxElement(a,n));
	}
	
	public static int maxElement(int[] a,int index) { //method maxElement to find maximum element of array
	    
	    //if array length is negative
       if (index > 0) {
	        return Math.max(a[index-1], maxElement(a, index-2));
	    } else {
	        return a[0];
	    }
   }
}
