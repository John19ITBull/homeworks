package by.overone.lesson8;

public class Time {
    private int seconds;
    private int minutes;
    private int hours;

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getSeconds() {
        return seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getHours() {
        return hours;
    }

    public static void main(String... args) {
        Time time = new Time();
        time.setSeconds(54);
        time.setMinutes(38);
        time.setHours(5);
        int arg1 = time.getSeconds();
        int arg2 = time.getMinutes();
        int arg3 = time.getHours();
        System.out.println("Seconds in the object: " + (arg1 + arg2 * 60 + arg3 * 3600));
    }
}
