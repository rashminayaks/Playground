import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int v=1;
  		for(int row=1;row<=n;row++)
        {
          for(int col=1;col<=row;col++)
          {
            
            if(v%2==0)
            {
           System.out.print("#");
            }
            else
              System.out.print("*");
            v++;
          }
          System.out.print("\n");
        }
    }
}
   