package homework1.events;

import org.springframework.context.ApplicationEvent;

public class CustomSpringEvent extends ApplicationEvent {
private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CustomSpringEvent(Object source, String message) {
        super(source);
        this.message = message;
    }

    public CustomSpringEvent(Object source) {
        super(source);
    }
}
