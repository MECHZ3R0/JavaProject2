package enums;

public class EnumWithIf {
    enum MonthNames{
        MARCH, JUNE, SEPTEMBER, DECEMBER
    }

    public static void main(String[] args) {
        MonthNames month = MonthNames.JUNE;
        if (month==MonthNames.MARCH){
            System.out.println("Welcome Spring");
        }
        else if (month==MonthNames.JUNE){
            System.out.println("Summer Time");
        }
        else if (month==MonthNames.SEPTEMBER){
            System.out.println("Fall Leaves");
        }
        else if (month==MonthNames.DECEMBER){
            System.out.println("Snow Time");
        }
    }
}
