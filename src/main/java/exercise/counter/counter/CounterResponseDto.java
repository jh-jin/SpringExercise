package exercise.counter.counter;

public class CounterResponseDto {
    private int count;

    public CounterResponseDto(int count) {
        this.count = count;
    }

    public int getcount() {
        return count;
    }

    public void setcount(int count) {
        this.count = count;
    }
}
