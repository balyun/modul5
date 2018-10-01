/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5;

import java.io.*;

/**
 *
 * @author Client
 */
public class TugasPraktikum {
    public static void main(String[] args) throws IOException {
        System.out.println("===================================");
        System.out.println("    !HARUS MENGINPUT ANGKA!     ");
        System.out.println("===================================");
        System.out.print("Masukkan bilangan : ");
        String temp;
        double num = 0;
        
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader baca = new BufferedReader(input);
        temp = baca.readLine();
        
        try{
            num = Double.parseDouble(temp);
        }
        catch(NumberFormatException nfe){
            System.out.println("Maaf data yang dimasukkan bukan angka");
        }
        finally{
            System.out.println("Inputan yang dimasukkan = " + num);
        }
                
    }
}
