import java.util.*;
import java.math.*;
import java.lang.*;


 class close
{
	static void tofind(int[] arr)
	{
		int leng=arr.length;int temp=(int) Math.pow(2, 31);	int	a=0,b=0;
		for(int i=0;i<leng-2;i++)
		{
			for(int j=i+1;j<leng-1;j++)
			{
				if(Math.abs(arr[i]+arr[j])<temp)
				{
					temp=Math.abs(arr[i]+arr[j]);
					a=arr[i];b=arr[j];
				}
			}			
		}
		System.out.println(""+ a+" "+b);

	}
	public static void main(String[] args)
	{
			Scanner sn = new Scanner(System.in);
		int n = sn.nextInt();
		
		int[] arra= new int[n];
		for(int i=0;i<n;i++)
			arra[i]=sn.nextInt();
		tofind(arra);		
	}	
	}
