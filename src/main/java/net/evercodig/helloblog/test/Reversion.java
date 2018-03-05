package net.evercodig.helloblog.test;

/*
 示例1:
    输入:123年输出:321年
示例2:
    输入:-123年输出:-321年
示例3:
    输入:120年输出: 21
*/
public class Reversion {
    public static void main(String[] args) {
        String string = reverse("-1211");
        System.out.println(string);
    }

    public static String reverse(String str) {
        char[] chars = str.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();

        if (!Character.isDigit(chars[0])) {
            stringBuilder.append(chars[0]);
            for (int i = chars.length - 1; i >= 1; i--) {
                stringBuilder.append(chars[i]);
            }
            return stringBuilder.toString();
        }
        if ('0' == chars[chars.length - 1]) {
            for (int i = chars.length - 2; i >= 0; i--) {
                stringBuilder.append(chars[i]);
            }
            return stringBuilder.toString();
        }
        for (int i = chars.length - 1; i >= 0; i--) {
            stringBuilder.append(chars[i]);
        }
        return stringBuilder.toString();
    }
}
