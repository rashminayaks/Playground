import java.util.Scanner;
class Main{
  public static int sum(int num)
  {
    int result=0;
    for(int i=1;i<=num;i++)
      result=result+i;
      return result;
    }
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int result=sum(n);
      System.out.println(result);
	}
}