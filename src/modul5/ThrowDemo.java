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
public class ThrowDemo {
    public static void main(String[] args) {
        String input = "invalid input";
        try{
            if(input.equals("invalid input")){
                throw new RuntimeException("Throw demo");
            }else{
                System.out.println(input);
            }
            System.out.println("After throwing");
        }
        catch(RuntimeException e){
            System.out.println("Exception caught here.");
            System.out.println(e);
        }
    }
}