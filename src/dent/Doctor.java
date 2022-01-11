package dent;

import java.util.Scanner;
public class Doctor {

	String fio;
	int age;
	String phone;
	Dolznost dolzn;
	String kategory;

	public Doctor(){
		this.fio = "fio";
		this.age = -1;
		this.phone = "Error";
		this.dolzn = new Dolznost();
		this.kategory = "kategory";
	}
	
	public Doctor(String fio){
		this.fio = fio;
		
	}

	public Doctor(String fio, int age, String phone, Dolznost dolzn, String kategory){
		this.fio = fio;
		this.age = age_check(age);
		this.phone = phone;
		this.dolzn = dolzn;
		this.kategory = kategory;
	}

	public int age_check(int age){
		if (age > 0 && age < 120){
			return age;
		}
		else 
		{ 
			System.out.print("Îøèáêà. Âîçğàñò äîêòîğà äîëæåí áûòü â ïğîìåæóòêå îò 0 äî 120\n");
			return -1;
		}	
	}

	public void input(){
		Scanner scanner = new Scanner(System.in);				
		do
        {	
			System.out.print("ÔÈÎ âğà÷à: ");
            if (scanner.hasNextLine()){               
            	this.fio = scanner.nextLine();
            }           
            else
            {
                System.out.println("Êàòåãîğèÿ ââåä¸íà íåïğàâèëüíî. Ïîâòîğèòå ââîä.\\n");    
                scanner.nextLine();
            }
        } while (this.fio == "");
			
		do 
		{
			System.out.print("Âîçğàñò âğà÷à: ");
			try {

				this.age = age_check(scanner.nextInt()); 
			}
			catch (Exception e){
				System.out.print("Âîçğàñò âğà÷à ââåä¸í íåïğàâèëüíî. Ïîâòîğèòå ââîä.\n");				
				age = -1;
				scanner.nextLine();
			}
			
		} while (age < 0);
		scanner.nextLine();

		do
        {	
			System.out.print("Òåëåôîí âğà÷à: ");
            if (scanner.hasNextLine()){               
                this.phone = scanner.nextLine();
            }           
            else
            {
                System.out.println("Òåëåôîí âğà÷à ââåä¸í íåïğàâèëüíî. Ïîâòîğèòå ââîä.\\n");    
                scanner.nextLine();
            }
        } while (this.phone == "");
		
		this.dolzn.input();
		
		do
        {	
			System.out.print("Êàòåãîğèÿ: ");
            if (scanner.hasNextLine()){               
            	this.kategory = scanner.nextLine();
            }           
            else
            {
                System.out.println("Êàòåãîğèÿ ââåä¸íà íåïğàâèëüíî. Ïîâòîğèòå ââîä.\\n");    
                scanner.nextLine();
            }
        } while (this.kategory == "");
	}

	public void output(){
		System.out.print("ÔÈÎ âğà÷à: " + this.fio + ", Âîçğàñò âğà÷à: " + this.age + ", Òåëåôîí âğà÷à: " + this.phone + ", Äîëæíîñòü: " + this.dolzn.title + ", Êàòåãîğèÿ: " + this.kategory + "\n");
	}

}