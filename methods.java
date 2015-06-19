class methodsprgm {
public static  void main(String[] felight) {
	int res=add(100,24);
	System.out.println(res);
	int res6=add(100,100);
	System.out.println(res6);
	double res1=addd(14789,24587);
	System.out.println(res1);
	double res3=speed(2.5,100.45);
	System.out.println(res3);
	double res4=area(20);
	System.out.println(res4);
	double res5=fact(4);
	System.out.println(res5);
	boolean res7=even(9);
	System.out.println(res7);
	boolean res8=odd(8);
	System.out.println(res8);
	boolean res9=pallindrom(15571);
	System.out.println(res9);
	boolean res10=divideby6(66666);
	System.out.println(res10);
	double res11=hour(3600);
	System.out.println(res11);
	int res12=digit(258958);
	System.out.println(res12);
	int res13=hundred(1414878);
	System.out.println(res13);
	double res14=runrate(326.0,49.0,210.0,33.0);
	System.out.println(res14);
	int res15=make2num(147);
	int res16=makedecimal(7,6,2);
	int res17=sumdigit(879);
	System.out.println(res17);
	boolean res18=andboolean(true,false,true);
	System.out.println(res18);
	boolean res19=largerthanone(100,20,101);
	System.out.println(res19);
	boolean res20=ascendingorder(2,9,8);
	System.out.println(res20);
	}
	
	public static int add(int num1,int num2) {
	int sum=num1+num2;
	return sum;
	}
	public static double addd(double num1,double num2) {
	double sum=num1+num2;
	return sum;
	}
	public static double speed(double dist,double time) {
	double speed=dist/time;
	return speed;
	}
	public static double area(int rad) {
	double area=rad*rad*3.142;
	return area;
	}
		
	public static double fact(int num) {
	int n=num;
	while(num>1) {
	n=n*(num-1);
	num--;
	}
	return n;
	}
	
	public static boolean even(int num) {
	if(num%2==0) 
	return true;
	else
	return false;
	
	}
	public static boolean odd(int num) {
	if(num%2!=0) 
	return true;
	else
	return false;
	}

	public static boolean pallindrom(int num) {
	int n=num;
	int rmd,rev=0;
	while(num>0) {
	rmd=num%10;
	rev=rev*10+rmd;
	num=num/10;
	}
	if(rev==n)
	return true;
	else
	return false;
	}
	public static boolean divideby6(int num) {
	if(num%6==0)
	return true;
	else
	return false;
	}
	public static double hour(int seconds) {
	double hour=seconds/3600;
	return hour;
	}
	public static int digit(int num) {
	int n,count=0;
	while(num>0) {
	n=num%10;
	count++;
	num=num/10;
	}
	return count;
	}
	public static int hundred(int num) {
	int n=0,count=0;
	while(count!=3) {
	n=num%10;
	num=num/10;
	count++;
	}
	return n;
	}
	public static double runrate(double target,double maxover,double currentscore,double oversbowled) {
	double toscore=target-currentscore;
	double overleft=maxover-oversbowled;
	double runrate=toscore/overleft;
	return runrate;
	}
	public static int make2num(int num) {
	System.out.println(num+""+num);
	return(0);
	}
	public static int makedecimal(int num1,int num2,int num3) {
	System.out.println(num1+"."+num2+""+num3);
	return(0);
	}
	public static int sumdigit(int num) {
	int n=num,sum=0,rmd;
	while(n>0) {
	rmd=num%10;
	sum=sum+rmd;
	num=num/10;
	n--;
	}
	return sum;
	}
	public static boolean andboolean(boolean v1,boolean v2,boolean v3) {
	boolean res=(v1&&v2&&v3);
	return res;
	}
	public static boolean largerthanone(int num1,int num2,int num3) {
	boolean ans=((num1>num2)||(num1>num3))?true:false;
	return ans;
	}
	public static boolean ascendingorder(int num1,int num2,int num3) {
	boolean ans=(((num1<num2)&&(num1<num3))&&(num2<num3))?true:false;
	return ans;
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	