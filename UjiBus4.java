
package Tugas_Prak1;




public class UjiBus4 {
   
    public static void main(String[] args){
        Bus4 bis = new Bus4(150);
        
        bis.getPenumpang(24);
        bis.cetakPenumpang();
        
        //penambahan penumpang
        bis.getPenumpang(17);
        bis.cetakPenumpang();
        
        //penambahan penumpang
        bis.getPenumpang(24);
        bis.cetakPenumpang();
        
        //penambahan penumpang
        bis.getPenumpang(17);
        bis.cetakPenumpang();
        
        //penambahan penumpang
        bis.getPenumpang(24);
        bis.cetakPenumpang();
        
        System.out.println("rata-rata berat penumpang sekarang adalah :"+ bis.getAverage() );
    }
}
