import java.util.Scanner;

public class MenuDrivenProgram 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int option;
		//String s="";
		Scanner sc=new Scanner(System.in);
		do {
	    System.out.println("=====================");
		System.out.println("\tMENU\t\t");
		System.out.println("=====================");
		System.out.println("1.Factorial Number");
		System.out.println("2.Fibonacci Series");
		System.out.println("3.Prime number");
		System.out.println("\nEnter your option");
		option = sc.nextInt();
		
		//create object to call MenuOperations
		MenuOperations mn = new MenuOperations();
		
		switch(option)
		{
		
			case 1:
				mn.FactorialNumber();
				break;
			case 2:
				mn.Fibonacciseries();
				break;
			case 3:
				mn.PrimeNumber();
				break;
			default:
				System.out.println("invalid option");
					
		}
		//System.out.println("continue(y/n)");
		//s=sc.next();
	
		}while(true);
	}
}
