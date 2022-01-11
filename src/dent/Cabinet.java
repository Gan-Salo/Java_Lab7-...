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
				
				//System.out.print("Îøèáêà. Íîìåğ êàáèíåòà äîëæåí áûòü â ïğîìåæóòêå îò 0 äî 1000\n");
				return -1;
			}	
		}

		public int area_check(int area){
			if (area > 0 && area < 100000){
				return area;
			}
			else{ 
				System.out.print("Îøèáêà. Ïëîùàäü êàáèíåòà äîëæíà áûòü â ïğîìåæóòêå îò 0 äî 100000\n");
				return -1;
			}	
		}

		public void input(){
			Scanner scanner = new Scanner(System.in);					
			
			do
			{	
				System.out.print("Íîìåğ íàáèíåòà: ");			
				try 
				{					
					this.number = scanner.nextInt();					
					if (number < 0){
						throw new Exception("Îøèáêà. Äàííûå ââåäåíû íåâåğíî.\n");
					}
					 
				}
				catch (Exception e){
					//System.out.print("Íîìåğ êàáèíåòà ââåä¸í íåïğàâèëüíî. Ïîâòîğèòå ââîä.\n");				
					number = -1;
					System.out.print(e.getMessage());
					scanner.nextLine();
				}		
			}while (number == -1);
			
			scanner.nextLine();
			do
	        {
				System.out.print("Íàçâàíèå îòäåëåíèÿ: ");
	            if (scanner.hasNextLine()){               
	                this.otdelen = scanner.nextLine();
	            }           
	            else
	            {
	                System.out.println("Íàçâàíèå îòäåëåíèÿ ââåä¸íî íåïğàâèëüíî. Ïîâòîğèòå ââîä.\\n");    
	                scanner.nextLine();
	            }
	        } while (this.otdelen == "");
			
			do
			{
				System.out.print("Ïëîùàäü êàáèíåòà: ");
				try 
				{
					this.area = scanner.nextInt(); 
					if (area < 0){
						throw new Exception("Îøèáêà. Äàííûå ââåäåíû íåâåğíî.\n");
					}
				}
				catch (Exception e){
					//out.print("Ïëîùàäü êàáèíåòà ââåä¸íà íåïğàâèëüíî. Ïîâòîğèòå ââîä.\n");				
					System.out.print(e.getMessage());
					area = -1;
					scanner.nextLine();
				}		
			} while (area == -1);			
		}
		
		public void output(){
			System.out.print("Íîìåğ êàáèíåòà: " + this.number + ", Íàçâàíèå îòäåëåíèÿ: " + this.otdelen + ", Ïëîùàäü êàáèíåòà: " + this.area + "\n");
		}

	}

