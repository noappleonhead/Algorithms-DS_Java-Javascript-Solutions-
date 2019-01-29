// LintCode Question#: 1

// note: require bit manipulation knowledge
// Write a function that add two numbers A and B.
public class Solution {

    public int aplusb(int a, int b) {
        while (b != 0) {
            int _a = a ^ b;
            int _b = (a & b) << 1;
            a = _a;
            b = _b;
        }
        return a;
    }
}