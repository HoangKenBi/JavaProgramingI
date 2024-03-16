public class HolidayDemo {
    public static void main(String[] args) {
        Holiday independenceDay = new Holiday("Independence Day", 4, "July");

        System.out.println("Holiday Name: " + independenceDay.getName());
        System.out.println("Day of the Month: " + independenceDay.getDay());
        System.out.println("Month: " + independenceDay.getMonth());

        Holiday christmas = new Holiday("Christmas", 25, "December");
        System.out.println("Are " + independenceDay.getName() + " and " + christmas.getName() + " in the same month? "
                + independenceDay.inSameMonth(christmas));

        Holiday[] holidays = {independenceDay, christmas};

        System.out.println("Average Day of Holidays: " + Holiday.avgDate(holidays));
    }
}
