package LogicalPrograms;
import java.util.Scanner;
   	   public class PrimeNumber {
	   public static void main(String args[]){
	      int loop, number;
	      int prime = 1;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number ::");
	      number = sc.nextInt();
	     
	      for(loop = 2; loop < number; loop++) {
	         if((number % loop) == 0) {
	            prime = 0;
	         }
	      }
	      if (prime == 1)
	         System.out.println(number+" is a prime number");
	      else
	         System.out.println(number+" is not a prime number");
	   }
	}
