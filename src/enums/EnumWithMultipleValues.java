package enums;

import java.nio.file.WatchEvent;

public class EnumWithMultipleValues {
    enum WeekDays{
        MONDAY("Marketing Monday"),
        TUESDAY("Trendy Tuesday"),
        WEDNESDAY("Wellness Wednesday"),
        THURSDAY("Thankful Thursday"),
        FRIDAY("Foodie Friday"),
        SATURDAY("Social Saturday", true),
        SUNDAY("Sunday Funday", true);
        private String dayGreetings;
        private boolean isWeekend;
        WeekDays(final String dayGreetings){
            this.dayGreetings=dayGreetings;
        }
        WeekDays(final String dayGreetings, final boolean isWeekend){
            this.dayGreetings=dayGreetings;
            this.isWeekend=isWeekend;
        }
        public String getDayGreetings(){
            return this.dayGreetings;
        }
        public boolean isWeekend(){
            return isWeekend;
        }
    }
    public static void main(String[] args) {
        WeekDays rDay = WeekDays.MONDAY;
        WeekDays wDay = WeekDays.SATURDAY;
        if (rDay==WeekDays.MONDAY){
            System.out.println(WeekDays.MONDAY.getDayGreetings());
        }
        if (wDay==WeekDays.SATURDAY){
            System.out.println(WeekDays.SATURDAY.getDayGreetings());
            System.out.println(WeekDays.SATURDAY.isWeekend());
        }
    }
}
