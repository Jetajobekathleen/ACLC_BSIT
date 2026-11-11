#include <iostream>
 using namespace std;

 int main() {
    int hour=22;
    hour+=5;   // 27
    hour%=24;  //wrap around
    cout<<hour;
 }