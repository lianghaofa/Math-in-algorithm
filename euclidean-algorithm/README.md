gcd

a = b*q + r
15 = 10 * 1 + 5

66 = 30 * 2 + 6  

a = 66, b = 30,r = 6...


1.suppose d is any common divsor of a and b.

so , d | a, d | b
3 | 66 = 22, 3 | 30 = 10

2.can we get d is a common divsor of b and r ?

d | (a - bq) , q is interger.
3 | (66 - 60) = 2

(d | a)  -  (d | bq)  
3 | 66 - 3 | 60 = 12 - 10 = 2

3.when d is the largest divsor of a and b ?

if b % a = 0.

in conclusion, gcd(a, b) = gcd(b, a % b).


66 = 30 + 36



    private int gcd(int a, int b){
        return b % a == 0 ? b : gcd(b, b % a);
    }

