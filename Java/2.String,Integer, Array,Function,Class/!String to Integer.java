// frequenly asked question
// LintCode Question#: 54

// Implement function atoi to convert a string to an integer.
// If no valid conversion could be performed, a zero value is returned.
// If the correct value is out of the range of representable values, INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.
public class Solution {
    public int atoi(String str) {
        boolean isPos = true;
        char[] sc = (str.trim() + " ").toCharArray();
        int i = 0;
        
        if (sc[0] == '-') {
            isPos = false;
            i++;
        } else if (sc[0] == '+') {
            isPos = true;
            i++;
        }
        
        long value = 0;
        
        while (i < sc.length && Character.isDigit(sc[i])) {
            value = value * 10 + (sc[i] - '0');
            i++;
            
            if (value > Integer.MAX_VALUE) {
                return isPos ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }
        
        
        value = isPos ? value : -value;
        
        return (int) value;
    }
}
