package com.example.offer.milestone.array;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class Question1109Test {

    @Test
    void corpFlightBookings() {
        int[][] bookings = new int[3][3];
        // 预定记录一：第一个航班到第二个航班，都预定了10张票
        bookings[0] = new int[] {1, 2, 10};
        // 预定记录二：第二个航班到第三个航班，都预定了20张票
        bookings[1] = new int[] {2, 3, 20};
        // 预定记录三：第二个航班到第五个航班，都预定了25张票
        bookings[2] = new int[] {2, 5, 25};

        int[] result = Question1109.corpFlightBookings(bookings, 5);
        log.info("{}", result);
    }
}