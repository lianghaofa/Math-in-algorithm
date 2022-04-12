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

3.maybe we can just get the largest divsor of b and r .

4.when d is the largest divsor of b and r ?

if b % r = 0.

in conclusion, gcd(a, b) = gcd(b, a % b).


Now I am confused about why start with a = b*q + r.



    private int gcd(int a, int b){
        return b % a == 0 ? b : gcd(b, b % a);
    }

