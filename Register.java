/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package train2oprototype;

import java.util.HashMap;

/**
 *
 * @author hp
 */
public class Register {
    
    private HashMap<String,Device>shop;
    
    public Register(){
        
        shop=new HashMap();
        init();
    }

    private void init() {
        
        Device device1=new Labtop("teatch");
        shop.put("d1", device1);
        Device device2=new Tablet();
        shop.put("d2", device2);
       
        
    }
    
    
    
    public Device getcopy(String name ) throws CloneNotSupportedException{
        
        return shop.get(name).clone();
    }
    
    
    
    
    
}
