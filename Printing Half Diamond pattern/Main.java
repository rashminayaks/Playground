import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int space=n-1,row,col,sp,star;
      for(row=1;row<=n;row++)
      {
        for(sp=1;sp<=space;sp++)
          System.out.print(" ");
        for(star=1;star<=(2*row-1);star++)
          System.out.print("*");
        space--;
        System.out.print("\n");
      }
	}
}