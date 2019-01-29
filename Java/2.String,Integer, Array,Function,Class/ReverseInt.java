// frequenly asked question
// LintCode Question#: 413,37

//Reverse digits of an integer. Returns 0 when the reversed integer overflows (signed 32-bit integer).
// note:simple practice logic thinking.
public class Solution {

    public int reverseInteger(int n) {
        int reversed_n = 0;
        
        while (n != 0) {
            int temp = reversed_n * 10 + n % 10;
            n = n / 10;
            if (temp / 10 != reversed_n) {
                reversed_n = 0;
                break;
            }
            reversed_n = temp;
        }
        return reversed_n;
    }
}



// Reverse a 3-digit integer.
// public class solution{
//     public int reverseInteger(int number){
//         int num1 = number % 10;
//         int num2 = (number/10) % 10;
//         int num3 = ((number/10)/10)%10;
//         return num3 + num2*10 + num1*100;
//     }
// }