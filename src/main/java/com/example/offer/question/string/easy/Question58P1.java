package com.example.offer.question.string.easy;

import ch.qos.logback.classic.spi.EventArgUtil;
import org.apache.commons.lang3.StringUtils;

/**
 * 翻转字符串：https://leetcode.cn/problems/fan-zhuan-dan-ci-shun-xu-lcof/
 */

public class Question58P1 {
    public static String solution1(String s) {
        if (StringUtils.isEmpty(s)) {
            return s;
        }

        int length = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = length - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        return "";
    }

}
