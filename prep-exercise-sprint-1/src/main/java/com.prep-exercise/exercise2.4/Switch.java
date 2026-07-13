

public class Switch {

    public static void main(String[] args) {

        int day = 4;

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("Invalid day");
        }


        String workDays = "Sunday";

        switch (workDays){
            case "Saturday", "Sunday" -> System.out.println("It's a weekend");
            case "Monday" -> System.out.println("Weak up at 8 AM");
            default -> System.out.println("Weak up at 7 AM");
        }


        String checkWorkDay = "Tuesday";
        String result;

        result = switch (checkWorkDay) {
            case "Saturday", "Sunday" -> "It's a weekend";
            case "Monday" -> "Weak up at 8 AM";
            default -> "Weak up at 7 AM";
        };

        System.out.println(result);

    }
}

/*
Explain why switch in Java differs from JavaScript (e.g. type safety)?

Type Safety
Java is strictly typed. The variable you switch on must be a specific type
and every case must match that exact type.

If you try case "four" against an int, Java refuses to compile
It catches the mismatch before the code even runs.

JavaScript is loosely typed. It uses == or === comparison,
and you can accidentally mix types with surprising results
no compile-time protection.

*/