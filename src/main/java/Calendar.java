public class Calendar {

    public static void main(String [] args){
        int[] offsetDays = {0, 3, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6};
        String[] monthNames = {
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"
        };

        for (int i = 0; i < 12; i++){
            printCalendarForMonth(monthNames[i], offsetDays[i]);
        }
    }

    public static void printCalendarForMonth(String monthName, int offset){
        System.out.println(monthName);
        System.out.println("Mo Tu We Th Fr Sa Su");
        printNumbers(daysInMonth(monthName), offset);

        System.out.println("\n");
    }

    public static int daysInMonth(String monthName){
        if(monthName.equals("February"))
            return 29;

        if (monthName.equals("April")
        || monthName.equals("June")
        || monthName.equals("September")
        || monthName.equals("November")
        )
            return 30;

        return 31;
    }

    public static void printNumbers(int numberOfDays, int offsetDays){
        for(int i =0; i<offsetDays; i++) System.out.print("   ");
        for(int i = 1; i<numberOfDays+1; i++){
            System.out.format("%2d ", i);
            if((i+offsetDays) % 7==0 ) System.out.println();
        }
    }
}
