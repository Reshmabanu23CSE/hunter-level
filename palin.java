import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b="";
		int n = a.length();
		for(int i = n - 1; i >= 0; i--)
		{
		 b = b + a.charAt(i);
		}
		if(a.equalsIgnoreCase(b))
		{
			System.out.println("YES");
			
		}
		 else {
		 	System.out.println("NO");
		 	
		 }
	}
}
