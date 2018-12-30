import java.util.ArrayList;
import java.util.Scanner;

 class Repeaternum
{

	public static void main(String[] args) 
	{
	Scanner scan=new Scanner(System.in);
	int n,m;
	n=scan.nextInt();m=scan.nextInt();
	int a[][];
	a=new int[n][m];
	ArrayList al=new ArrayList();
	for(int i=0;i<n;i++)
	{	
		for(int j=0;j<m;j++)
		{
		a[i][j]=scan.nextInt();
		al.add(a[i][j]);
		}
		
	}
	for(int i=0;i<(al.size()-1);i++)
	{
		for(int j=i+1;j<al.size();j++)
		if(al.get(i)==al.get(j))
		{
			System.out.print(al.get(i)+" ");
		}
	}
			
			
	
	

	}

}
