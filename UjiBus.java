/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat_Prak;

/**
 *
 * @author ica
 */
public class UjiBus {
    public static void main(String[] args){
        //membuat objek busMini dari kelas Bus
        Bus busMini = new Bus(); 
        //memasukkan nilai jumlah penumpang dan penumpang maksimal ke dalam objek
        busMini.penumpang = 5;
        busMini.maxPenumpang = 15;
        //memanggil method cetak pada kelas Bus
        busMini.cetak();
        
        //menambahkan penumpang pada busMini
        busMini.penumpang = busMini.penumpang +5;
        //memanggil method cetak
        busMini.cetak();
        
        //mengurangi jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang -2;
        //memanggil method cetak
        busMini.cetak();
        
        //menambahkan jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang +8;
        //memanggil method cetak
        busMini.cetak();
    }
    
}
