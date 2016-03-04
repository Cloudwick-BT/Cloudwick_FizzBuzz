package fizzbuzz;
import java.util.*;
public class FizzBuzz {
	public static void main(String[] args) {
		int num=0;
		System.out.println("Enter number to be checked : ");
		Scanner inputScan = new Scanner(System.in);

		try {
			num = inputScan.nextInt();
		}
		catch (InputMismatchException e){
			System.out.print("Input need to be an integer");
		}
		
		inputScan.close();
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
