package fizzbuzz;
import java.util.*;

public class FizzBuzz {
	public static void main(String[] args){
		int num;
		Scanner inputScan = new Scanner(System.in);
		System.out.println("Enter number to be checked : ");
		num = inputScan.nextInt();
		
		if(num%3 != 0 && num%5 != 0){
			System.out.println(num);				
		}
		else if(num%3 == 0 && num%5 ==0){
			System.out.println("Fizz Buzz");
		}
		else if(num%3 == 0){
			System.out.println("Fizz");
		}
		else {
			System.out.println("Buzz");
		}
		
			
	}
}
