/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

/**
 *
 * @author Gabriela Delgado
 */
public class Leyes {
    
    float voltaje, corriente, resistencia, potencia;
    
    float voltaje (float i, float r){
        
        this.corriente = i;
        this.resistencia = r;
        
        voltaje = i * r;
        
        return voltaje;
    }
    
    float corriente (float v, float r){
        
        this.voltaje = v;
        this.resistencia = r;
        
        corriente = v / r;
        
        return corriente;
    }
    
    float resistencia (float v, float i){
        
        this.voltaje = v;
        this.corriente = i;
        
        resistencia = v / i;
        
        return resistencia;
    }
     
    float potencia (int n){
        
        switch (n){
            case 0:
                potencia = corriente * resistencia;
                break;
            
            case 1:
                potencia = (voltaje * voltaje)/resistencia;
                break;
                
            case 2:
                potencia = voltaje * corriente;
                break;
        }
        
        return n;
    }
    
}
