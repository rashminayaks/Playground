import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int second=0;
      while(n>=10)
      {
        second=n%10;
        n=n/10;
      }
  System.out.println(second);
	}
}