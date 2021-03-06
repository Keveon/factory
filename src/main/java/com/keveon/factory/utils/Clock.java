/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.keveon.factory.utils;

import java.util.Date;

/**
 * 日期提供者，使用它而不是直接取得系统时间，方便测试。
 */
public interface Clock {

    /**
     * The constant DEFAULT.
     */
    Clock DEFAULT = new DefaultClock();

    /**
     * Gets current date.
     *
     * @return the current date
     */
    Date getCurrentDate();

    /**
     * Gets current time in millis.
     *
     * @return the current time in millis
     */
    long getCurrentTimeInMillis();

    /**
     * 默认时间提供者，返回当前的时间，线程安全。
     */
    class DefaultClock implements Clock {

        @Override
        public Date getCurrentDate() {
            return new Date();
        }

        @Override
        public long getCurrentTimeInMillis() {
            return System.currentTimeMillis();
        }
    }

    /**
     * 可配置的时间提供者，用于测试.
     */
    class MockClock implements Clock {

        private long time;

        /**
         * Instantiates a new Mock clock.
         */
        public MockClock() {
            this(0);
        }

        /**
         * .
         *
         * @param date .
         */
        public MockClock(Date date) {
            this.time = date.getTime();
        }

        /**
         * .
         *
         * @param time .
         */
        public MockClock(long time) {
            this.time = time;
        }

        @Override
        public Date getCurrentDate() {
            return new Date(time);
        }

        @Override
        public long getCurrentTimeInMillis() {
            return time;
        }

        /**
         * 重新设置日期
         *
         * @param newDate .
         */
        public void update(Date newDate) {
            time = newDate.getTime();
        }

        /**
         * 重新设置时间
         *
         * @param newTime .
         */
        public void update(long newTime) {
            this.time = newTime;
        }

        /**
         * 滚动时间
         *
         * @param millis .
         */
        public void increaseTime(int millis) {
            time += millis;
        }

        /**
         * 滚动时间.
         *
         * @param millis .
         */
        public void decreaseTime(int millis) {
            time -= millis;
        }
    }

}
