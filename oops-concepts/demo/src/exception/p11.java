package exception;

public class p11 {
	
	    public static void main(String[] args)
	    {
	    	System.out.println("Program start successfully.");
	        try
	        {
	            
	            int c = 10 / 0;   // Causes ArithmeticException
	            System.out.println("Result = " + c);
	        }
	        catch (ArithmeticException e)
	        {
	            System.out.println("Exception Caught: " + e);
	        }
	        finally
	        {
	            System.out.println("Finally block is always executed.");
	        }

	        System.out.println("Program ended successfully.");
	    }
	}
