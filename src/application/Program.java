package application;

import entities.Printer;
import entities.Scanner;

public class Program {

	public static void main(String[] args) {
		
		
		Printer p = new Printer("1080");
		p.processDoc("My Letter");
		p.print("My Letter");
		
		System.out.println();
		
		Scanner s = new Scanner("2080");
		s.processDoc("My Email");
		System.out.println("Scan result: " + s.scan());
	}

}
