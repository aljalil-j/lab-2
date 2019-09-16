
public class recursiveMathlib  extends MathLib{
	
	
	
	//Greatest Common Divisor
	
	int gcd (int x, int y){
		if (y==0) {
			
			return x;
		}
			
		if (x>=y && x !=0)	{
			
			return gcd(y,x%y);
		}
			
		System.out.println("could not create");
		return 0; 
	}
	
	
	//Ackermann’s function
	
	  int Ack(int x, int y) {

	      if (x == 0) {
	       return 2 * y;
	      } else if (x >= 1) {
	       if (y == 0) {
	        return 0;
	       } else if (y == 0) {
	        return 2;
	       } else {
	        return Ack(x - 1, Ack(x, y - 1));
	       }
	      }
	      return y; 
	     }

	    
	    //Fibonacci 
	 
	     static int x1=0,x2=1,x3=0;    
	     static void printFibonacci(int count){    
	        if(count>0){    
	             x3 = x1 + x2;    
	             x1 = x2;    
	             x2 = x3;    
	             System.out.print(" "+x3);   
	             printFibonacci(count-1);    
	         }    
	     }    
	     public static void main(String args[]){    
	      int count=10;    
	      System.out.print(x1+" "+x2);//printing 0 and 1    
	      printFibonacci(count-2);//n-2 because 2 numbers are already printed   
	     }


		@Override
		int fib(int x1, int x2, int x3) {
			// TODO Auto-generated method stub
			return 0;
		}


		
}
