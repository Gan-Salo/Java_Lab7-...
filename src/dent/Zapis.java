package dent;

import java.util.Scanner;
public class Zapis {

	Usluga ulsuga;
	Doctor doctor;
	Patient patient;
	Cabinet cabinet;
	String date;

	public Zapis(){
		this.ulsuga = new Usluga();
		this.doctor = new Doctor();
		this.patient = new Patient();
		this.cabinet = new Cabinet();
		this.date = "12.12.2012";
	}

	public Zapis(Usluga usluga, Doctor doctor, Patient patient, Cabinet cabinet, String date){
		this.ulsuga = ulsuga;
		this.doctor = doctor;
		this.patient = patient;
		this.cabinet = cabinet;
		this.date = date;
	}


	public void input(){
		Scanner scanner = new Scanner(System.in);
		this.ulsuga.input();
		this.doctor.input();
		this.patient.input();
		this.cabinet.input();
		
		this.date = scanner.nextLine();
		
		do
		{	
			System.out.print("Дата приёма: ");
			if (scanner.hasNextLine()){               
                this.date = scanner.nextLine();
            }           
            else
            {
                System.out.println("Дата приёма введёна неправильно. Повторите ввод.\\n");    
                scanner.nextLine();
            }
		} while (this.date == "");
	}

	public void output(){
		this.ulsuga.output();
		this.doctor.output();
		this.patient.output();
		this.cabinet.output();
		System.out.print("Дата приёма: " + this.date + "\n");
		
	}


}
