import java.util.Scanner;
class Main{
  public static void primenum(int num)
  {
    int flag;
    for(int j=2;j<=num;j++)
    {
      flag=0;
    for(int i=2;i<=j/2;i++)
    {
      if(j%i==0)
      {
        flag=1;
        //break;
      }
    }
      if(flag==0) 
        System.out.println(j);
  }
  } 
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
     primenum(n);
      
	}
}