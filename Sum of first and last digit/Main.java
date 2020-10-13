import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int first= n;
      while(first>=10)
      {
        first=first/10;
      }
    int last=n%10;
  int sum=first+last;
  System.out.println(sum);
	}
}