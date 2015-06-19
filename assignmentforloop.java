//Program to find all even number between 1000 to 1020
class even {
		public static void main(String[] felight) {
		int count;
		for(count=1000; count<=1020;count++) {
		if(count%2==0)
		System.out.println(count+"  is Even number ");
		}
		}
		}
		
//Program to find all odd number between 500 to 600
	class odd {
		public static void main(String[] felight) {
		int count;
		for(count=500;count<=600;count++) {
		if(count%2!=0)
		System.out.println(count+ " is odd number");
		}
		}
		}
		
//Program to find whether number is prime or not
		
	class prime {
		public static void main(String[] felight) {
		int num1=12,n;
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
		
//Program to find whether number divided by 6 or not
		
	class divideby6 {
		public static void main(String[] felight) {
		int num1=50;
		if(num1%6==0)
		System.out.println(num1+ " is divisible by 6");
		else
		System.out.println(num1+ " is not divisible by 6");
		}
		}
		
//Program to find all prime number between 100 to 200
		
	class prime1 {
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
		