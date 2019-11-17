package homework1.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
public class CustomSpringEventPublisher {

    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    public void doStuffAndPublishAnEvent(final String messasge){
        System.err.println("publis custom event");
        CustomSpringEvent customSpringEvent = new CustomSpringEvent(this, messasge);
        applicationEventPublisher.publishEvent(customSpringEvent);
    }

}
