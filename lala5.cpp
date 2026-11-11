#include <iostream>
using namespace std;
int main() {
    int clock = 22;
    clock += 5;
    clock %= 12;
    cout << clock;
    return 0;

}