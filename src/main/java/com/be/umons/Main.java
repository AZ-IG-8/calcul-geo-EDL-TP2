package com.be.umons;

public class Main
{
    public static void main( String[] args )
    {
        Addition addition1 = new Addition();
        System.out.println("Addition = " + addition1.add(5, 3));

        Produit produit1 = new Produit();
        System.out.println("Mutiplication = " + produit1.multiply(5, 3));


        Surface surface1 = new Surface();
        System.out.println("Surface = " + Surface.surfaceoperation(5, 3));

        Perimetre perimetre1 = new Perimetre();
        System.out.println("Perimetre = " + Perimetre.perimetreoperation(5, 3, 2));


    }





}
