#include <bits/stdc++.h>
using namespace std;

int main()
{
    string s0;
    cin >> s0;
    vector<int> v0;
    int sum = s0[0] - '0';
    int i = 1;
    for (auto x : s0)
    {
        if (x >= 48 and x <= 57)
            v0.push_back(x - '0');
        else
        {
            switch (x)
            {
            case '+':
                sum += v0[i++];
                break;
            case '-':
                sum -= v0[i++];
                break;
            case '*':
                sum *= v0[i++];
                break;
            case '/':
                sum /= v0[i++];
                break;
            default:
                sum += v0[i++];
                break;
            }
        }
    }
    cout << sum;
    return 0;
}