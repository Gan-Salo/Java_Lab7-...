package dent;
import java.util.Scanner;
public class Cabinet {

		int number;
		String otdelen;
		int area;

		public Cabinet(){
			this.number = -1;
			this.otdelen = "otd";
			this.area = -1;
		}
		
		public Cabinet(int number){
			this.number = num_check(number);			
		}

		public Cabinet(int number, String otdelen, int area){
			this.number = num_check(number);
			this.otdelen = otdelen;
			this.area = area_check(area);
		}

		public int num_check(int number){
			if (number > 0 && number < 1000){
				return number;
			}
			else{ 
				System.out.print("Number (from 1 to 1000)\n");
				return -1;
			}	
		}

		public int area_check(int area){
			if (area > 0 && area < 100000){
				return area;
			}
			else
			{ 
				System.out.print("Îøèáêà. Ïëîùàäü êàáèíåòà äîëæíà áûòü â ïğîìåæóòêå îò 0 äî 100000\\n\n");
				return -1;
			}	
		}

		public void input(){
			Scanner scanner = new Scanner(System.in);					
			while (number < 0){
				System.out.print("Number : ");
				try 
				{
					this.number = num_check(scanner.nextInt()); 
				}
				catch (Exception e){
					System.out.print("Error cabinet number.\n");				
					number = -1;
					scanner.nextLine();
				}		
			}
			scanner.nextLine();
			System.out.print("Otdelenie ");
			this.otdelen = scanner.nextLine();	
			while (area < 0){
				System.out.print("Area: ");
				try {
					this.area = area_check(scanner.nextInt()); 
				}
				catch (Exception e){
					System.out.print("Error. Area\n");				
					area = -1;
					scanner.nextLine();
				}		
			}
			scanner.nextLine();
		}
		public void output(){
			System.out.print("Number: " + this.number + ", Otdelen: " + this.otdelen + ", Area: " + this.area + "\n");
		}

	}

