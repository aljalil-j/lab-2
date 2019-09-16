
public class Driver {

	public static void main(String[] args) {
		recursiveMathlib RecursionLibary = new recursiveMathlib();
		iterationMathLib IterationMathLib = new iterationMathLib();
		System.out.println("---Recursion----");
        runtestCode(RecursionLibary);
        System.out.println("---Iteration----");
        runtestCode(IterationMathLib);
	}



public static void runtestCode(MathLib library) {
	
	System.out.println("GCD of 4,2=" +library.gcd(4, 2));
	 System.out.println(Ack(3, 4));
}
}
