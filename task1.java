/* package whatever; // don't place package name! */

/*
Michael Stern
Palindrome Checker

The following code uses two different functions to test whether a string is a palindrome. 
They both work by comparing the last letter to the first, but one moves in recursively by cutting the string.
The other uses a for loop to keep track of the position as it moves in on the string.

*/
import java.io.*;

class mainCode
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String s="bab";
      if(s.length()<1)
        System.out.println("String is Empty"); //if the string is empty don't even check

      else if(itPal(s)) //check recursively
        System.out.println("true");
      else
        System.out.println("false");
        
             
        if(s.length()<1)
        System.out.println("String is Empty"); //if the string is empty don't even check

      else if(itPal(s)) //check iteratively
        System.out.println("true");
      else
        System.out.println("false");

        
        
	}//close main
  
  public static Boolean recPal(String s)
  {
    
   Boolean rValue;
    if(s.length()<2) //if you get to the point where the string is one char (for initially odd number of chars)
      rValue=true;  // or empty if the string had an even number of chars, then it must be a palindrome
    else if(s.charAt(0)==s.charAt(s.length()-1)) //if the first and last chars match
    {
      s=s.substring(1,s.length()-1); //cut the first and last chars
      rValue=recPal(s); //test again
    }
    else //if they ever don't match, it fails
      rValue=false;
    
    return rValue;
  } //close recPal
  
  
  public static Boolean itPal(String s)
  {
    
   for(int i=0;i<s.length()/2;i++) //runs for half the times the words length
   {
    if(s.charAt(i)!=s.charAt(s.length()-i-1)) //checks to see if current character matches one on opposite end of string
       return false; //false and exit if they ever don't match
   }
    return true;
    
  }
    
    
  }//close myCode
