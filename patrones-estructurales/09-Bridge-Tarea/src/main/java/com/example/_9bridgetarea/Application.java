package com.example._9bridgetarea;

import com.example._9bridgetarea.abtraction.types.AlertNotification;
import com.example._9bridgetarea.abtraction.types.PushNotification;
import com.example._9bridgetarea.abtraction.types.RemindNotification;
import com.example._9bridgetarea.implementor.channels.EmailChannel;
import com.example._9bridgetarea.implementor.channels.PushNotificationChannel;
import com.example._9bridgetarea.implementor.channels.SMSChannel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    /**
     * ! Patrón Bridge
     * Este patrón nos permite desacoplar una abstracción de su implementación,
     * de tal forma que ambas puedan variar independientemente.
     * <p>
     * * Es útil cuando se tienen múltiples implementaciones de una abstracción
     * * Se puede utilizar para separar la lógica de negocio de la lógica de presentación
     * * Se puede utilizar para separar la lógica de la interfaz de usuario también.
     *
     */

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        EmailChannel email = new EmailChannel();
        PushNotificationChannel push = new PushNotificationChannel();
        SMSChannel sms = new SMSChannel();


        AlertNotification alert = new AlertNotification(email);

        alert.sendNotification("Alerta de seguridad : se ha detectado un acceso no autorizado");

        alert.setChannel(sms);
        alert.sendNotification("Alerta de seguridad : se ha detectado un acceso no autorizado");


        RemindNotification reminder = new RemindNotification(sms);

        reminder.sendNotification("Recordatorio: Tu cita con el médico es mañana a las 10:00 a.m.");
        reminder.setChannel(email);
        reminder.sendNotification("Recordatorio: Tu cita con el médico es mañana a las 10:00 a.m.");

        PushNotification pushs = new PushNotification(push);
        pushs.sendNotification("Nueva actualización disponible. Haz clic para instalar.");


    }

}
