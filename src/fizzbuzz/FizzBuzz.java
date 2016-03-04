package fizzbuzz;
import java.util.*;


public class FizzBuzz {
	public static void main(String[] args) {
		int num=0;
		System.out.println("Enter number (greater than 0) to be checked : ");
		Scanner inputScan = new Scanner(System.in);

		try {
			num = inputScan.nextInt();
			if (num <=0){
				System.out.print("Number should be positive and greater than 0");
				return;
			}
		}
		catch (InputMismatchException e){
			System.out.print("Input need to be an integer");
		}
		finally {
			inputScan.close();
		}
		
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
