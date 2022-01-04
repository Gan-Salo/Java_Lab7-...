package dent;

import java.util.Scanner;
import java.util.ArrayList;
public class Patient {

	String fio;
	int age;
	String phone;
	ArrayList<Patient> pat_mass = new ArrayList<Patient>();

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
			System.out.print("Ошибка. Возраст пациента должен быть в промежутке от 0 до 120\n");
			return -1;
		}	
	}

	public void input(){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Patient Fio: ");
		do
        {
            if (scanner.hasNextLine()){               
                this.fio = scanner.nextLine();
            }           
            else
            {
                System.out.println("Фамилия пациента введёна неправильно. Повторите ввод.\\n");    
                scanner.nextLine();
            }
        } while (this.fio == "");
		
		System.out.print("Patient Age: ");	
		do
		{		
			try 
			{				
				this.age = age_check(scanner.nextInt()); 
			}
			catch (Exception e){
				System.out.print("Возраст пациента введён неправильно. Повторите ввод.\n");				
				age = -1;
				scanner.nextLine();
			}
		} while (this.age == -1);
		
		System.out.print("Patient Phone: ");
		do
        {
            if (scanner.hasNextLine()){               
                this.phone = scanner.nextLine();
            }           
            else
            {
                System.out.println("Телефон пациента введён неправильно. Повторите ввод.\\n");    
                scanner.nextLine();
            }
        } while (this.phone == "");
	}

	public void output(){
		System.out.print("ФИО пациента: " + this.fio + ", Возраст пациента: " + this.age + ", Телефон пациента: " + this.phone + "\n");
	}
	
	public void get_patmass(){
		Patient pat = new Patient();
		for (int i = 0; i < pat_mass.size(); i++)
		{
			pat = pat_mass.get(i);
			System.out.println("\nПациент №" + (i + 1) + "\n");
			pat.output();
		}
	}
		
	public void pat_kolvo(Patient pat) {
		pat_mass.add(pat);
	}
}
