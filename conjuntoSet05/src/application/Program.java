package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Set<Log> set = new HashSet<>();
		
		System.out.println("Enter file full path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String txt = br.readLine();
			
			while(txt != null) {
				String[] fields = txt.split(" ");
				String userName = fields[0];
				Date moment = Date.from(Instant.parse(fields[1]));
				
				set.add(new Log(userName, moment));
				txt = br.readLine();
			}
			
			System.out.println();
			System.out.println("Total users: " + set.size());
			System.out.println();
			
			for (Log log : set) {
				System.out.println("Users:" + log);
			}
			
		} catch(IOException e) {
			System.out.println("Error, " + e.getMessage());
		}
			
		sc.close();

	}

}
