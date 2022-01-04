package dent;

import java.util.Scanner;
public class Dolznost {

	String title;
	String podrazdel;

	public Dolznost(){
		this.title = "Dolznost title";
		this.podrazdel = "test_pod";
	}

	public Dolznost(String title, String podrazdel){
		this.title = title;
		this.podrazdel = podrazdel;
	}

	public void input(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dolznost Title: ");
		this.title = scanner.nextLine();
		
		System.out.print("Dolzn Podrazdel: ");
		this.podrazdel = scanner.nextLine();
	}

	public void output(){
		System.out.print("Title: " + this.title + ", Podrazdel: " + this.podrazdel + "\n");
	}

	public void changecost(String podrazdel){
		this.podrazdel = podrazdel;
	}

}
