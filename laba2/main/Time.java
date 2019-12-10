public class Time extends Date{
private int hour;
private int minute;

    @Command(name = "Отримати години",
            args = "",
            desc = "Повертає годину типу int")
    public int getHour() {
        return hour;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                '}';
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    @Command(name = "Отримати хвилини",
            args = "",
            desc = "Повертає хвилини типу int")
    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public Time(int day, int month, int year, int hour, int minute) {
        super(day, month, year);
        this.hour = hour;
        this.minute = minute;
    }
}
