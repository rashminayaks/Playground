#include<iostream>
using namespace std;
int main()
{
  int month,days;
  float rent,rr,total;
  cin>>month>>days>>rent;
  switch(month)
  {
    case 4:
    case 5:
    case 6:
    case 11:
    case 12:
     rr =((20/100.0)*rent)+rent;
  total = rr*days;
  cout<<total;
      break;
    case 1:
    case 2:
    case 3:
    case 7:
    case 8:
    case 9:
    case 10:
      cout<<(rent*days)<<endl;
      break;
    default:
      cout<<"Invalid Input";
  }
  return 0;
}