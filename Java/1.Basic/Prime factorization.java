// LintCode Question#: 235

// note:simple practice logic thinking.
// Prime factorize a given integer.
public class Solution {

    public List<Integer> primeFactorization(int num) {
        List<Integer> factors = new ArrayList<Integer>();

        for (int i = 2; i * i <= num; i++) {
            while (num % i == 0) {
                num = num / i;
                factors.add(i);
            }
        }

        if (num != 1) {
            factors.add(num);
        }
        
        return factors;
    }
}