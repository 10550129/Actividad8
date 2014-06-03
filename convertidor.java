package com.example.tareapdmp2_calculadora.app;

public class convertidor {
    int grados;
    private double conv;
	String mostrar;

    convertidor(){}

    convertir1(int gr){

        de_far_a_cel();
    }
	
	 convertir2(int gr){

        de_cel_a_far();
    }

    public void de_far_a_cel() {
        conv = ((grados-32)*5)/9;
        mostrar = conv+"ºC";
    }
	
	public void de_far_a_cel() {
        conv = ((grados-32)*5)/9;
        mostrar = "" + conv;
    }
	
	public void de_cel_a_far() {
        conv = ((grados*9)/5)+32
        mostrar = conv+"ºF";
    }

}
