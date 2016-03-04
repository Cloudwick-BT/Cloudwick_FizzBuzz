package fizzbuzz;
import java.util.*;
import java.io.*;
public class FizzBuzz {
	public static void main(String[] args) throws IOException{
		int num;
		System.out.println("Enter number to be checked : ");

		Scanner inputScan = new Scanner(System.in);
		num = inputScan.nextInt();
		
		int temp = num;
		/* iteration */
		for(num = 1; num<=temp; num++){
			if(num%3 == 0 && num%5 ==0){
				System.out.print("Fizz Buzz, ");
			}
			else if(num%3 == 0){
				System.out.print("Fizz, ");
			}
			else if(num%5 == 0){
				System.out.print("Buzz, ");
			}
			else{
				System.out.print(num + ", ");
			}
		}
			
	}
}
