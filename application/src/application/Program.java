package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;	
import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		//PRIMEIRO COMANDO
		//Objeto:
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome");
		
		//Variável:
		
		Post p1 = new Post(
				sdf.parse("04/08/2024 21:11:56"),
				"Traveling to New Zealand", 
				"I'm poing to visit this wonderrful country", 
				12);
		
	    p1.addComment(c1);
	    p1.addComment(c2);
	    
	    Comment c3 = new Comment("Good night");
		Comment c4 = new Comment("May the Force be with you");
		Post p2 = new Post(
				sdf.parse("05/08/2024 22:11:56"),
				"Good night guys", 
				"See you tomorrow", 
				5);
		
	    p2.addComment(c3);// ASSOCIAÇÕES COM AS IFORMAÇÕES. 
	    p2.addComment(c4);
	    
	    
	    System.out.println(p1);
	    System.out.println(p2);
	                                                    //PRIMEIRO COMANDO
	    
		
		
		
		
		
		
	}

}
