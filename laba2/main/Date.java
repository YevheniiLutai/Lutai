public class Date {
    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
    @Command(name = "Отримати день",
            args = "",
            desc = "Повертає день типу int")
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    @Command(name = "Отримати місяць",
            args = "",
            desc = "Повертає місяць типу int")
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    @Command(name = "Отримати рік",
            args = "",
            desc = "Повертає рік типу int")
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    private int day;
    private int month;
    private int year;


}
