package application;

import org.springframework.context.ApplicationEvent;

public interface ApplicationEventPublisher {
 void publisNotification(ApplicationEvent event);
}
