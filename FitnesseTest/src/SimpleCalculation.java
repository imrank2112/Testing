
import org.junit.Assert;
import org.junit.Test;



public class SimpleCalculation {
	
	
	
	private double first=1,second=2,total=3;
	
	
	public void setFirst(double first)
	{
		this.first = first;
	}
	
	
	public void setSecond(double second)
	{
		this.second = second;
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void sum()
	{	
		total =4;
		first = 1;second =2;		
		verifyTrue(total == first+second,"False");
		System.out.println(total);
		
//	return first + second;	
	}

	
	public double diff()
	{
		return first-second;
	}
	
	public static void verifyTrue(boolean condition, String message) {
	    try {
	        Assert.assertTrue(message,condition);
//	        log("Expected value: true" + " Actual value: " + condition + " - PASSED ", true);
	    } catch (Throwable e) {
	    	System.out.println("Assert Failed");
//	        log("Expected value: true" + " Actual value: " + condition + " - FAILED " + message, true);
//	        addVerificationFailure(e);
	    }	    
	    
	}
}
