package dent;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		/*������ � ���������� ��������
		int n = 0;
		do
        {
            if (scanner.hasNextInt()){
				System.out.println("������� ���������� ��������� �������");   
                n = scanner.nextInt();
            }
            else
            {
                System.out.println("������� �������� ��������.");    
                scanner.nextLine();
            }
        } while (n <= 0);
        
        Patient[] pat1 = new Patient[n];
             
        int i;
        for (i = 0; i < n; i++)
        {
        	pat1[i] = new Patient();
        	pat1[i].input();
        }
        for (i = 0; i < n; i++)
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
		
		/*Cabinet cab = new Cabinet();
		cab.input();
		cab.output();*/
		
		/*������ �������� ������������ � ����� ����������
		System.out.println("������ ��������� � ����� ���������� (���): ");
        Patient[] pat1 = new Patient[3];
             
        int i;
        for (i = 0; i < 3; i++)
        {
        	pat1[i] = new Patient("�������� ������� �" + (i + 1));
        	pat1[i].output();
        }
		*/
		
		/*��������� ������ ��������
		int n = 0, k = 0;
		do
        {
			System.out.println("������� ���������� ����� �������: ");  
            if (scanner.hasNextInt()){
                n = scanner.nextInt();
            }
            else
            {
                System.out.println("������� �������� ��������.");    
                scanner.nextLine();
            }
        } while (n <= 0);
		
		do
        {
			System.out.println("������� ���������� �������� �������: "); 
            if (scanner.hasNextInt()){
                k = scanner.nextInt();
            }
            else
            {
                System.out.println("������� �������� ��������.");    
                scanner.nextLine();
            }
        } while (k <= 0);
        
        Patient[][] pat2 = new Patient[n][k];
                    
        for (int i = 0; i < n; i++)
        {
        	for (int j = 0; j < k; j++)
            {
	        	pat2[i][j] = new Patient();
	        	pat2[i][j].input();
            }
        }
        for (int i = 0; i < n; i++)
        {
        	for (int j = 0; j < k; j++)
            {
        		pat2[i][j].output();
            }
        }*/
		
		/*����������� ����� ��������� �������� ���������� ���������*/
		Usluga usl1 = new Usluga();
		System.out.println("���������� ��������� ����� ������� ����������: ");  
		Usluga.get_kolvo();
		Usluga usl2 = new Usluga();
		System.out.println("\n���������� ��������� ����� ������� ����������:");  
		Usluga.get_kolvo();
	}
}
