// LintCode Question#: 9

// Given number n. Print number from 1 to n. But:
// when number is divided by 3, print "fizz".
// when number is divided by 5, print "buzz".
// when number is divided by both 3 and 5, print "fizz buzz".
// when number can't be divided by either 3 or 5, print the number itself.

public List<String> fizzBuzz(int n) {
    ArrayList<String> results = new ArrayList<String>();
    for (int i = 1; i <= n; i++) {
        if (i % 15 == 0) {
            results.add("fizz buzz");
        } else if (i % 5 == 0) {
            results.add("buzz");
        } else if (i % 3 == 0) {
            results.add("fizz");
        } else {
            results.add(String.valueOf(i));
        }
    }
    return results;
}


//challenge version, use only one if
public List<String> fizzBuzz(int n) {
    List<String> res = new LinkedList<>();
    for (int i = 1; i <= n; i++) {
        String w = help(i, 3, "fizz") + help(i, 15, " ") +  help(i, 5, "buzz");
        if (w.equals("")) {
            w += i;
        }
        res.add(w);
    }
    return res;
}

public String help(int n, int div, String w) {
    return n % div == 0 ? w : "";
}
