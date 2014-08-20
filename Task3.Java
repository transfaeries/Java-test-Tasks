/* package whatever; // don't place package name! */
/*

Michael Stern
String reverser 3

The following code applies three interesting transformations to a given input string.
1.- reverses the string outright "abc def ghi" -> "ihg fed cba"
2.- Reverses the words in the string "abc def ghi" -> "ghi def abc"
3.- Reverses the words and each word "abc def ghi" ->"cba fed ihg"

*/


import java.io.*;

class myCode
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		String s="Hi my name is Bob"; //input string
        StringBuilder s1=new StringBuilder(s); //stringBuilder allow for easier char manipulation
                                              // initialized as s since it will have the same size
        String s2="";          // string two can be initialized empty
      String s3="";            //can also be initialized empty 
      
         for(int i=0; i<s.length(); i++) //Loop goes through every character in s and places it at opposite position in s1
         {
           s1.setCharAt(i,s.charAt(s.length()-i-1));
         }
      
      
      String[] arr = s.split(" ");    //Split method allows for easy word array creation
    
      for (int i=arr.length;i>0;i--)
      {
        
        s2+=arr[i-1]+" "; //feed array into string in reverse order
      }
      s2 = s2.substring(0, s2.length()-1); //cut the last character since it is an extra space
      
      
      for (int i=0;i<arr.length;i++)
      {
         s3+=new StringBuilder(arr[i]).reverse().toString()+" "; //take the already built word arrays and reverse each
      } // The reverse method was not used in task one to show off different ways to accomplish same task, hopefully for extra points

      s3 = s3.substring(0, s3.length()-1); //cut the last character since it is an extra space
        //output all the inputs and outputs
      System.out.println("input: \""+s+"\"");
      System.out.println("output: \""+s1+"\"");
      System.out.println("input: \""+s+"\"");
      System.out.println("output: \""+s2+"\"");  
      System.out.println("input: \""+s+"\"");
      System.out.println("output: \""+s3+"\"");
    }
  

      
}