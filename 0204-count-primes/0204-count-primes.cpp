class Solution {
public:
vector<bool> sieveOfEratostheness(int n) {
    vector<bool> sieve(n + 1, true);
    sieve[0] = false, sieve[1] = false;

    for (int i = 2; i * i <= n; i++) {
        if (sieve[i]) {
            for (int j = i * i; j <= n; j += i) {
                sieve[j] = false;
            }
        }
    }
    return sieve;
}

int countSieve(vector<bool> sieve, int n) {
    int cnt = 0;
    for (int i = 2; i < n; i++) {
        if (sieve[i]) {
            cnt++;
        }
    }
    return cnt;
}
    
int countPrimes(int n) {
    vector<bool> sieve = sieveOfEratostheness(n);
    return  countSieve(sieve, n);
}
};