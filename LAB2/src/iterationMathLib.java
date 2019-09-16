
public class iterationMathLib extends  MathLib {

	//Greatest Common Divisor
	
	int gcd (int x, int y){
		int temp;
		
		while (y!= 0) {
		if (x>=y && x!=0)	{
			
			temp =y;
			y =temp;
		}
			
		}
		return 0;
	}
	
	
 //fib
	
	public static void main(String args[])  
	{    
	 int x1=0,x2=1,x3,i,count=10;    
	 System.out.print(x1+" "+x2);//printing 0 and 1    
	    
	 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
	 {    
	  x3=x1+x2;    
	  System.out.print(" "+x3);    
	  x1=x2;    
	  x2=x3;    
	 }    
	  
	}


	@Override
	int Ack(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	int fib(int x1, int x2, int x3) {
		// TODO Auto-generated method stub
		return 0;
	}
}
