package hello;

import org.springframework.stereotype.Component;

/**
 * Created by Jayson San Agustin on 28/05/2017.
 */
@Component
public class MessagePrinter {
    final private  MessageService service;

    public MessagePrinter(MessageService service) {
        this.service = service;
    }

    public void printMessage(){
        System.out.println(this.service.getMessage());
    }
}
