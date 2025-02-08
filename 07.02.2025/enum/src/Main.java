enum DaysOfWeek {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

class Enum{
    static boolean isHoliday(DaysOfWeek day) {
        return day == DaysOfWeek.SATURDAY || day == DaysOfWeek.SUNDAY;
    }

    public static void main(String[] args) {
        DaysOfWeek today = DaysOfWeek.WEDNESDAY;

        if (isHoliday(today)) {
            System.out.println(today + " is a Holiday");
        } else {
            System.out.println(today + " is Not a Holiday");
        }
        DaysOfWeek today1 = DaysOfWeek.SUNDAY;
        if (isHoliday(today1)) {
            System.out.println(today1 + " is a Holiday");
        } else {
            System.out.println(today1 + " is Not a Holiday");
        }
    }
}
