#include <iostream>
#include<string.h>
using namespace std;

int main()
{   
   string  str;  
   int element;   
cin>>str>>element;
 // for(int i=0;i<=str.len;i++)
  for(int i=0;str[i] != '\0'; i++)
   cout<<str[element-1];   
   return 0;
}