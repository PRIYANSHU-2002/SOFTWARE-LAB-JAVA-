                                                        // THIS PROGRAM IS MADE BY PRIYANSHU SINGH 

import java.lang.Character;
public class LOWER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		char a = '@';
		
	    if (Character.isLowerCase(a))
	    {
	    	System.out.println("It is a lower case letter.");
	    }
	    else if (Character.isUpperCase(a))
	    {
	    	System.out.println("It is an upper case letter.");
	    }
	    else if(Character.isDigit(a))
	    {
	    	System.out.println("Please enter a character value.");
	    }
	    else if(Character.isWhitespace(a))
	    {
	    	System.out.println("It is a whitespace.");
	    }
	    else
	    {
	    	System.out.println("It is a special character.");
	    }
 	}

}
