package dent;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		/*String name = "vasya";
		Patient pat = new Patient(name, 23, "+79879872323");
		name = "petya";
		Patient pat2 = new Patient();
		pat2.input();
		pat.output();
		pat2.output();*/

		//������ � �������� ��������
		/*Scanner scanner = new Scanner(System.in); 
		System.out.println("������� ���������� ������� � �������: ");
        int n;
        n = -1;
        do
        {
            if (in.hasNextInt()){

                n = in.nextInt();
            }
            else
            {
                System.out.println("������� �������� ��������.");    
                in.nextLine();
            }
        } while (n <= 0);
        
        Patient[] pat1 = new Patient[3];
             
        int i;
        for (i = 0; i < 3; i++)
        {
        	pat1[i] = new Patient();
        	pat1[i].input();
        }
        for (i = 0; i < 3; i++)
        {
        	pat1[i].output();
        }*/
        
        /*������� �������� �� ������ ����� ��������������� �����
        HelpClass obcost = new HelpClass();
        Usluga usl1 = new Usluga();
        usl1.input();
        usl1.output();
        Usluga usl2 = new Usluga();
        Usluga.get_cost(obcost, usl1);
        System.out.println("����� ��������� ��� ����� ������:" + obcost.obch_cost + "\n");
        usl2.cost = 130;
        usl2.get_cost(obcost, usl2);
        System.out.println("����� ��������� ��� ���� �����:" + obcost.obch_cost + "\n");
		
		/*������ �� ��������
		String test, test1, test2 = "������ �����";
		Usluga usl1 = new Usluga("first", 300);
		
		usl1.title = usl1.title + " " + test2; 
		System.out.println("����������� �����:");
		System.out.println(usl1.title);
		
		test = usl1.title.concat(" xddddd");
		System.out.println("����������� ����� � ������� concat:");
		System.out.println(test);
		
		test1 = usl1.title + " xllll";
		System.out.println("����������� ����� � ������� �������������� ��������� '+':");
		System.out.println(test1);
		
		String test3, test4;
		System.out.println("������ ���� �������� 'l' � ������ � ������� ������ 'replace':");
		System.out.println(test1.replace("l", "gg"));
		System.out.println("������ ������� ������� 'l' � ������ � ������� ������ 'replaceFirst':");
		System.out.println(test1.replaceFirst("l", "gg"));
		
		System.out.println("����� �������� ������:");
		System.out.println(test.toUpperCase());*/
		
		Cabinet cab = new Cabinet();
		cab.input();
		cab.output();
	}
}
