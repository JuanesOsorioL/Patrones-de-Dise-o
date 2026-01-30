package com.example._9bridgetarea.abtraction;

import com.example._9bridgetarea.implementor.NotificationChannel;

public abstract class Notification {
    protected NotificationChannel channel;

    protected Notification(NotificationChannel channel) {
        this.channel = channel;
    }
    public void setChannel(NotificationChannel channel) {
        this.channel = channel;
    }

    protected abstract void sendNotification(String mensaje);

    //protected abstract void setChannel(NotificationChannel channel);


}
