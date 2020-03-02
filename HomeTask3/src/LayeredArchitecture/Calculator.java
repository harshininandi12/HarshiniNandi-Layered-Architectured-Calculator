package LayeredArchitecture;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		
		boolean f = true;
		Scanner sc = new Scanner(System.in);
		while(f) {
			System.out.println("Enter your operands to perform Arithmetic Operations");
			ArithmeticOperations ao = new ArithmeticOperations();
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			System.out.println("Enter Operation (+, *, /, -, %)");
			char ch = sc.next().charAt(0);
			char con;
			if(ch == '+') {
				System.out.println(ao.addition(a, b));
				System.out.println("Do you want to perform any other operations? (Y/N)");
				con = sc.next().charAt(0);
				if(con == 'Y' || con == 'y') 
					f = true;
				else {
					f = false;
					System.out.println("Thank you! Have a Good Day");
				}
					
			} else if(ch == '-'){
				System.out.println(ao.subtraction(a, b));
				System.out.println("Do you want to perform any other operations? (Y/N)");
				con = sc.next().charAt(0);
				if(con == 'Y' || con == 'y') 
					f = true;
				else {
					f = false;
				System.out.println("Thank you! Have a Good Day");
				}
			} else if(ch == '*') {
				System.out.println(ao.multiplication(a, b));
				System.out.println("Do you want to perform any other operations? (Y/N)");
				con = sc.next().charAt(0);
				if(con == 'Y' || con == 'y') 
					f = true;
				else {
					System.out.println("Thank you! Have a Good Day");
					f = false;
				}
			} else if(ch == '/') {
				System.out.println(ao.division(a, b));
				System.out.println("Do you want to perform any other operations? (Y/N)");
				con = sc.next().charAt(0);
				if(con == 'Y' || con == 'y') 
					f = true;
				else {
					System.out.println("Thank you! Have a Good Day");
					f = false;
				}
			} else {
				System.out.println(ao.remainder(a, b));
				System.out.println("Do you want to perform any other operations? (Y/N)");
				con = sc.next().charAt(0);
				if(con == 'Y' || con == 'y') 
					f = true;
				else {
					System.out.println("Thank you! Have a Good Day");
					f = false;
				}
			}
		}
	}

}
