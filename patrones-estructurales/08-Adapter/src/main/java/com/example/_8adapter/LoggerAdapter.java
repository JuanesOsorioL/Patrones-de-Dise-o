package com.example._8adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoggerAdapter implements ILoggerAdapter {


    private String file = "";

    public LoggerAdapter(String file) {
        this.file = file;
    }

    @Override
    public void writeLog(String message) {
        log.info("[{} log] {}", this.file, message);
    }

    @Override
    public void writeError(String message) {
        log.error("[{} error] {}", this.file, message);
    }

    @Override
    public void writeWarning(String message) {
        log.warn("[{} warning] {}", this.file, message);
    }
}
