import java.util.Scanner;

public class fewPrograms {
	
	Scanner sc = new Scanner(System.in);
	//function to checkPalindrome
	public void checkPalindrome()  {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if its a palindrome:");
		num = sc.nextInt();
		
		int reverseNum = 0, remain;
	    
	    int origNum = num;
	    while (num != 0) {
	      remain = num % 10;
	      reverseNum = reverseNum * 10 + remain;
	      num /= 10;
	    }
	    if (origNum == reverseNum) {
	      System.out.println(origNum + " is Palindrome.");
	    }
	    else {
	      System.out.println(origNum + " is not Palindrome.");
	    }
		
		
	}
	
	//function to printPattern
	public void printPattern() {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to print its pattern:");
		num = sc.nextInt();
		
		for (int i=num;i>0;i--)
		{	
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
				
		
	}
	
	//function to check no is prime or not
	public void checkPrimeNumber() {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if its a prime number:");
		num = sc.nextInt();
		
	    boolean isNotPrime = false;
	    for (int i = 2; i <= num / 2; ++i) 
	    {
	      if (num % i == 0) {
	    	  isNotPrime = true;
	        break;
	      }
	    }

	    if (!isNotPrime)
	      System.out.println(num + " is a prime number.");
	    else
	      System.out.println(num + " is not a prime number.");
	}
	
	// function to print Fibonacci Series
	public void printFibonacciSeries() {
		//initialize the first and second value as 0,1 respectively.
		int first = 0, second = 1, third;
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of fibonacci series needed:");
		num = sc.nextInt();
		
		System.out.print(first+" "+second);
		
		for(int i=2;i<num;++i)
		{
			third=first+second;    
			System.out.print(" "+third);    
			first=second;    
			second=third;    
		}
		System.out.println();
		
	}
	
	//main method which contains switch and do while loop
	public static void main(String[] args) {
		fewPrograms obj = new fewPrograms();
        int choice;

        Scanner sc = new Scanner(System.in);
        do {

	        	System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"
	        	+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"
	        	+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
	        	System.out.println();
	        	choice = sc.nextInt();
	        	switch (choice) {
		        	case 0:
		        		choice = 0;
		        		break;
		        	case 1: {
		        		obj.checkPalindrome();
		        		}
		        		break;
		        	case 2: {
		        		obj.printPattern();
		        		}
		        		break;
		        	case 3: {
		        		obj.checkPrimeNumber();
		        		}
		        		break;
		        	case 4: {
		        		obj.printFibonacciSeries();
		        		}
		        		break;
		        	default:
		        		System.out.println("Invalid choice. Enter a valid no.\n");
	        	}
	        }while (choice != 0);
	
	        System.out.println("Exited Successfully!!!");
	        sc.close();
	
	}

}
