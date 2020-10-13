#include<iostream>
using namespace std;
class Time
{
  public:
  int h1,m1,s1,h2,m2,s2;
  int h,m,s,min,sec;
  void input()
  {
    cin>>h1>>m1>>s1>>h2>>m2>>s2;
  }
  void output()
  {
    cout<<"Enter time:"<<endl;
    cout<<"Hours :"<<endl;
    cin>>h1;
    cout<<"Minutes :"<<endl;
    cin>>m1;
    cout<<"Seconds :"<<endl;
    cin>>s1;
    cout<<"Enter time:"<<endl;
    cout<<"Hours :"<<endl;
    cin>>h2;
    cout<<"Minutes :"<<endl;
    cin>>m2;
    cout<<"Seconds :"<<endl;
    cin>>s2;
  }
  void result()
  {
   h=h1+h2;
    m=m1+m2;
    s=s1+s2;
    if(s>=60)
    {
    m+=(s/60);
    s=s%60;
    //m=m+sec;
    }
    if(m>=60)
    {
    h+=(m/60);
    m=m%60;
    //h=h+min;
    }
    cout<<"Time after add:"<<" "<<h<<":"<<m<<":"<<s<<endl;
  }
}t;
int main()
{
  t.input();
  t.output();
  t.result();
}