import java.util.Scanner;
class Main
{
   public static int power(int base, int exp){
      if (exp !=0)
      {
         return (base * power(base, exp-1));
      }
     else
     {
         return 1;
      }
   }
   public static void main(String args[])
   {
      Scanner sc = new Scanner(System.in);
      int base = sc.nextInt();
     int exp=sc.nextInt();
     int result=power(base,exp);
     System.out.print(result);
   }
}