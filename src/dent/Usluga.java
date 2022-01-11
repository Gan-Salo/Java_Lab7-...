package dent;

import java.util.Scanner;
public class Usluga {

	String title;
	int cost;
	private HelpClass help;

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
			System.out.print("Ошибка. Стоимость услуги должна быть в промежутке от 0 до 1000000\n");
			return -1;
		}	
	}

		public void input(){		
		Scanner scanner = new Scanner(System.in);				
		do
        {   
			System.out.print("Название услуги: ");
            if (scanner.hasNextLine()){               
            	this.title = scanner.nextLine();
            }           
            else
            {
                System.out.println("Фамилия пациента введёна неправильно. Повторите ввод.\\n");    
                scanner.nextLine();
            }
        } while (this.title == "");
		
		do
		{
			System.out.print("Стоимость услуги: ");
			try 
			{
				this.cost = cost_check(scanner.nextInt()); 
			}
			catch (Exception e){
				System.out.print("Стоиимость услуги введена неправильно. Повторите ввод.\n");				
				cost = -1;
				scanner.nextLine();
			}		
		} while (cost == -1);
	}

	public void output(){
		System.out.print("Название услуги: " + this.title + ", Стоимость услуги: " + this.cost + "\n");
	}

	public void changetitle(String title){
		this.title = title;
	}
	
	public static void get_cost(HelpClass obch, Usluga usl)
	{
		obch.obch_cost += usl.cost;
	}
}

class HelpClass {
	
	static int obch_cost = 0;	
	static int counter = 0;
	
}
