#include <bits/stdc++.h>
using namespace std;
vector<int> v0;
int n;
int nextLarge(int num, int j)
{

    int nl = INT_MAX;
    for (int i = j; i < n; i++)
    {
        if (v0[i] > num and v0[i] < nl)
            nl = v0[i];
    }
    if (nl == num || nl == INT_MAX)
        return -1;
    return nl;
}
int main()
{

    cin >> n;
    for (int i = 0; i < n; i++)
    {
        int ip = 0;
        cin >> ip;
        v0.push_back(ip);
    }
    for (int i = 0; i < n - 1; i++)
    {
        v0[i] = nextLarge(v0[i], i + 1);
    }
    v0[n - 1] = -1;
    for (auto x : v0)
        cout << x << " ";
    return 0;
}