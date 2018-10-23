/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;
import java.time.*;
import java.util.*;
/**
 *
 * @author mw0864694
 */
public class WeddingPlanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner wSC = new Scanner(System.in);
    Wedding wedding;
    String date = planDate(wSC);
    String location = wedLocation(wSC);
    String[] tokens = createCouple(wSC);
    
    wedding = new Wedding (tokens[0],tokens[1],tokens[2],tokens[3],date,location);
    addingGuests(wedding,wSC);
    wedding.printWedding();
  }

  public static String planDate(Scanner wSC) {
    String date = "Fluffy Unicors";
    System.out.println("Please enter date as such M/DD/YYYY");
    date= wSC.nextLine();
    return date;
  }

  public static void addingGuests(Wedding wedding, Scanner wSC){
    System.out.println("Please enter the number of guests");
    int amntOfGuests = wSC.nextInt();
    System.out.println("Enter the guests first and last name please as well as thier rsvp date MM/DD/YYYY. Press enter after each entry");
    for (int i = 0;i<amntOfGuests;i++){
      String fName;
      String lName;
      String input;
      fName = wSC.next();
      lName = wSC.next();
      input = wSC.next();
      wedding.setI(i);
      wedding.createGuests(fName, lName, input);
    }  
  }
  
  public static String[] createCouple(Scanner wSC){
    String[] tokens = new String[4];
    String input;
    System.out.println("Please input the bride and grooms name with spaces in between");
    input = wSC.nextLine();
    tokens = input.split(" ");
    ///System.out.println(tokens.length);
    return tokens;
  }

  public static String wedLocation(Scanner wSC){
    String location;
    System.out.println("Where is the wedding going to be?");
    location = wSC.nextLine();
    return location;
  }
        
    
    
}
