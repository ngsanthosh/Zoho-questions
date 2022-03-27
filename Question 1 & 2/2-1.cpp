#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    cin >> n;
    for (int i = 1; i <= n; i++)
    {
        for (int k = i; k <= n; k++)
            cout << k << " ";
        for (int j = 1; j < i; j++)
            cout << j << " ";
        cout << endl;
    }
    return 0;
}
