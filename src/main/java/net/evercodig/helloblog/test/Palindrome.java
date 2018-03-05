package net.evercodig.helloblog.test;

public class Palindrome {
    public static void main(String[] args) {
        String str = "12321";
        boolean palindrome = isPalindrome(str);
        System.out.println(palindrome);
    }

    public static boolean isPalindrome(String string){
        char[] chars = string.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = chars.length-1; i >=0 ; i--) {
            stringBuilder.append(chars[i]);
        }
        String reverseStr = stringBuilder.toString();
        if(reverseStr.equals(string)){
            return true;
        }
        return false;
    }
}
