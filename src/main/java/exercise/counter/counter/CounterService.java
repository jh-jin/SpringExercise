package exercise.counter.counter;

import org.springframework.stereotype.Service;

@Service
public class CounterService {
    private int count = 0;

    public int incrementAndGet() {
        return ++count;
    }

    public void resetCount(){
        count = 0;
    }

}
