import java.util.Scanner;

public class swap_integers {
	
  /*
  
  Swap the value of integers without using a third variable.
  
  */
  
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number (a): ");
		int a = sc.nextInt();
		System.out.print("Enter the second number (b): ");
		int b = sc.nextInt();
		
		System.out.println("The original values are: a = " + a + " and b = " + b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("The swapped values are: a = " + Math.abs(a) + " and b = " + Math.abs(b));
		
		
		
	}

}
