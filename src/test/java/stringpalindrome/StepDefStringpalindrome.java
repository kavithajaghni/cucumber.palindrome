package stringpalindrome;

import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefStringpalindrome {
	DataTable input;
	boolean flag;
	  @Given("^string$")
	    public void string(DataTable stringPalindrome)  {
	      input=stringPalindrome;
	    }

	    @When("^check for String palindrome$")
	    public void check_for_string_palindrome()  {
	    	StringPalindome strPalin=new StringPalindome();
	    	flag=strPalin.isPalindromeString(input.toString());
	    }

	    @Then("^output pass$")
	    public void output_pass()  {
	      Assert.assertTrue(flag);
	    }
}
