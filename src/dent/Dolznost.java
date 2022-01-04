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
		
		do
        {	
			System.out.print("�������� ���������: ");
            if (scanner.hasNextLine()){               
                this.title = scanner.nextLine();
            }           
            else
            {
                System.out.println("�������� ��������� ������ �����������. ��������� ����.\\n");    
                scanner.nextLine();
            }
        } while (this.title == "");
		
		do
        {	
			System.out.print("�������������: ");
            if (scanner.hasNextLine()){               
            	this.podrazdel = scanner.nextLine();
            }           
            else
            {
                System.out.println("�������� ������������� ������ �����������. ��������� ����.\\n");    
                scanner.nextLine();
            }
        } while (this.podrazdel == "");
	}

	public void output(){
		System.out.print("�������� ���������: " + this.title + ", �������������: " + this.podrazdel + "\n");
	}

	public void changecost(String podrazdel){
		this.podrazdel = podrazdel;
	}

}
