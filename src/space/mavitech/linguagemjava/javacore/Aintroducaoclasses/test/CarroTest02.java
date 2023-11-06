package space.mavitech.linguagemjava.javacore.Aintroducaoclasses.test;

import space.mavitech.linguagemjava.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTest02 {

    public static void main(String[] args) {

        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.modelo = "Civic Type R";
        carro01.marca = "Honda Motors";
        carro01.ano = 2023;

        carro02.modelo = "Tundra";
        carro02.marca = "Toyota";
        carro02.ano = 2022;

        carro01 = carro02;

        System.out.println("Modelo: " + carro01.modelo + " Marca: " + carro01.marca + " Ano: " + carro01.ano);
        System.out.println("Modelo: " + carro02.modelo + " Marca: " + carro02.marca + " Ano: " + carro02.ano);

    }

}