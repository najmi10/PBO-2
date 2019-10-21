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
public class UjiBus3 {
    public static void main(String[] args){
        Bus3 bis = new Bus3(5);
        bis.getPenumpang(17);
        bis.getPenumpang(24);
        bis.cetakPenumpang();
        
        //penambahan penumpang
        bis.addPenumpang(2);
        bis.cetakPenumpang();
        
        //penambahan penumpang
        bis.addPenumpang(1);
        bis.cetakPenumpang();
        
        //penambahan penumpang
        bis.addPenumpang(2);
        bis.cetakPenumpang();
        
        //penambahan penumpang
        bis.addPenumpang(2);
        bis.cetakPenumpang();
    }
    
}
