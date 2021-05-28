package com.example.offer.question.stack.easy;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Description: Question09Test
 * @Author: lhb
 * @Date: 2021/5/28 15:29
 */

@Slf4j
class Question09Test {

    @Test
    void testMyQueue() {
        log.info("----------测试自定义队列----------");

        log.info("执行步骤1：创建自定义队列");
        Question09.MyQueue myQueue = new Question09.MyQueue();
        log.info("执行结果1：null");

        log.info("执行步骤2：插入元素2");
        myQueue.appendTail(2);
        log.info("执行结果2：null");

        log.info("执行步骤3：插入元素1");
        myQueue.appendTail(1);
        log.info("执行结果3：null");

        log.info("执行步骤4：删除元素");
        Integer delete1 = myQueue.deleteHead();
        log.info("执行结果4：{}", delete1);

        log.info("执行步骤5：删除元素");
        Integer delete2 = myQueue.deleteHead();
        log.info("执行结果5：{}", delete2);

        log.info("执行步骤6：删除元素");
        Integer delete3 = myQueue.deleteHead();
        log.info("执行结果6：{}", delete3);
    }

}