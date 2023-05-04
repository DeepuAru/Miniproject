import java.util.Scanner;

public class MiniProject {

	public static void main(String[] args) {
		
		char repeat = 'y';
		Scanner sc = new Scanner(System.in);
		
		while (repeat == 'y' || repeat == 'Y') {
			
			System.out.println("1. Addition Program");
			System.out.println("2. Swap Program");
			System.out.println("3. evenodd finding");
			System.out.println("4. Printing Reverse");
			System.out.println("5. Printing table for each digit of given number");
			System.out.println("6. Palindrome");
			System.out.println("7. Prime number");
			System.out.println("8. Armstrong number");
			System.out.println("9.grade");
			System.out.println("10.months");
			System.out.println("11.positive number");
			System.out.println("12.marrige eligibility");

			
			System.out.println("Please select your choice of Program : ");
			
			int choice = sc.nextInt();

			switch(choice) {
				case 1:	addition(); break;
				case 2: swap(); break;
				case 3: evenodd(); break;
				case 4: reversenumber(); break;
				case 5: table(); break;
				case 6: Palindrome(); break;
				case 7: prime(); break;
				case 8:Armstrong();break;
				case 9:grade();break;
				case 10:months();break;
				case 11:positivenumber();break;
				case 12:marriageEligibility();break;
				
				
				default: System.out.println("Enter choice is wrong ...");
			}
			
			System.out.println("Do you want to continue ...." );
			repeat = sc.next().charAt(0);
		}
		
		System.out.println("******************Thanks for trying my Project .... Visit Again ... *********");
	}
	
	//marriage eligibility
	public static void marriageEligibility() {
		Scanner sc = new Scanner(System.in);
		System.out.println(" enter Gender");
		char mg = sc.next().charAt(0);  
		System.out.println(" enter Gender");
		char fg = sc.next().charAt(0); 
		System.out.println(" enter Male Age");
		int ma=sc.nextInt();
		System.out.println(" enter Female Age");
		int fa=sc.nextInt();
		boolean mf= false;
		boolean ff= false;
		
		
	if (mg!='m' || fg!='f') {
			System.out.println(" not accepted ");}

	else {
		if( mg=='m'&& ma>=24) {
			System.out.println("Male is Eligible");
			mf=true;
		}
		else {
			System.out.println("Male not eligible");
		}
		
		if (fg=='f'&& fa>=21) {
			System.out.println("Female is Eligible");
			ff=true;
		}
		else {
			System.out.println(" Female Not Eligible");
	    }
    }
	
	if (mf==true&& ff==true)
	{
		System.out.println("Congractulations");
	}
	else {
		System.out.println("Please wait for your eligibility");
		}
	}
	//End of marriage Eligibility
	
	//Positive Number program
	public static void positivenumber() {
		Scanner sc = new Scanner (System.in);
		System.out.println(" Enter a value ");
		int a= sc.nextInt();
		if (a>=0) {
			System.out.println(" positive number ");
		}
		else
		{
			System.out.println(" negative number ");
		
		}
	}
	//End of positive number program
	
	//Months program
	public static void months() {
		Scanner sc= new Scanner (System.in);
		System.out.println("Innput value for the month");
		
		int a= sc.nextInt();
		
		if (a<=11) {
			System.out.println("Month of the year");
			}
		
		if (a==1) {
			System.out.println("January");
		}
		
		else if (a==2) {
			System.out.println("February");
		}
		
		else if (a==3) {
			System.out.println("March");
		}
		else if (a==4) {
			System.out.println("April");
		}
		else if (a==5) {
			System.out.println("May");
		}
		else if (a==6) {
			System.out.println("June");
		}
		else if (a==7) {
			System.out.println("July");
		}
		else if (a==8) {
			System.out.println("August");
		}
		else if (a==9) {
			System.out.println("September");
		}
		else if (a==10) {
			System.out.println("October");
		}
		else if (a==11) {
			System.out.println("November");
		}
		else if (a==12) {
			System.out.println("December");
		}
		else {
			System.out.println("Incorrect value");
		}
		}
	//End of months program
	
		//Grade program
		public static void grade() {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter student marks");
		int s1= sc.nextInt();
		int s2= sc.nextInt();
		int s3= sc.nextInt();
		
		double avg= (s1+s2+s3) / 3.0;
		
		if ( s1>=35 && s2>=35 && s3>=35 ) {
			System.out.println("PASS");
			
			if (avg>=75) {
				System.out.println("Grade A");
			}
			else if (avg>=65 && avg<75) {
				System.out.println("Grade B");}
			else {
				System.out.println("Grade C");
			}
			
		} else {
				System.out.println("FAIL");
				System.out.println("GRADE F");
		
	}
		}
		//End of grade program
		
	//Armstrong program
		public static void Armstrong() {
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter any number");
		
		int n= sc.nextInt();
		int Armstrong=0;
		int temp;
		int duplicate=n;
		
		//Generating the Armstrong number
		
		for (; n!=0; n=n/10) {
			
			temp= n%10;
			Armstrong= Armstrong+(temp*temp*temp);		
		}
		
		//Printing value of Armstrong
		
		System.out.println("Armstrong number=" +Armstrong);
		
		//Printing the result
		
		if (Armstrong==duplicate) {
			System.out.println("Given number is Armstrong");}
		else {
			System.out.println("Given number is not an Armstrong");
		}
		
	}
	//End of Armstrong program 
	
		//prime number program
		public static void prime() {
			Scanner sc= new Scanner (System.in);
			System.out.println("Enter a value");
			
			int a= sc.nextInt();
			boolean flag= true;
			
			for (int i=2;i<a;i++) {
				if (a%i==0) {
					flag= false;
				}
			}
				if (flag) { System.out.println("Prime Number");
				}
				else {
					System.out.println("Not Prime");
				}
		}
		//End of prime number program
		
		//Palindrome program
	public static void Palindrome() {	
		Scanner sc = new Scanner (System.in);
		System.out.println(" enter any no:");

		int a= sc.nextInt();
		int dupe=a;
		int temp;
		int rev=0;
		
	for (;a!=0;a=a/10) {
		 temp= a%10;
		 rev= rev*10+temp;
	}
		 if (dupe==rev) {
			 System.out.println("number " +dupe+ " is a palindrome");
		 }
		 else
			 System.out.println("number " +dupe+ " is not a palindrome");
	}
	//End of Palindrome program
	
	//Digit table program
	public static void table() {	
		Scanner sc = new Scanner (System.in);
		System.out.println(" enter any no:");
		int a= sc.nextInt();
		int temp;
		int rev=0;
		
	for (;a!=0;a=a/10) {
		 temp= a%10;
		 rev= rev*10+temp;
	
	for (int i=1; i<=10;i++) {
    	System.out.println(temp+"*"+i+"="+temp*i);
		}
	}
}
	//End of digit table program
	
	//reverse program	
	public static void reversenumber() {	
		Scanner sc = new Scanner (System.in);
		System.out.println("enter any no:");
		int a= sc.nextInt();
		int temp;
		int rev=0;
		
	for (;a!=0;a=a/10) {
		 temp= a%10;
		 rev= rev*10+temp;
	}
	System.out.println("Revrse:"+ rev);
	}
	//End of reverse program
	
	//EvenOdd program
	public static void evenodd() {
		
		int a=10, b=5;
		
		if (a%2==0 && b%2==0) {
		System.out.println("Given values are even");
		}
		else if (a%2!=0 && b%2==0) {
			System.out.println(a+ " is odd and " + b+ " is even");
		}
		else if (b%2!=0 && a%2==0) {
			System.out.println(b+ " is odd and " + a+ " is even");
		}
		else {
			System.out.println("Given values are odd");
		}
}
		//End of even odd program

		//swap program
	public static void swap() {
		int a = 10,b=20;
		
		System.out.println("Before swap a="+a+" and b="+b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swap a="+a+" and b="+b);
	}
	//End of Swap Program
	
	/*
	 * This is function is of addition two variables...
	 */
	public static void addition() {
		int a = 10, b = 20;
		int c = a+b;
		
		System.out.println(c);
	}
	//Ended addition program.
}
