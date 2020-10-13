import java.util.Scanner;
class Main {
	public static void main (String[] args){
      int digit,sum=0;
	   Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int temp=n;
      while(n>0)
      {
        digit=n%10;
        sum=sum+digit;
        n=n/10;
      }
      System.out.println(sum);
	}
}