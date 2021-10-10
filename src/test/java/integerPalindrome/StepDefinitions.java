package integerPalindrome;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.*;

public class StepDefinitions {
	int numInput;
	boolean isPalindrome;
	

	@Given("^integer \"([^\"]*)\"$")
	public void integer_something_value(String strArg1)  {
		numInput = Integer.parseInt(strArg1);
	}

	@When("^check for palandrome$")
	public void check_for_palandrome()  {
		PalindromeInteger palindrome = new PalindromeInteger();
		isPalindrome = palindrome.checlkPalindrome(numInput);

	}

	@SuppressWarnings("deprecation")
	@Then("^should pass$")
	public void should_pass()  {
	 
		Assert.assertTrue(isPalindrome);
	}

}
