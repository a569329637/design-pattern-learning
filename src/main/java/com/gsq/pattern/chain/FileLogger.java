package com.gsq.pattern.chain;

/**
 * 责任链模式
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        super(level);
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
