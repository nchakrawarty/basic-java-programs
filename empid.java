	
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
	
//Program to find even number between 0 to 100
	class even1 {
		public static void main(String[] felight) {
		int count=0;
		while(count<=100) {
		if(count%2==0)
		System.out.println(count);
		count++;
		}
		}
		}

//Program to find odd number between 100 to 200
	class odd1 {
		public static void main(String[] felight) {
		int count=100;
		while(count<=200) {
		if(count%2!=0)
		System.out.println(count);
		count++;
	}
	}
	}
	

//Program to print nothing 100 times	
	class c3 {
		public static void main(String[] felight) {
		int count=0;
		do {
		System.out.println("Nothing " +(count+1));
		count++;
		} while(count<100);
		}
		}
		
	
	class even {
		public static void main(String[] felight) {
		int count;
		for(count=1000; count<=1020;count++) {
		if(count%2==0)
		System.out.println(count+"  is Even number ");
		}
		}
		}
		
	class odd {
		public static void main(String[] felight) {
		int count;
		for(count=500;count<=600;count++) {
		if(count%2!=0)
		System.out.println(count+ " is odd number");
		}
		}
		}
		
	class prime {
		public static void main(String[] felight) {
		int num1=11,n;
		for(n=2;n<num1;n++) { 
		if(num1%n!=0) {
		System.out.println(num1+ " is prime");
		break;
		}
		else
		System.out.println(num1+ " is not prime");
		break;
		}
		}
		}
		
	class divideby6 {
		public static void main(String[] felight) {
		int num1=60;
		if(num1%6==0)
		System.out.println(num1+ " is divisible by 6");
		else
		System.out.println(num1+ " is not divisible by 6");
		}
		}
		
	class primenum {
		public static void main(String[] felight) {
		for(int num=100;num<=200;num++) {
		int count=0;
		for(int n=1;n<=num;n++) {
		if(num%n==0)
		count++;
		}
		if(count==2)
		System.out.println(num+ " is prime");
		}
		}
		}
		
	class divisibleby6 {
		public static void main(String[] felight) {
		for(int num=100;num<=200;num++) {
		if(num%6==0)
		System.out.println(num+ " is divided by 6");
		}
		}
		}
		