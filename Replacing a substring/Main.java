import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
     Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      String word=sc.nextLine();
      String newword=sc.nextLine();
      String res=str.replace(word,newword);
      System.out.println(res);
    }
}