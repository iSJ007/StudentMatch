import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.NoSuchElementException;
public class Match {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                Student[] arr = new Student [100];
                
                System.out.println("Input File Name:");
                Scanner input = new Scanner(System.in);
                String fileName = input.next();
                int studentNumber = 0;
                    try {
                	Scanner fileInput = new Scanner(new FileReader(fileName));
                	
                	
                	while (fileInput.hasNextLine()) {
                	 Scanner line = new Scanner(fileInput.nextLine());
                    line.useDelimiter("[\n\t]");
                	 String name = line.next();
                	 String gender = line.next();
                	 String date = line.next();
                	 
                	// scans the date  and assign the month, day and year
                    Scanner birthDateReader = new Scanner(date);
                   birthDateReader.useDelimiter("-");
                    int month = birthDateReader.nextInt();
                    int day   = birthDateReader.nextInt();
                    int year  = birthDateReader.nextInt();
                    
                    // assignt the preferance values based on location
                    int quiteTime = line.nextInt();
                    int musicTime = line.nextInt();
                    int readingTime = line.nextInt();
                    int chattingTime = line.nextInt();
                	  
                    // declar e objects to call the classes 
                    Date birthdate = new Date(day, month , year);
                    Preference pref = new Preference(quiteTime, musicTime, readingTime,chattingTime);
                   arr[studentNumber] = new Student(name, gender.charAt(0),birthdate, pref );
                   studentNumber++;
                   
                	}
               
                   for ( int i = 0; i < studentNumber ; i++) {
               		   if( !arr[i].getMatch()) {
               			   int bestScore= 0;
               	           int bestMatch = 0;
               			   
               	   for ( int j = i + 1; j < studentNumber; j++) {
               		   if (!arr[j].getMatch()) {
               			  int cScore = arr[i].compare(arr[j]);
               			   if ( cScore > bestScore) {
               				   bestScore = cScore;
               				   bestMatch = j;
               			   }
               		   }
               	   }
               		   
                   if (bestScore!= 0){
					arr[i].setMatch(true);
					arr[bestMatch].setMatch(true);
					System.out.println(arr[i].getName() + " matches with "
							+ arr[bestMatch].getName() + " with the score " + bestScore);
				}
				else
					System.out.println(arr[i].getName() + " has no matches.");
               	   
            }
               	   }  	   
       
                      
                    }
                     catch (NoSuchElementException e) {
            			System.out.println(e);
            		} catch (FileNotFoundException e) {
            			System.out.println(e);
            		}
            	}
            
}	




