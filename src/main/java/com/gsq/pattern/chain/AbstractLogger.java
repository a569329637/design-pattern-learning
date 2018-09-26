package com.gsq.pattern.chain;

/**
 * 责任链模式
 */
public abstract class AbstractLogger {

    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;
    protected AbstractLogger nextLogger;

    public AbstractLogger(int level) {
        this.level = level;
    }

    public void setNextLogger(AbstractLogger logger) {
        nextLogger = logger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        } else {
            nextLogger.logMessage(level, message);
        }
    }

    protected abstract void write(String message);

}
