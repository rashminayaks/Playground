import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in); 
        int n,sum=0,rem,temp;
         n=sc.nextInt();
            temp=n;
         while(n!=0)
         {
           rem=n%10;
           int fact=1;
            for(int i=1;i<=rem;i++)
            {
              fact=fact*i;
            }
            sum=sum+fact;
            n=n/10;
          }
           if(sum==temp)
            System.out.println("Yes");
            else
             System.out.println("No");

}
    }