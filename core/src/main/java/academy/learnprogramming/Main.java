package academy.learnprogramming;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("Guess The Game");

        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        NumberGenerator numberGenerator = context.getBean(NumberGenerator.class);

        int number = numberGenerator.next();

        log.info("Number: {}", number);

        MessageGenerator messageGenerator = context.getBean(MessageGenerator.class);
        log.info("getMainMessage = {}", messageGenerator.getMainMessage());
        log.info("getResultMessage = {}", messageGenerator.getResultMessage());

        context.close();
    }
}
