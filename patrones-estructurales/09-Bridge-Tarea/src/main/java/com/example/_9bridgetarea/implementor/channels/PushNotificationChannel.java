package com.example._9bridgetarea.implementor.channels;

import com.example._9bridgetarea.implementor.NotificationChannel;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PushNotificationChannel implements NotificationChannel {
    @Override
    public void send(String message) {
        log.info("enviando mensaje via Push: {}", message);
    }
}
