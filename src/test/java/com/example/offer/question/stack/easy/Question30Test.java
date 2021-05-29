package com.example.offer.question.stack.easy;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Description: Question30Test
 * @Author: lhb
 * @Date: 2021/5/29 09:35
 */

@Slf4j
class Question30Test {

    @Test
    void testMyStack() {
        log.info("----------测试自定义栈----------");

        log.info("执行步骤1：创建自定义栈");
        Question30.MyStack myStack = new Question30.MyStack();

        log.info("执行步骤2：push元素2");
        myStack.push(2);

        log.info("执行步骤3：push元素3");
        myStack.push(3);

        log.info("执行步骤4：push元素1");
        myStack.push(1);

        int min = myStack.min();
        log.info("执行步骤5：调用min方法 -> {}", min);

        log.info("执行步骤6：调用pop方法");
        myStack.pop();

        int top = myStack.top();
        log.info("执行步骤7：调用top方法 -> {}", top);

        int min1 = myStack.min();
        log.info("执行步骤8：调用min方法 -> {}", min1);
    }

}