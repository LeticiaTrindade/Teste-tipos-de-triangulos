/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangulo;

import java.util.Scanner;

/**
 *
 * @author letic
 */
public class Teste {
    public static void main(String[] args){
    
        System.out.println("Digite os lados do triângulo: \n");
        Scanner lado = new Scanner(System.in);
        int lado1,lado2,lado3;
        lado1 = lado.nextInt();
        lado2 = lado.nextInt();
        lado3 = lado.nextInt();
        
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        
        if (triangulo.equilatero() == true){
            System.out.println("Esse triângulo é equilátero, pois possue todos os lados iguais!");
        }
        
        else if (triangulo.escaleno()== true){
            System.out.println("Esse triângulo é escaleno, pois possue todos os lados diferentes!");
        }
        
        else if (triangulo.isoceles() == true){
        System.out.println("Esse triângulo é isoceles, pois possue apenas 2 lados iguais!");
    }

    }
}
