package academy.learnprogramming.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfig {

    private int maxNumber = 50;

    private int guessCount = 8;

    @Bean
    public int maxNumber() {
        return maxNumber;
    }

    @Bean
    public int guessCount() {
        return guessCount;
    }
}
