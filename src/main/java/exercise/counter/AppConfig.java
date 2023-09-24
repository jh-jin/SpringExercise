package exercise.counter;

import exercise.counter.counter.CounterService;
import exercise.counter.counter.CounterServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.w3c.dom.css.Counter;

@Configuration
public class AppConfig {
    @Bean
    public CounterService counterService() {
        return new CounterServiceImpl();
    }
}
