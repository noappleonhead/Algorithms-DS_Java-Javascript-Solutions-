// LintCode Question#: 415

//Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
public class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0;
        int right = s.length()-1;
        
        if(s == null || s.length() == 0){
           return true;   
        }
        
        while (left < right ){
            if (!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            } 
            if (!Character.isLetterOrDigit(s.charAt(right))){
                right --;
                continue;
            } 
            
            if (s.charAt(left) != s.charAt(right)){
                return false;
            } 
            left++;
            right--;
        }
        return true;
    }
}