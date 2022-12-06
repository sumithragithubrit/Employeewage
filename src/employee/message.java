package employee;
import java.util.Scanner;

public class message {
    static final int FULL_DAY_HOUR = 8;
    static final int PART_TIME_HOUR = 4;
    static final int IS_FULL_TIME = 2;
    static final int IS_PART_TIME = 1;
    static int  wagePerHour ;
    static int workingHoursPerMonth ;
    static int workingDaysPerMonth ;
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your count of company's");
        int company = sc.nextInt();
        for ( int i = 1 ; i<= company ; i++ ){
            System.out.println("Enter wage per hour ");
            wagePerHour = sc.nextInt();
            System.out.println("Enter workingHoursPerMonth ");
            workingHoursPerMonth = sc.nextInt();
            System.out.println("Enter workingDaysPerMonth ");
            workingDaysPerMonth = sc .nextInt();
        }
        refactor();

    }
    public static void refactor(){         
        int totalWage = 0;
        int dayCount = 1;
        int workingHours = 0;
        while (dayCount <workingDaysPerMonth  && workingHours <workingHoursPerMonth  ) {
            int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
            System.out.println(employeeCheck);
            int dailyWage = 0;
            switch (employeeCheck) {
            case 1:
                dailyWage = PART_TIME_HOUR * wagePerHour;
                workingHours = PART_TIME_HOUR;
                System.out.println("Employee is part time " +dailyWage);
                break;
            case 2:
                dailyWage = FULL_DAY_HOUR * wagePerHour;
                workingHours =FULL_DAY_HOUR;
                System.out.println("Employee is full time " +dailyWage);
                break;
            default:
                System.out.println("Employee is Absent");
                break;
        }
        dayCount++;
        totalWage = totalWage +dailyWage;
    }
    System.out.println("Total hours "+ workingHours);
    System.out.println(" totalWage wage for month "+ totalWage);
    }
}