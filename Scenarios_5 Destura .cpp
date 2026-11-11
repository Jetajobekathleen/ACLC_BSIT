#include<iostream>
using namespace std;

int main(){
  int hour = 22;
  hour += 5;
  hour %=24;
    cout << "hour:" << hour;
    return 0;
}