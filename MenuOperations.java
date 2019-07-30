import java.util.Scanner;

public class MenuOperations
{
	
	Scanner sc = new Scanner(System.in);
	
	//finding Factorial Operation using for loop
	public void FactorialNumber() 
	{
		int i,factNum=1,number;
		System.out.println("Enter a number"); 
		number=sc.nextInt(); //Read the number to calculate factorial
		
		for(i=1;i<=number;i++)
		{
			factNum = factNum*i;
		}
		System.out.println(+factNum);
		
	}

	//finding Fibonacci Series using for loop
	public void Fibonacciseries()
	{
		int firstNo=0,secondNo=1,sum;
		int count;
		
		System.out.println("Enter the Number");
		count = sc.nextInt();//Read the number to calculate fibonacci
		
		System.out.println(firstNo);
		System.out.println(secondNo);
		
		for(int i=2;i<count;i++) //loop start from 2nd value  
		{
			sum=firstNo+secondNo;
			System.out.println(+sum);
			firstNo=secondNo;
			secondNo=sum;
			
		}
	}
	
	//finding PrimeNumber using while and if condition
	public void PrimeNumber()
	{
		int num;
		System.out.println("Enter the Number");
		num = sc.nextInt();// read input to calculate prime number
		int count=0;
		while(count!=2)
		{
			num++;
			count=0;
			int i=1;
			while(i<=num)
			{
				if(num%i==0)
				{
					count++;
				}
				i++;
			}
			if(count==2)
			{
				System.out.println(num);
			}
			
		}
		/*for(int i=2;i<=num;i++)
		{
			if(num%i!=0)
			break;
			System.out.println(+num);
		}
		//System.out.println(+num);*/
		
	}
		
}
	
	
		

	
