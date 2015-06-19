
//Program to convert fahrenheit to celcius
class fahtocel {
	public static void main(String[] felight) {
	int fah=100;
	double cel=(fah-32)*(5.0/9);
	System.out.println(fah+ " degree farenheit is equals to " +cel+ " degree celcius");
	}
}

//Program to convert celcius to fahrenheit
class celtofah {
		public static void main(String[] felight) {
		double cel=37.777777777777778;
		double fah=(cel*9.0/5)+32;
		System.out.println(cel+ " degree celcius is equal to " +fah+ " degree fahrenheit");
		}
}
class fib {
	public static void main(String[] felight) {
	int n1=0,n2=1,x=10;
	int n;
	System.out.println(n1);
	System.out.println(n2);
	for(int i=0;i<x-2;i++) {
	n=n1+n2;
	n1=n2;
	n2=n;
	System.out.println(n+" ");
	}
	}
	}
	