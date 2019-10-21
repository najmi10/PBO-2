/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat_Prak2;

/**
 *
 * @author ica
 */
public class UjiBus2 {
    public static void main(String[] args){
        Bus2 busBesar = new Bus2(40);
        busBesar.cetak();
        
        busBesar.addPenumpang(15);
        busBesar.cetak();
        
        busBesar.addPenumpang(5);
        busBesar.cetak();
        
        busBesar.addPenumpang(26);
        busBesar.cetak();
    }
    
}
