/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5;

/**
 *
 * @author Client
 */
public class TugasRumah extends Exception{
    private int beratBarang;
    // default constructor
    TugasRumah(){
        
    }
    // constructor dengan parameter bertipe String
   TugasRumah(String pesan){
        super(pesan);
    }
    // constructor dengan parameter bertipe String dan int
    TugasRumah(String pesan,int nilai){
        super(pesan);
        beratBarang = nilai;
    }
    public int getBilangan(){
        return beratBarang;
    }
}
class PenerbanganPesawat{
    public static int HitungBeratBarang(int kg) throws TugasRumah{
        if(kg<50){
            throw new TugasRumah("Boleh Membawa barang", kg);
        }
        if(kg>50){
            throw new TugasRumah("Tidak boleh membawa barang", kg);
        }
        int HitungBeratBarang = 0;
        return HitungBeratBarang;
    }
    public static void main(String[] args) throws TugasRumah{
        System.out.println("Penerbangan pesawat Garuda Indonesia");
        try{
            System.out.println("Berat barang yang dibawa = " + HitungBeratBarang(20)+" kg");
        }catch(TugasRumah tr){
            System.out.println("Bilangan : " + tr.getBilangan());
            //nne.printStackTrace();
        }
        try{
            System.out.println("Berat barang yang dibawa = " + HitungBeratBarang(70)+ " kg");
        }catch(TugasRumah tr){
            System.out.println("Bilangan : " + tr.getBilangan());
            //nne.printStackTrace();
            System.out.println(tr);
        }
    }
}