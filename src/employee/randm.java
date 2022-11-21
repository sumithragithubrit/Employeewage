package employee;
import java.util.Random;
public class randm {
	
	public static void main(String[] args) {
		int i;
		Random rand=new Random();
		for(i=0;i<=10;i++)
		{
			System.out.println( rand.nextInt(6));
		}
	}

}
