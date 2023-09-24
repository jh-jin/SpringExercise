package exercise.counter;

import exercise.counter.counter.CounterService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CounterApp {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        CounterService counterService = applicationContext.getBean("counterService", CounterService.class);
    }
}
