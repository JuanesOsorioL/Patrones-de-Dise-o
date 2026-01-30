package com.example._9bridgetarea.abtraction.types;

import com.example._9bridgetarea.abtraction.Notification;
import com.example._9bridgetarea.implementor.NotificationChannel;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PushNotification extends Notification {

    public PushNotification(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void sendNotification(String mensaje) {
        channel.send("Notificación de Push");
        this.channel.send(mensaje);
    }

}
