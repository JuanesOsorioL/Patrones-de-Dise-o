package com.example._9bridgetarea.implementor.channels;

import com.example._9bridgetarea.implementor.NotificationChannel;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class EmailChannel implements NotificationChannel {
    @Override
    public void send(String message) {
        log.info("enviando mensaje via Correo electronico: {}", message);
    }
}
