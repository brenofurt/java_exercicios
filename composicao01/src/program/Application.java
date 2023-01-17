package program;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import entities.Comment;
import entities.Post;

public class Application {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		
		
		Comment c1 = new Comment("Have a nice trip! ");
		Comment c2 = new Comment ("Wow thats awesome! ");
		
		Post p1 = new Post(
				sdf.parse("21/06/2018 13:05:44"), //Esse aqui passa a String para data / sdf.format faz o contrário
				"Traveling to new zeland",
				"Im going to visit this wonderful country!",
				12);
		p1.addComment(c1);
		p1.addComment(c2);

		System.out.println(p1);
		
		
		
		
		

	}

}
