
public class returnValues {
	static void myMethod() {
		System.out.println("Hey");
		
	}
	static int myMethod(int a) {
		return a;
	}
	static double myMethod(double b) {
		return b;
	}
public static void main(String[] args) {
	
int myNum = myMethod(5);
double myDouble = myMethod(2.0);

System.out.println(myNum + myDouble);
}
	
}
