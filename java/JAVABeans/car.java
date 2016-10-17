package JAVABeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class car {
	private static String carname;
	
	public static void setCarname(String carname) {
		car.carname = carname;
	}
	public void printdata()
	{
		System.out.println("Engine Name is : "+carname);
	}
}
