package homework1;

import homework1.config.DaoConfig;
import homework1.config.EventConfig;
import homework1.config.ServiceConfig;
import homework1.events.CustomSpringEventPublisher;
import homework1.service.ServiceInterface;
import org.springframework.context.annotation.*;

import java.io.IOException;


public class Main {

    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(DaoConfig.class);
        context.register(ServiceConfig.class);
        context.register(EventConfig.class);
        context.refresh();


        ServiceInterface myService = (ServiceInterface) context.getBean("myService1");

        myService.getTestDao().initTests();

        myService.enterYouName();
        myService.startTests();

        CustomSpringEventPublisher publisher = context.getBean(CustomSpringEventPublisher.class);
        publisher.doStuffAndPublishAnEvent("Hello!!!!!!!!!!!!");
    }


}
