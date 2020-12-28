
public class Recursive {

    /*
     * Returns an array with the quotient and remainder of the
     * integer division
     *
     * @param dividend a positive int
     * @param divisor a positive int
     */


    static int[] division(int dividend, int divisor){

	    int result[] = {0, dividend};
	
	    if ( dividend < divisor ){
	        return result;
	    }else{
	    
	        // complete the code
	      	int quotient = dividend / divisor;
	        int remainder = dividend % divisor;
		System.out.println(quotient+ " : "+remainder);
	      
		dividend = remainder; 
		result = division(dividend,divisor);
		result[0] = quotient+result[0]; 
	        return result;
	    }
    }

    public static void main(String[] args){
	    int result[]=division(3995,3);
	    System.out.println("Quotient: "+ result[0] + " Remainder: "+ result[1]);
	    System.out.println("The end");
    }
}
