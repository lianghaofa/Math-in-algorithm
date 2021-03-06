public class PermutationAndCombination {

    //   C(9,3)
    /**
     * @author LiangHaoFa
     * @date 2022/4/14 21:28
     * @description
     * @param
     * @return int
     */
    public static int getCombinationCount(int all, int part){
        part = all - part;
        long o1 = 1;
        long o2 = 1;
        // take C(9,3) for example  all = 9, part = 9 - 3 = 6
        // part + 1 ... = 7 ... 9
        for (int i = part + 1, j = 1; i <= all || j <= all - part; i ++, j ++){
            // o1 *= 7.8.9
            o1 *= i;
            // o2 *= 1.2.3
            o2 *= j;
            long gcd = gcd(o1, o2);
            o1 /= gcd;
            o2 /= gcd;
        }
        return (int)o1;
    }

    /**
     * @author LiangHaoFa
     * @date 2022/4/14 21:23
     * @description  if you want more detail about gcd, check this link https://github.com/lianghaofa/Math-in-algorithm/tree/main/euclidean-algorithm
     * @param a a bigger than b
     * @param b b lesser than a
     * @return int
     */
    private static long gcd(long a, long b){
        return a % b == 0 ? b : gcd(b , a % b);
    }

}
