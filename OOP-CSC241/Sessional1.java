import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        System.out.println("Press enter to stop the stopwatch");
        scanner.nextLine();
        stopWatch.stop();

        System.out.printf("Time elapsed: %d", stopWatch.getElapsedTime());
    }
}

class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    StopWatch() {
        this.startTime = LocalTime.now();
    }

    void start() {
        this.startTime = LocalTime.now();
    }

    void stop() {
        this.endTime = LocalTime.now();
    }

    int getElapsedTime() {
        return (int) Duration.between(startTime, endTime).toMillis();
    }

    public boolean equals(StopWatch obj) {
        return startTime.equals(obj.startTime) && endTime.equals(obj.endTime);
    }
}
