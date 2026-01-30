package com.example._9bridgetarea.abtraction.types;

import com.example._9bridgetarea.abtraction.Notification;
import com.example._9bridgetarea.implementor.NotificationChannel;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RemindNotification extends Notification {

    public RemindNotification(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void sendNotification(String mensaje) {
        channel.send("Notificación de Recordatorio");
        this.channel.send(mensaje);
    }

}
