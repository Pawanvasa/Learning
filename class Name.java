import java.util.Scanner;

class Name
{
	public static void main(String[] args)
		{
			System.out.println("Enter first number:");
			Scanner sc = new Scanner(System.in);
            sc.close();
			int a=sc.nextInt();
			Scanner sc1 = new Scanner(System.in);
			int b=sc1.nextInt();
            sc1.close();
			int c=a+b;
			System.out.println("Addition of two numbers is:"+c);
		}
}