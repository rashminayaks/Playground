#include<iostream>
#include<stdio.h>
using namespace std;
class Student
{
 public: 
  string name;
  int rn,marks;
  void input()
  {
    cout<<"Enter name:"<<endl;
    cin>>name;
    cout<<"Enter roll number:"<<endl;
    cin>>rn;
    cout<<"Enter total marks outof 500:"<<endl;
    cin>>marks;
  }
  void display()
  {
    cout<<"Student details: "<<endl;
    cout<<"Name: "<<name<<endl;
    cout<<"Roll Number: "<<rn<<endl;
    cout<<"Total: "<<marks<<endl;
    float p=(float)marks/5;
    printf("Percentage: %.1f",p);
  }
}s;

int main()
{
  s.input();
  s.display();
}