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

		//Работа с массивом объектов
		/*Scanner scanner = new Scanner(System.in); 
		System.out.println("Введите количество коробок в массиве: ");
        int n;
        n = -1;
        do
        {
            if (in.hasNextInt()){

                n = in.nextInt();
            }
            else
            {
                System.out.println("Введено неверное значение.");    
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
        
        /*Возврат значения из метода через вспомогательный класс
        HelpClass obcost = new HelpClass();
        Usluga usl1 = new Usluga();
        usl1.input();
        usl1.output();
        Usluga usl2 = new Usluga();
        Usluga.get_cost(obcost, usl1);
        System.out.println("Общая стоимость для одной услуги:" + obcost.obch_cost + "\n");
        usl2.cost = 130;
        usl2.get_cost(obcost, usl2);
        System.out.println("Общая стоимость для двух услуг:" + obcost.obch_cost + "\n");
		
		/*Работа со строками
		String test, test1, test2 = "Чистка зубов";
		Usluga usl1 = new Usluga("first", 300);
		
		usl1.title = usl1.title + " " + test2; 
		System.out.println("Объединение строк:");
		System.out.println(usl1.title);
		
		test = usl1.title.concat(" xddddd");
		System.out.println("Объединение строк с помощью concat:");
		System.out.println(test);
		
		test1 = usl1.title + " xllll";
		System.out.println("Объединение строк с помощью перегруженного оператора '+':");
		System.out.println(test1);
		
		String test3, test4;
		System.out.println("Замена всех символов 'l' в строке с помощью метода 'replace':");
		System.out.println(test1.replace("l", "gg"));
		System.out.println("Замена первого символа 'l' в строке с помощью метода 'replaceFirst':");
		System.out.println(test1.replaceFirst("l", "gg"));
		
		System.out.println("Смена регистра строки:");
		System.out.println(test.toUpperCase());*/
		
		Cabinet cab = new Cabinet();
		cab.input();
		cab.output();
	}
}
