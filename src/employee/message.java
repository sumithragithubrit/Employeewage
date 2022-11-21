package employee;
import java.util.Random;

public class message {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
		int employeecheck=(int)Math.floor(Math.random()*10)%2;
		
        System.out.println(employeecheck);
        if(employeecheck==0)
        {
        	System.out.println("Employee is present");
        	
        }
       
        else {
        	System.out.println("Employee is absent");
        }
        
	}

}
