package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    public static void main(String[] args) {

        Logger log = LoggerFactory.getLogger(FibonacciNumber.class);
        long startTime = System.currentTimeMillis();
        log.info("Start time = {}", startTime);
        log.info("FibIterative = {}", FibonacciNumber.fibonacciIterative(100000000));
        log.info("FibRecursive = {}", FibonacciNumber.fibonacciRecursive(40));
        log.info("Fib dynamic = {}", FibonacciNumber.fibonacciDP(100000000));
        long endTime = System.currentTimeMillis();
        log.info("End time = {}", endTime);
        log.info("TIME = {}", endTime - startTime);

    }
}