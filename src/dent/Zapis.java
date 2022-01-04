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
		System.out.print("Date: ");
		this.date = scanner.nextLine();
	}

	public void output(){
		this.ulsuga.output();
		this.doctor.output();
		this.patient.output();
		this.cabinet.output();
		System.out.print("Date: " + this.date + "\n");
	}

	public void obch_cost(Help cst) {
	    cst.obch += this.ulsuga.cost;

	} 
}
