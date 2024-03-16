public class Holiday {
    private String name;
    private int day;
    private String month;

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
    }
    public boolean inSameMonth(Holiday otherHoliday) {
        return this.month.equals(otherHoliday.month);
    }

    public static double avgDate(Holiday[] holidays) {
        int sum = 0;
        for (Holiday holiday : holidays) {
            sum += holiday.day;
        }
        return (double) sum / holidays.length;
    }

    public String getName() {
        return name;
    }

    public int getDay() {
        return day;
    }

    public String getMonth() {
        return month;
    }
}
