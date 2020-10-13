import java.util.Scanner;
class Main{  
 static int sum(int n){    
  if (n == 0)    
    return 0;    
  else    
    return(n + sum(n-1));    
 }    
 public static void main(String args[]){  
   Scanner sc=new Scanner(System.in);
  int i,res=0; 
  int number=sc.nextInt();   
  res = sum(number);   
  System.out.println(res);    
 }  
}  