// LintCode Question#: 239

// note:exercise logic thinking.
// Given an equation: ax2 + bx + c = 0. Find the root of the equation.
// Given a = 1, b = -2, c = 1. return [1].
public class Solution {
    public double[] rootOfEquation(double a, double b, double c) {
        if (b * b - 4 * a * c < 0) {
            return new double[0];
        }
        
        if (b * b - 4 * a * c == 0) {
            double[] root = new double[1];
            root[0] = -b / 2.0 / a;
            return root;
        }
        
        double[] root = new double[2];
        double delta = Math.sqrt(b * b - 4 * a * c);
        root[0] = (-b - delta) / 2.0 / a;
        root[1] = (-b + delta) / 2.0 / a;
        
        if (root[0] > root[1]) {
            double temp = root[0];
            root[0] = root[1];
            root[1] = temp;
        }
        return root;
    }
}