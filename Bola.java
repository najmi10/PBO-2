/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_Prak2;

/**
 *
 * @author ica
 */
public class Bola {
    public double jarijari;
    
 public void setJarijari(double jarijari){
     this.jarijari = jarijari;
     
 }
 public void showDiameter(){
     System.out.println("Diameter = " + jarijari*2);
 }
  public void showLuasPermukaan(){
      System.out.println("Luas Permukaan = " + 4*Math.PI*jarijari);   
  }
  public void showVolume() {
      System.out.println("Volume = " + 4/3*Math.PI*jarijari*jarijari*jarijari);
      
  }
}