package dent;

import java.util.Scanner;
import java.util.ArrayList;
public class Patient {

	String fio;
	int age;
	String phone;

	public Patient(){
		this.fio = "fio";
		this.age = -1;
		this.phone = "+3413231312";
	}

	public Patient(String fio){
		this.fio = fio;		
	}
	
	public Patient(String fio, int age, String phone){
		this.fio = fio;
		this.age = age_check(age);
		this.phone = phone;
	}

	public int age_check(int age){
		if (age > 0 && age < 120){
			return age;
		}
		else 
		{ 
			System.out.print("Îøèáêà. Âîçğàñò ïàöèåíòà äîëæåí áûòü â ïğîìåæóòêå îò 0 äî 120\n");
			return -1;
		}	
	}

	public void input(){
		Scanner scanner = new Scanner(System.in);
		
		do
        {	System.out.print("ÔÈÎ ïàöèåíòà: ");
            if (scanner.hasNextLine()){               
                this.fio = scanner.nextLine();
            }           
            else
            {
                System.out.println("Ôàìèëèÿ ïàöèåíòà ââåä¸íà íåïğàâèëüíî. Ïîâòîğèòå ââîä.\\n");    
                scanner.nextLine();
            }
        } while (this.fio == "");
					
		do
		{	
			System.out.print("Âîçğàñò ïàöèåíòà: ");	
			try 
			{				
				this.age = age_check(scanner.nextInt()); 
			}
			catch (Exception e){
				System.out.print("Âîçğàñò ïàöèåíòà ââåä¸í íåïğàâèëüíî. Ïîâòîğèòå ââîä.\n");				
				age = -1;
				scanner.nextLine();
			}
		} while (this.age == -1);
		
		scanner.nextLine();
		do
        {	
			System.out.print("Òåëåôîí ïàöèåíòà: ");
            if (scanner.hasNextLine()){               
                this.phone = scanner.nextLine();
            }           
            else
            {
                System.out.println("Òåëåôîí ïàöèåíòà ââåä¸í íåïğàâèëüíî. Ïîâòîğèòå ââîä.\\n");    
                scanner.nextLine();
            }
        } while (this.phone == "");
	}

	public void output(){
		System.out.print("ÔÈÎ ïàöèåíòà: " + this.fio + ", Âîçğàñò ïàöèåíòà: " + this.age + ", Òåëåôîí ïàöèåíòà: " + this.phone + "\n");
	}
	
}
