#include <iostream>
using namespace std;

int main() {
	
	int cells = 100;
	for (int h = 0; h < 4; h++)
			cells *= 3;

	cout << cells;
	
	return 0;
}