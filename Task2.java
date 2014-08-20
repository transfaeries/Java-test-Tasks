/* package whatever; // don't place package name! */


/*

Michael Stern
Brute Force 5

The following code prints to screen all possible 5 lowercase letter combinations, by the following mechanism:
Step One:It changes the last character in a 5 letter string to the next letter in the alphabet 26 times.
Step Two:Then, it changes the second to last character to the next letter and repeats step one. 
And so forth.

*/

import java.io.*;

class myCode
{

	public static void main (String[] args) throws java.lang.Exception
	{
		StringBuilder s=new StringBuilder("aaaaa"); //initialize a 5 char string
      
      
  
         for(char a=97;a<123;a++) //loop through 1st position 26 times with appropriate ASCII codes
           {
                               
           s.setCharAt(0,a); //set 1st char to next letter each time it goes through
           for(char b=97;b<123;b++) // loop through 2nd position
            {
                              
               s.setCharAt(1,b);//set 2nd char to next letter
               for(char c=97;c<123;c++) //loop through 3rd position
               {

                 s.setCharAt(2,c); //set 3rd char to next letter
                 for(char d=97;d<123;d++) //loop through 3rd position
                 {
                 
                   s.setCharAt(3,d);                   
                   for(char e=97;e<123;e++)
                    
                  {
                    s.setCharAt(4,e);
                    System.out.println(s.toString());
                    
                  }//close for e
                   
                 }//close for d
                 
               }//close for c
               
            }//close for b
           
           }//close for a
          
        

 
	
   }//close pub

} //close myCode