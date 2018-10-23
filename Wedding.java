/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package main;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author mw0864694
 */
class Wedding {
  private String wedLocation;
  private LocalDate wedDate;
  static private ArrayList<Guest> guests = new ArrayList<>();
  private Guest guest;
  private Couple happy;
  static private int i;
  private LocalDate rsvpTime;

  public String getWedLocation(){
    return wedLocation;
  }
  //testing
  //public void setDate(String input){
    //DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
    //wedDate = LocalDate.parse(input, dateFormat);
    //System.out.println(wedDate);
  //  }

  public LocalDate getWedDate(){
    return wedDate;
  }
  
  public ArrayList getGuests(){
    return guests;
  }

  public void setI(int i){
    this.i = i;
  }

  public void createGuests(String name, String name2,String date){
    guests.add(i, new Guest(name,name2,date));
    
  }

  public Wedding(String bFName, String bLName, String gFName, String gLName, String input, String loc){
    wedLocation = loc;
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
    wedDate = LocalDate.parse(input, dateFormat);
    happy = new Couple(gFName, gLName,bFName,bLName);
    
    
  }

  public void printWedding(){
    System.out.printf("*********%s %s %s %s*********\n",happy.getGroom().getfName(),happy.getGroom().getlName(),happy.getBride().getfName(),happy.getBride().getlName());
    System.out.printf("    **********%s**********\n",wedLocation);
    System.out.printf("      ********%s********\n",wedDate);
    System.out.printf("         ***Guest List***\n");
    for (int h = 0; h < guests.size(); h++){
      System.out.printf("          %s %s %s\n",guests.get(h).getPerson().getfName(),guests.get(h).getPerson().getlName(),guests.get(h).getDate());
    }
  }

 
}
