import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int space=n-1,row,col,sp,star,c=1;
      for(row=1;row<=n;row++)
      {
        for(sp=1;sp<=space;sp++)
          System.out.print(" ");
        for(star=1;star<=row;star++)
        {
          System.out.print(c+" ");
          c++;
        }
        space--;
        System.out.print("\n");
      }
	}
}