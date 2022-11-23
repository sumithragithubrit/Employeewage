package employee;
import java.util.Random;

public class message {
	static final int WAGE_PER_HOUR = 20;

	static final int FULL_DAY_HOUR = 8;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		int employeecheck=(int)Math.floor(Math.random()*10)%2;
	int dailywage=0;
        System.out.println(employeecheck);
        if(employeecheck==1)
        {
        	System.out.println("Employee is present");
        	 int dailyWage = FULL_DAY_HOUR * WAGE_PER_HOUR; 
        	 
        }
       
        else {
        	System.out.println("Employee is absent");
        }
        System.out.println("Employee Daily Wage is"+dailywage);
	}

}
