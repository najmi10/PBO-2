/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat_Prak4;

/**
 *
 * @author ica
 */
public class Bus3 {
    public int penumpang;
    public int maxPenumpang;
    
    public Bus3(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang =0;
    }
    //Method Mutator
    public void addPenumpang(int penumpang){
        int temp;
        temp = this.penumpang+penumpang;
        if(temp >= maxPenumpang){
             System.out.println("Penumpang melebihi kuota");
        }else{
             this.penumpang = temp;
         }
    }
    public void getPenumpang(int password){
        if (password == 24){
            System.out.println("Password Benar");
        }else{
            System.out.println("Password Salah");
        }
    }
    public void cetakPenumpang(){
        System.out.println("Penumpang Bus Sekarang= " + penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah= " +maxPenumpang);
    }
    
}
