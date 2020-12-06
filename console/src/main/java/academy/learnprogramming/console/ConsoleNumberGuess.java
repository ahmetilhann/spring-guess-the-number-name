package academy.learnprogramming.console;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ConsoleNumberGuess {

    private final static Logger log = LoggerFactory.getLogger(ConsoleNumberGuess.class);

    @EventListener
    public void start(ContextRefreshedEvent event) {
        log.info("start() ----> Container ready for use.");
    }


}
