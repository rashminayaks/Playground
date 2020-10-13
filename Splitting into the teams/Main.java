#include<iostream>
using namespace std;
int main()
{
  int total,teams,n,rem;
  cin>>total>>teams;
  n=total/teams;
  rem=total%teams;
  cout<<"The number of students in each team is "<<n<<" and left out is "<<rem;
  return 0;
}