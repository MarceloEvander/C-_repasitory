/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author net
 */
public class coba {
    public static void main(String[] args) {
        
        String namadepan = "marcelo ";
        String namabelakang = "djela ";
        
        StringBuilder builder = new StringBuilder();
        builder.append(namadepan);
        builder.append(namabelakang);
     
        
        String namaLengkap = builder.toString();
        
        System.out.println(namaLengkap);
    }
}
