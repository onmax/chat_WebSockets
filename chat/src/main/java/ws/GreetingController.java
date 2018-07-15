package ws;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {

    @MessageMapping("/message")
    @SendTo("/topic/greetings")
    public Greeting greeting(Message message) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new Greeting(
                HtmlUtils.htmlEscape(message.getName()) + ": " + HtmlUtils.htmlEscape(message.getMessage()));
    }

}