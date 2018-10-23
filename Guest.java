/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package main;
import java.time.*;
import java.time.format.*;
/**
 *
 * @author mw0864694
 */
class Guest {
  private Person guest;
  static private LocalDate rsvpDate = LocalDate.now();

  public Person getPerson(){
    return guest;
  }

  public LocalDate getDate(){
    return rsvpDate;
  }

  public Guest(String name1,String name2, String date){
    //fouind in https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html#parse-java.lang.CharSequence- on the second instance of the LocalDate parse section
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
    rsvpDate = LocalDate.parse(date, dateFormat);
    guest = new Person(name1,name2);

  }  
}
