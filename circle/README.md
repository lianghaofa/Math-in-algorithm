
![20201202092022310](https://user-images.githubusercontent.com/24481784/162917842-d0f2308d-23b8-4273-8bf8-1a91d9f789a0.png)


slow = a + s(b + c) + b;
fast = a + f(b + c) + b

2 * ( a + s(b + c) + b) = a + f(b + c) + b

a +b + 2* s( b + c) = f (b + c)

a = f * （ b + c )- 2*s(b + c) - b

a = (f - 2*s) * (b + c) - b

a = (f - 2*s) * (b + c) + b + c - (b + c) - b

a = (f - 2*s - 1) * (b + c)  + b + c - b


a = (f - 2*s - 1) * (b + c)  + c 

what haapen if (f - 2*s - 1) >= 1 and (f - 2*s - 1) is interger ?
![20201202092022310](https://user-images.githubusercontent.com/24481784/162934542-f8964393-451b-4ba7-b4ba-68e0b73bec51.png)

that means slow start with a and fats start with p, they will meet at the e.


so. why (f - 2*s - 1) >= 1 ?

// let me give you a intuition.
![bee216291e25245855b520689a1a43c(1)](https://user-images.githubusercontent.com/24481784/162947871-a7ac051c-a6c7-490f-8b25-4151099e0bb1.png)


f always twice bigger than or equal s.


ceae0:when f equals 0,f equals s.
why ?
// 


a = - (b + c) + c, a = -b .

what that means ?  a = b = 0.
![333a4aed4560650afaddb9a0af62128](https://user-images.githubusercontent.com/24481784/162934585-cfa3172f-b01c-4204-a23e-aa5d1da523b7.png)

they begin with a cicle.

case1:
when f twice bigger than s. f = 2, s = 1, 0, same as the case0;


when f twice bigger than s. f = 4,6.., s = 2, 3..., same as the case0;

a = k * (b + c)  + c , k is a integer.

slow start with a and fats start with p, they will meet at the e.



