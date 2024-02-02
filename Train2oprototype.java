/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package train2oprototype;

/**
 *
 * @author hp
 */
public class Train2oprototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        // TODO code application logic here
        
        Register register=new Register();
        
        Device device;
        Device device2=register.getcopy("d2");
        device2.setQun(2);
        device2.setName("mohamed");
        device2.setPrice(200);
        device=device2.clone();
        
        device.data();
        device2.data();
        
        
        
        
    }
    
}
