	
//Program to find leap year
class leapyear {
	public static void main(String[] felight) {
	int year1=2006, year2=2016;
	boolean flag1= ((year1%4==0 && year1%100!=0) || (year1%400==0));
	boolean flag2= ((year2%4==0 && year2%100!=0) || (year2%400==0));
	if(flag1) {
	System.out.println(year1+ " is Leap year");
	}
	else {
	System.out.println(year1+ " is not leap year");
	}
	if(flag2)
	System.out.println(year2+ " is leap year");
	else
	System.out.println(year2+ " is not leap year");
	}
	}

	
//Program to find whether the number is even or odd
	class evenodd {
		public static void main(String[] felight) {
		int num=35;
		boolean flag= (num%2==0);
		if(flag)
		System.out.println(num+ " is an even number");
		else
		System.out.println(num+ " is an odd number");
		}
		}
		
//Program to find the number is pallindrome or not
	
	class pallindrom {
		public static void main(String[] felight) {
		int num1= 1141;
		int n=num1,reverse=0,rmndr;
		while(num1>0) {
		rmndr=num1%10;
		reverse=reverse*10+rmndr;
		num1=num1/10;
		}
		boolean flag=(reverse==n);
		if(flag)
		System.out.println("Number is pallindrom");
		else
		System.out.println(" Not pallindrome");
		}
		}