import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int rows=sc.nextInt();
	    int n=rows;
	    for(int i=1;i<=n;i++)
	    {
	        for(int j=rows;j>=1;j--)
	        {
	            
	              System.out.print(j);
              
	        }
	        System.out.print(" \n");
	        rows--;
	    }
	
	}
}