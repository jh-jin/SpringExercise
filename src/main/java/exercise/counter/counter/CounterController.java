package exercise.counter.counter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CounterController {
    @Autowired
    private CounterService counterService;

    @GetMapping("/count")
    public CounterResponseDto getCount() {
        return new CounterResponseDto(counterService.getCount());
    }

    @Scheduled(fixedDelay = 10000)  // 10초마다
    public void resetCount() {
        counterService.resetCount();
    }
}
