/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118053.latihan62.livingthing;

/**
 *
 * @author ACER
 */
public class Human extends LivingThing {
    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public void walk(String nama) {
        super.walk(nama); //To change body of generated methods, choose Tools | Templates.
        System.out.println(nama+" sedang berjalan");
    }
    
    
    
}
