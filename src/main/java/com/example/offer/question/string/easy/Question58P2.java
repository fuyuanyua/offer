package com.example.offer.question.string.easy;

/**
 * 左旋转字符串：https://leetcode.cn/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
 */

public class Question58P2 {

    /**
     * 不申请额外空间，只在原字符串上操作
     *      ps：Java字符串不可变，故在StringBuilder对象上操作
     * @param s
     * @param n
     * @return
     */
    public static String solution1(String s, int n) {
        if (n <= 0 || s == null || s.length() == 0) {
            return s;
        }

        // 假设s = "abcde"，n = 2
        StringBuilder sb = new StringBuilder(s);
        //前n为第一部分（"ab"），剩余为第二部分（"cde"）
        // 先翻转第一部分：abcde -> bacde
        reverseString(sb, 0, n - 1);
        // 再翻转第二部分：bacde -> baedc
        reverseString(sb, n, s.length() - 1);
        // 再整体翻转：baedc -> cdeab
        reverseString(sb, 0, s.length() - 1);

        return sb.toString();
    }

    /**
     * 翻转字符串：在原字符串上操作
     * @param sb
     * @param begin
     * @param end
     */
    public static void reverseString(StringBuilder sb, int begin, int end) {
        if (sb == null || begin < 0 || end < 0 || end - begin <= 0) {
            return;
        }
        while (begin < end) {
            char temp = sb.charAt(begin);
            sb.setCharAt(begin, sb.charAt(end));
            sb.setCharAt(end, temp);
            begin++;
            end--;
        }
    }
}
