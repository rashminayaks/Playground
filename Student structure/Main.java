#include<iostream>
#include<stdlib.h>
using namespace std;
struct student
{
  int rn,grade;
  int s1,s2,s3,s4,s5;
  float avg;
};
int main()
{
  int grade=0;
  int avg;
  struct student *s;
  int size;
  cin>>size;
  s=(struct student*)malloc(size*sizeof(struct student));
  cout<<"STUDENT MARKSHEET USING STRUCTURES"<<endl;
  cout<<"Enter the no of students"<<endl;
  for(int i=0;i<size;i++)
  {
    cin>>s[i].rn;
    cin>>s[i].s1;
    cin>>s[i].s2;
    cin>>s[i].s3;
    cin>>s[i].s4;
    cin>>s[i].s5;
  }
  cout<<"rn "<<"s1 "<<"s2 "<<"s3 "<<"s4 "<<"s5 "<<"avg "<<"grade"<<endl;
  for(int i=0;i<size;i++)
  {
     avg=(s[i].s1+s[i].s2+s[i].s3+s[i].s4+s[i].s5)/5;
 (avg>70)?grade=1:grade=2;   
cout<<s[i].rn<<" "<<s[i].s1<<" "<<s[i].s2<<" "<<s[i].s3<<" "<<s[i].s4<<" "<<s[i].s5<<" "<<avg<<" "<<grade<<endl;
  }
    return 0;
  }