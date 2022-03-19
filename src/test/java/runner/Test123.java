package runner;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Test123 {
	
	
	@Test
	public void test()
	{
		String x ="Sruthi";
		
	String[] y={"Sruthi","Pradeep","Raj"};
	
	System.out.println(y.length);
	
		System.out.println(y[0]);
		
		
		for(String z : y)
		{
				System.out.println(z);
		}
		
		// it will allow duplicate values
		List<String> data = new ArrayList<String>();
		System.out.println(data);
		data.add("Sruthi");
		data.add("Pradeep");
		
		System.out.println(data);
		
		
		
		List<Integer> intdata = new ArrayList();
		intdata.add(10);
		
		System.out.println(intdata);
		
	}

}
