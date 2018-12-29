import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	Scanner in=new Scanner(System.in);
int n,i,j,t;
System.out.println("ENTER THE NO.OF ARRAY ELEMENTS:");
n=in.nextInt();
int a[]=new int[n];
System.out.println("ENTER THE ARRAY ELEMENTS:");
for(i=0;i<n;i++)
{
a[i]=in.nextInt();
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]<a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}
}}
for(i=0;i<n;i++)
{
System.out.print(a[i]);
}
}}
