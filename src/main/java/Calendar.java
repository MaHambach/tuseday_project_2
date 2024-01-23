public class Calendar {

    public static void main(String [] args){
        printCalendarForMonth("January");
        printCalendarForMonth("February");
        printCalendarForMonth("March");
        printCalendarForMonth("April");
        printCalendarForMonth("May");
        printCalendarForMonth("June");
        printCalendarForMonth("July");
        printCalendarForMonth("August");
        printCalendarForMonth("September");
        printCalendarForMonth("October");
        printCalendarForMonth("November");
        printCalendarForMonth("December");
    }

    public static void printCalendarForMonth(String monthName){
        System.out.println(monthName);
        System.out.println("Mo Tu We Th Fr Sa Su");
        printNumbers(31);

        System.out.println();
        // weitere funktionen hier einfügen?
    }

    public static void printNumbers(int numberOfDays){
        for(int i = 1; i<numberOfDays+1; i++){
            System.out.format("%2d ", i);
            if(i % 7==0 ) System.out.println();
        }
    }
}
