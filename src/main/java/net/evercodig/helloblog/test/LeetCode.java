package net.evercodig.helloblog.test;

public class LeetCode {
    public static void main(String[] args) {
        String str = "CXXIII";
        char c = str.charAt(0);
        System.out.println(c == 'C');
        change(str);
    }

    public static String change(String str) {
        int length = str.length();
        int sum = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == 'I') {
                if (i != length - 1 && (str.charAt(i + 1) == "V".charAt(0) || str.charAt(i + 1) == "X".charAt(0))) {
                    sum--;
                } else {
                    sum++;
                }
            }
            if (str.charAt(i) == 'V') {
                sum += 5;
            }
            if (str.charAt(i) == 'X') {
                if (i != length - 1 && ('L' == str.charAt(i + 1) || 'C' == str.charAt(i + 1))) {
                    sum -=10;
                } else {
                    sum += 10;
                }
            }
            if (str.charAt(i) == 'L') {
                sum += 50;
            }
            if (str.charAt(i) == 'C') {
                if (i != length - 1 && ('D' == str.charAt(i + 1) || 'M' == str.charAt(i + 1))) {
                    sum -= 100;
                } else {
                    sum += 100;
                }
            }
            if (str.charAt(i) == 'D') {
                sum += 500;
            }
            if (str.charAt(i) == 'M') {
                sum += 1000;
            }
        }

        System.out.println(sum);
        return String.valueOf(sum);
    }
}
