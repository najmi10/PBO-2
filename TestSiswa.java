/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat_Prak3;

/**
 *
 * @author ica
 */
public class TestSiswa {
    public static void main(String[] args){
        
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Naisya Najmi");
        siswa.setAge(16);
        siswa.setAddress("Tulungagung");
        
        System.out.println("Name    :" + siswa.getName());
        System.out.println("Age     :" + siswa.getAge());
        System.out.println("Address :" + siswa.getAddress());
    }
    
}
