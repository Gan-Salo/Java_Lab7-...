package dent;
import java.util.Scanner;
public class Cabinet {

		int number;
		String otdelen;
		int area;

		public Cabinet(){

		}
				
		public Cabinet(int number){
			this.number = number;			
		}

		public Cabinet(int number, String otdelen, int area){
			this.number = number;
			this.otdelen = otdelen;
			this.area = area;
		}		

		public void input(){
			Scanner scanner = new Scanner(System.in);					
			
			do
			{	
				System.out.print("Номер набинета: ");			
				try 
				{					
					this.number = scanner.nextInt();					
					if (number < 0){
						throw new Exception("Ошибка. Данные введены неверно.\n");
					}
					 
				}
				catch (Exception e){
					//System.out.print("Номер кабинета введён неправильно. Повторите ввод.\n");				
					number = -1;
					System.out.print(e.getMessage());
					scanner.nextLine();
				}		
			}while (number == -1);
			
			scanner.nextLine();
			do
	        {
				System.out.print("Название отделения: ");
	            if (scanner.hasNextLine()){               
	                this.otdelen = scanner.nextLine();
	            }           
	            else
	            {
	                System.out.println("Название отделения введёно неправильно. Повторите ввод.\\n");    
	                scanner.nextLine();
	            }
	        } while (this.otdelen == "");
			
			do
			{
				System.out.print("Площадь кабинета: ");
				try 
				{
					this.area = scanner.nextInt(); 
					if (area < 0){
						throw new Exception("Ошибка. Данные введены неверно.\n");
					}
				}
				catch (Exception e){
					//out.print("Площадь кабинета введёна неправильно. Повторите ввод.\n");				
					System.out.print(e.getMessage());
					area = -1;
					scanner.nextLine();
				}		
			} while (area == -1);			
		}
		
		public void output(){
			System.out.print("Номер кабинета: " + this.number + ", Название отделения: " + this.otdelen + ", Площадь кабинета: " + this.area + "\n");
		}

	}

