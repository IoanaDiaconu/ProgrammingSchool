package notification;

import org.springframework.context.ApplicationEvent;


public class NotificationEvent extends ApplicationEvent {
    final String message;

    public NotificationEvent(Object source, String message) {
        super(source);
        this.message = message;
    }


    public String getNotification() {
        return message;
    }

    @Override
    public String toString() {
        return "NotificationEvent{" +
                "message='" + message + '\'' +
                '}';
    }
}
