#include <iostream>
using namespace std;

int main() {
    int cell = 100;

    for(int hour = 1; hour <= 4; hour++) {
        cell *= 3;
    }

    cout << cell;
    return 0;
}