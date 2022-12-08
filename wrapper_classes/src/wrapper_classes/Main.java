package wrapper_classes;

import entities.Wrapper;

public class Main {

	public static void main(String[] args) {
		
		Integer x = 10;
		int y = x + 2;  // fiz um wrapper class e nao precisei fazer o casting
		System.out.println(y);
		
		Double b = 80.0;
		double a = b;
		
		System.out.println(a);
		
		int z = 25;
		Wrapper wrapper = new Wrapper(z);
		System.out.println(wrapper.z);
		
		

		

	}

}
