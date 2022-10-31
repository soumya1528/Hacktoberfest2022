import java.util.Scanner;
 public class Addition{
	
			public static void main(String[]args)
	{  
		//int num1, num2, num3;
		int sum;
		System.out.println("Enter Any Three Numbers: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();                  // Inputs from user 
		int num3 = sc.nextInt();

		sum = num1 + num2 + num3;                    //
		System.out.println("The Addition of three No.s is :" +sum);
		//System.out.println(sum);
	}
}
