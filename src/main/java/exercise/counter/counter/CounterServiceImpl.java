package exercise.counter.counter;

import org.springframework.stereotype.Service;

@Service
public class CounterServiceImpl implements CounterService {
    private int count = 0;

    @Override
    public int getCount() {
        return incrementAndGet();
    }

    @Override
    public void resetCount(){
        count = 0;
    }

    public int incrementAndGet() {
        return ++count;
    }
}
