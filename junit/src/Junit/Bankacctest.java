package Junit;

	import Assignment4.Program4;
	import org.junit.Test;

	import static org.junit.Assert.*;

	public class Bankacctest {

	    @Test(expected = Program4.class)
	    public void withdrawAmountGreaterThanBalance() throws Program4{

	        Bankacc bankacc = new Bankacc();
	        bankacc.withdrawFunctionality(20000);


	    }
	}

