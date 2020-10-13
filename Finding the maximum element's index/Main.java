import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int max=0,i,index=0;
    int size=sc.nextInt();
    int arr[]=new int[size];
    for(i=0;i<size;++i)
    {
      arr[i]=sc.nextInt();
    }
    for(i=0;i<size;++i)
    {
      if(arr[i]>max)
      {
        max=arr[i];
        index=i;
    }
    }
    System.out.println(index);
  }
}