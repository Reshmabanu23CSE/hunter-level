import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		        Scanner obj= new Scanner(System.in);
        int n=obj.nextInt();
        int a[]=new int[n];
        int count=0;
        for(int i=1;i<n;i++)
        {
            a[i]=obj.nextInt();
            if(a[i]==i)
            {
                System.out.print(a[i]);
                System.out.print(" ");
                count++;
            }
            
        }
        if(count==0)
            System.out.println(-1);
    }
}
