#include <iostream>
using namespace std;

int main() {
    int* number = new int(100);

    cout << "Allocated value: " << *number << endl;

    delete number;
    number = nullptr;

    cout << "Memory released manually." << endl;

    return 0;
}
