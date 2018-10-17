package Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class randomselect {

	public static void main(String[] args)
	{
		List<String> list= new ArrayList<String>();
		list.add("One");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		
		Random r = new Random();
		String strselect = list.get((r.nextInt(list.size())));
		System.out.println(strselect);
		
	}

}
