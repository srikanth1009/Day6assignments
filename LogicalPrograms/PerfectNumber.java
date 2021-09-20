package LogicalPrograms;
//Java program to check if a given
	// number is perfect or not
import java.util.Scanner;
public class PerfectNumber {
	    // Returns true if n is perfect
	   static  int n= 6;
	    // To store sum of divisors
	   static int sum = 1;
	   
	    public static void main(String args[]){
	    	Scanner sc = new Scanner(System.in);
		      System.out.println("Enter a number ::");
		      n = sc.nextInt();
	    // Find all divisors and add them
	    for (int i = 2; i * i <= n; i++)
	    {
	        if (n % i==0)
	        {
	            if(i * i != n)
	                sum = sum + i + n / i;
	            else
	                sum = sum + i;
	        }
	    }
	    // If sum of divisors is equal to
	    // n, then n is a perfect number
	    if (sum == n && n != 1)
	        
	    System.out.println( n +
                " is a perfect number");
	    else
	    	 System.out.println( n +
	                 " is not a perfect number");
	    }
    }
