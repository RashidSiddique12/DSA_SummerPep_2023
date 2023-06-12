#include <iostream>

using namespace std;
class Hello
{
private:
    int v1, v2;

public:
    void set(int x, int y)
    {
        v1 = x;
        v2 = y;
    }
    void get()
    {
        cout << "v1 : " << v1 << " v2: " << v2 << endl;
    }
    Hello operator*(Hello &y)
    {
        Hello temp;
        temp.v1 = v1 * y.v1;
        temp.v2 = v2 * y.v2;
        return temp;
    }
    Hello operator+(Hello &x)
    {
        Hello temp;
        temp.v1 = v1 + x.v1;
        temp.v2 = v2 + x.v2;
        return temp;
    }
};
int main()
{
    Hello h1, h2;
    h1.set(2, 3);
    h2.set(4, 5);
    Hello h3 = h1 + h2;
    Hello h4 = h2 * h1;

    h4.get();

    return 0;
}