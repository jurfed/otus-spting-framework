package homework1.events;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class EventListener implements ApplicationListener<CustomSpringEvent> {
    @Override
    public void onApplicationEvent(CustomSpringEvent customSpringEvent) {

        System.err.println("Event " + customSpringEvent.getMessage());
    }
}
