package stringpalindrome;

public class StringPalindome {
	public boolean isPalindromeString(String input)
	{
	/*	boolean flag=false;
		StringBuffer s=new StringBuffer(input);
		String output=s.reverse().toString();
		if(input==output)
		{
			return true;
		}
		
		return flag;
	}*/ String reverse = new StringBuffer(input).reverse().toString();
  
    // check whether the string is palindrome or not
    if (input.equals(reverse))
      return true;
  
    else
      return false;
  }
	

}
