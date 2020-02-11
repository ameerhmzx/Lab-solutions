import java.util.Scanner;

public class ClockTime {
    public static void main(String[] args) {
        TimeOfDay myClock = new TimeOfDay(5, 26, 30), yourClock = new TimeOfDay();
        myClock.print();
        yourClock.print();

        yourClock.set(5, 26, 30);
        yourClock.print();

        System.out.println(yourClock.isEqual(myClock));

        Scanner scnr = new Scanner(System.in);
        int h = scnr.nextInt();
        int m = scnr.nextInt();
        int s = scnr.nextInt();
        myClock.set(h, m, s);

        myClock.addHours(3);
        int[] time = myClock.get();
        System.out.printf("Hours: %d, Min: %d, Sec: %d\n", time[0], time[1], time[2]);
    }
}

class TimeOfDay {
    private int hour;
    private int min;
    private int sec;

    TimeOfDay() {
        this.hour = 0;
        this.sec = 0;
        this.min = 0;
    }

    TimeOfDay(int h, int m, int s) {
        this.hour = h;
        this.sec = m;
        this.min = s;
    }

    void set(int h, int m, int s) {
        if (h >= 0 && h < 25 && m >= 0 && m <= 60 && s >= 0 && s <= 60) {
            this.hour = h;
            this.min = m;
            this.sec = s;
        }
    }

    int[] get() {
        return new int[]{this.hour, this.min, this.sec};
    }

    void print() {
        System.out.printf("%02d:%02d:%02d\n", this.hour, this.min, this.sec);
    }

    void addHours(int hour) {
        if (this.hour + hour > 24) return;
        this.hour += hour;
    }

    void addMin(int min) {
        if (this.min + min > 60) return;
        this.min += min;
    }

    void addSec(int sec) {
        if (this.sec + sec > 60) return;
        this.sec += sec;
    }

    boolean isEqual(TimeOfDay time) {
        if (time.hour == this.hour && time.min == this.min && time.sec == this.sec) return true;
        return false;
    }
}
