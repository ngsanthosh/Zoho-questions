#include <bits/stdc++.h>
using namespace std;
vector<string> v0;
vector<int> v1;
int toNum(string ip)
{
    int num = 0;
    for (int i = 0; i < ip.length(); i++)
    {
        num *= 10;
        num += (ip[i] - '0');
    }
    return num;
}
void sortStr()
{
    for (int i = 0; i < v1.size(); i++)
    {
        for (int j = i + 1; j < v1.size(); j++)
        {
            if (v1[i] > v1[j])
                swap(v1[i], v1[j]);
        }
    }
}
int main()
{

    int n;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        string ip;
        cin >> ip;
        v0.push_back(ip);
        v1.push_back(toNum(ip));
    }
    sortStr();
    for (auto x : v1)
        cout
            << x << " ";
    return 0;
}