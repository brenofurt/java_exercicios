
public class Main {

	public static void main(String[] args) {
		
		String original = "    abcde FGHIJ ABC abc DEFG    ";
		
		String s01 = original.toLowerCase(); //coloca a string inteira em caixa baixa.
		System.out.println(original + "(Original)");
		System.out.println(s01);
		
		String s02 = original.toUpperCase();   //coloca a string inteira em caixa alta.
		System.out.println(s02); 
		
		String s03 = original.trim();  // anula os espaços sobrando antes e depois
		System.out.println(s03);
		
		String s04 = original.substring(2); // vai guardar a partir da posiçao indicada nos parêntese
		System.out.println(s04);
		
		String s05 = original.substring(10, 20); // vai guardar a partir da posiçao indicada nos parêntese e terminar a partir da posiçao indicada no parêntse
		System.out.println(s05);
		
		String s06 = original.replace('a', 'x'); // troca um caractere pelo o outro, dentro dos parênteses
		System.out.println(s06);
		
		String s07 = original.replace("abc", "xy"); // troca uma string por outra, dentro dos parênteses
		System.out.println(s07);
		
		int s08 = original.indexOf("bc"); // conta o número de ocorrências digitados antes de chegar na string ou caractere que esta dentro do parêntese
		System.out.println(s08);
		
		int s09 = original.lastIndexOf("bc"); // conta o número de ocorrências digitados após chegar na string ou caractere que esta dentro do parêntese
		System.out.println(s09);
		
		
		
		
		
		
		

	}

}
