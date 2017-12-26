package dotzip.fastpow

def fastPow(int base, int power, int modul){
    int res = 1;
    if(!power) return 1;

    while(power){
        if(power%2 == 0) {
            power /= 2
            base *= base
            base %= modul
        } else {
            power--
            res *= base
            res %= modul
        }
    }
    return res % modul
}

println fastPow(595, 703, 991)