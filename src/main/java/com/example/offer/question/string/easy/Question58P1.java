package com.example.offer.question.string.easy;

import org.apache.commons.lang3.StringUtils;

/**
 * 翻转字符串：https://leetcode.cn/problems/fan-zhuan-dan-ci-shun-xu-lcof/
 */

public class Question58P1 {

    /**
     * 双指针，head指针定位单词首部，tail指针定位单词尾部，从后往前遍历字符串
     * @param s
     * @return
     */
    public static String solution1(String s) {
        if (StringUtils.isEmpty(s)) {
            return s;
        }

        // 删除首尾空格
        String s1 = s.trim();
        // 定义两个指针，head用于指向单词首字母，tail用于指向单词尾字母
        // 初始都指向字符串尾
        int head = s1.length() - 1;
        int tail = s1.length() - 1;
        StringBuilder sb = new StringBuilder();

        while (head >= 0) {
            // head向前寻找，直到找到‘ ’，根据head和tail就能确定好一个单词
            while (head >= 0 && s1.charAt(head) != ' ') {
                head--;
            }
            /*
              substring API说明：
                beginIndex – the beginning index, inclusive.
                endIndex – the ending index, exclusive.
             */
            sb.append(s1.substring(head + 1, tail + 1))
                    .append(" ");
            // head继续向前寻找，确定下一个单词的尾部
            while (head >= 0 && s1.charAt(head) == ' ') {
                head--;
            }
            tail = head;
        }

        return sb.toString().trim();
    }

}
