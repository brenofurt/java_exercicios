package boxing_unboxing;

public class Main {

	public static void main(String[] args) {
		
		int x = 20;
		Object obj = x; // aqui nao precisa de casting
		
		System.out.println(obj);
		
		int y = (int) obj;  //aqui precisou fazer o casting
		
		System.out.println(y); 
		
		Wrapper wrapper = new Wrapper(y)

	}

}
