package Guvi;
import java.util.Scanner;
public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.println("Please enter the first number");
		num1 = sc.nextInt();
		System.out.println("Please enter the Second number");
		num2 = sc.nextInt();
		System.out.println("Prime number: ");
		for (int i=num1; i <= num2; i++ ){
		int j;
		for (j=2; j<i; j++){
		int n = i%j;
		if (n==0){
		break;
		}
		}
		if(i == j){
		System.out.print(" "+i);
		}
		}
		System.out.println();
		}
		


	}


