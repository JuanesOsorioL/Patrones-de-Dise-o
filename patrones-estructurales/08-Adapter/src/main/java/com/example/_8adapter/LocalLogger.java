package com.example._8adapter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LocalLogger {
    private final String file;

    public LocalLogger(String file) {
        this.file = file;
    }

    public void writeLog(String message) {
        log.info("[{} log] {}", this.file, message);
    }

    public void writeError(String message) {
        log.error("[{} error] {}", this.file, message);
    }

    public void writeWarning(String message) {
        log.warn("[{} warning] {}", this.file, message);
    }

}
