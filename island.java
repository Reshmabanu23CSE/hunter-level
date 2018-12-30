import java.util.*;
class island{
    public static int islandcheck(int ar[][])
    {
         if(ar==null)
        {
            return 0;
        }
        int count1=0,i,j;
         int v=0;
        for(i=0;i<ar.length;i++)
        {
            for(j=0;j<ar[i].length;j++)
            {
                if(ar[i][j]==1)
                {
                    
                v=check(i,j,ar,v);
                
                }
            }
        }
        return v;
    }
    public static int check(int row,int col,int[][] isl,int count1)
    {
        
        int count=0;
        //right
        if(col+1<isl[row].length&&isl[row][col+1]==0)
        {
            count++;
            
        }
        //left
        if(col-1>=0&&isl[row][col-1]==0)
        {
           count++;
           ;
        }
        //Top
        if(row-1>=0&&isl[row-1][col]==0)
        {
             count++;
             
        }
        //bottom
        if(row+1<isl.length&&isl[row+1][col]==0)
        {
            count++;
            
        }
        //top left diagnol
        if(row-1>=0&&col-1>=0&&isl[row-1][col-1]==0)
        {
            count++;
            
        }
        //top right diagnol
        if(row-1>=0&&col+1<isl[row].length && isl[row-1][col+1]==0)
        {
            count++;
            
        }
        //bottom left diagnol
            if(row+1<isl.length&&col-1>=0&&isl[row+1][col-1]==0)
            {
                count++;
               
            }
        //bottom right diagnol
        if(row+1<isl.length&&col+1<isl[row].length&&isl[row+1][col+1]==0)
        {
           count++;
          
        }
     
        
        if(count>=3)
        {
            count1++;
            
        }
        return count1;
        }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,j;
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
            
            
        }
        System.out.print(islandcheck(a));
    }
}
