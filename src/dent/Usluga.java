package dent;

import java.util.Scanner;
public class Usluga {

	String title;
	int cost;

	public Usluga(){
		this.title = "title";
		this.cost = -1;
	}

	public Usluga(String title, int cost){
		this.title = title;
		this.cost = cost_check(cost);
	}

	public int cost_check(int cost){
		if (cost > 0 && cost < 1000000){
			return cost;
		}
		else{ 
			System.out.print("Cost error (from 1 to 1000000)\n");
			return -1;
		}	
	}

		public void input(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Usluga title: ");
		this.title = scanner.nextLine();
		
		while (cost < 0){
			System.out.print("Usluga Cost: ");
			try {

				this.cost = cost_check(scanner.nextInt()); 
			}
			catch (Exception e){
				System.out.print("Error cost.\n");				
				cost = -1;
				scanner.nextLine();
			}		
		}
	}

	public void output(){
		System.out.print("Usluga title: " + this.title + ", Cost: " + this.cost + "\n");
	}

	public void changetitle(String title){
		this.title = title;
	}
	
}