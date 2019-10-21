
package Tugas_Prak1;

public class Bus4 {
    public double penumpang;
    public double maxPenumpang;
    public double Counter;
    
    public Bus4(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang =0;
    }
    //Method Mutator
    public void addPenumpang(double penumpang){
        double temp;
        temp = this.penumpang +penumpang;
        if(temp >= maxPenumpang){
             System.out.println("Penumpang melebihi kuota");
            
        }else{
             this.penumpang = temp;
             Counter++;
         }
    }
    public void getPenumpang(int password){
        if (password == 24){
            System.out.println("Password Benar");
            addPenumpang(35.5);
        }else{
            System.out.println("Password Salah");
        }
    }
    
    public void cetakPenumpang(){
        System.out.println("Penumpang Bus Sekarang= " + penumpang);
        System.out.println("Maksimum penumpang yang seharusnya adalah= " +maxPenumpang);
    }
    public double getAverage(){
        return penumpang/Counter;
        
        
    }
    
}
