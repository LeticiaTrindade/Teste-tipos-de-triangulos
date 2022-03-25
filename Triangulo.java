/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package triangulo;

/**
 *
 * @author letic
 */
public class Triangulo {

    private int lado1;
    private int lado2;
    private int lado3;
    
    
    public Triangulo(int lado1, int lado2, int lado3){
        
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        
    }
    
    public boolean equilatero(){
        
        return this.lado1 == this.lado2 && this.lado2 == this.lado3;
    }
    
    public boolean escaleno(){
        
        return this.lado1 != this.lado2 && this.lado2 != this.lado3 && this.lado3 != this.lado1;
    }
    
    public boolean isoceles(){
        
        return this.lado1 == this.lado2 || this.lado2 == this.lado3 || this.lado3 == this.lado1;
    }
}
