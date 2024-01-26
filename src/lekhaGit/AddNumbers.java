package lekhaGit;
import java.util.Scanner;

public class AddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		scanner.close();
		double tsum =num1+num2;
		System.out.println("Addition of 2 numbers "+ tsum);
		}

}
