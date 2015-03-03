package application;

import notification.NotificationEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;

public class ApplicationEventListener implements ApplicationListener<NotificationEvent> {
    Logger log = LoggerFactory.getLogger(ApplicationEventListener.class);
    @Override
    public void onApplicationEvent(NotificationEvent notificationEvent) {
        log.info("Event received {} at {} with source {}",notificationEvent.getClass());
        System.out.println("Message: " + notificationEvent.getNotification());

    }
}
