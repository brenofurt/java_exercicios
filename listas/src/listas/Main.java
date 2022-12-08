package listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List <String> list = new ArrayList<String>();  // A lista não aceita tipos primitivos e não aceita estanciar com o nome List (diferente do molde da estanciação da classe.
							 // é preciso implementar a classe ArrayList para poder estanciar a lista.
							// ess implementação é a mais otimizada, pois ela pega as melhores caracteristicas do vetor e da lista
							// colocar string dentro do ArrayList<String>() é opcional pois as ultimas versoes não precisam.	
		
		list.add("Maria");
		list.add("yasmim");
		list.add("Mauro");
		list.add("Marcelo");
		list.add("Catia");
		list.add("Breno");
		list.add("Bernardo");
		list.add(0, "Marcos"); // para adicionar um elemento na posição que voce quer da lista, se coloca list.add(posição, nomeDoElemento) lembrando que as posiçoes começam no 0
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------");
		System.out.println("Tamanho da lista " + list.size()); // para sabermos o tamanho da lista usamos sysout(list.size());
		
		list.remove("Maria"); // para removermos um elemento da lista usamos list.remove("nomeDoElemento");
		list.remove(1); // eu tbm posso remover usando a posição desse jeito list.remove(NumeroDaposição);
		
		System.out.println("------------------");
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("--------------------");
		list.removeIf(x -> x.charAt(0) == 'B'); // quando queremos retirar alguns elementos da lista podemos usar um caracter como referência
												//  usando a expressão lambda nomeDaLista.removeIf(x -> x.charAt(0) == 'caracter'
												// essa função retorna em verdadeiro ou falso (ela é chamada de predicado.
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("--------------------");
		
		System.out.println("index of Marcos: " + list.indexOf("Marcos")); //pra encontrar a posição do elemento eu uso o sysout(list.indexOf("elemento"));
		
		System.out.println("index of Gabriel: " + list.indexOf("Gabriel")); // quando o indexOf não encontra o elemento ele retorna -1
		
		/* agora eu quero deixar na lista somente pessoas com a letra na posição inicial(primeira letra do nome) nesse caso 'M'
		 Pra isso eu preciso estanciar uma nova lista, dar outro nome pra ela, nesse caso chamerei de result
		e então filtrarei os elementos com iniciais 'M' fazendo uma outra lista receber esses elementos.
		*/
		
		System.out.println("----------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		/* primeiro eu pego a lista e converto ela para um tipo stream assim: nomeDaLista.stream()) que é
		  um tipo especial do java 8 em diante que aceita operações com expressões lamgbda. 
		  Depois, a partir desse stream eu chamo a função filter que recebe um predicado assim
		   nomeDaLista.stream().filter(x -> x.charAt(0) == 'M') esse fillter vai me devolver um stream filtrado
		   conforme esse predicado aqui: (x -> x.charAt(0) == 'M'). Só que esse stream não é compatível com list 
		   então eu preciso converter ele novamente pra list, pra isso eu chamo a função collect e dentro do parenteses
		   eu coloco .collect(collectors.toList()); fazendo com que ela fique assim:
		    List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		    recapitulando: 
		    primeiro eu converto pra stream: .stream()
		    depois faço a operação lamgbda que quero: .filter(x -> x.charAt(0) == 'M')
		    e então volto ele pra lista: .collect(Collectors.toList()); 
		*/
		
		for(String x : result) {
			System.out.println(x);
		}
		
		System.out.println("------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		/* para encontrar o primeiro elemento que começa com a letra desejada eu tenho que estanciar uma variavel e fazer 
		 ela receber o list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null); (esse findFirst retorna um optional String
		 que também é do java 8 em diante) ele vai pegar o primeiro elemento dessa stream que atende ao predicado, se o elemento não existir
		 ele irá me retornar null
		*/
		
		System.out.println(name);
		
	}

}
