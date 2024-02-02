/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package train2oprototype;

/**
 *
 * @author hp
 */
public class Device implements Cloneable{
    
    private String name ;
    private int price ;
    private int qun;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQun() {
        return qun;
    }

    public void setQun(int qun) {
        this.qun = qun;
    }

    public void data(){
        System.out.println("/nThe name of your device is :"+this.name);
        System.out.println("/nThe price of your device is :"+this.price);
        System.out.println("/nThe qutity of your device is "+this.qun);
    }
    
    
    @Override
    protected Device clone() throws CloneNotSupportedException {
        return (Device) super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
    
}
