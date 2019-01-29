// !!!Frequently asked question
// LintCode Question#: 491
// Check a positive number is a palindrome or not.
// A palindrome number is that if you reverse the whole number you will get exactly the same number.

public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        return x == reverse(x);    
    }
    
    public int reverse(int x) {
        int rst = 0;
        while(x != 0) {
            rst = rst * 10 + x % 10;
            x = x / 10;
        }
        return rst;
    }
}

// recursion, slower, but must know. Interviewer would like to know if you understand recursion.
// class Solution {
//     public boolean isPalindrome(int num) {
//     	return isPalindrome(num, 0, num);
// 	}

// 	public boolean isPalindrome(int original, int reversed, int reduced) {
// 		if (reversed == original) {
// 			return true;
// 		}
// 		if (reduced <= 0) {
// 			return false;
// 		}
// 		return isPalindrome(original, reversed * 10 + reduced % 10, reduced / 10);
// 	}
// }