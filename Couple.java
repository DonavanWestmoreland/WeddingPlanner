/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package main;

/**
 *
 * @author mw0864694
 */
class Couple {
  private Person groom;
  private Person bride;

  public Person getGroom() {
    return groom;
  }

  public Person getBride() {
    return bride;
  }

  public Couple(String groomFName, String groomLName, String brideFName, String brideLName) {
    groom = new Person(groomFName, groomLName);
    bride = new Person(brideFName, brideLName);

  } 
}
