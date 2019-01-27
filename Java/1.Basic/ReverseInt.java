// LintCode Question#: 37

// Reverse a 3-digit integer.

public class solution{
    public int reverseInteger(int number){
        int num1 = number % 10;
        int num2 = (number/10) % 10;
        int num3 = ((number/10)/10)%10;
        return num3 + num2*10 + num1*100;
    }
}