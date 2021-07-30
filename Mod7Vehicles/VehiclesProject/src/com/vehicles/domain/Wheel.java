package com.vehicles.domain;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Wheel {
	private String brand;
	private double diameter;

	public Wheel(String brand, double diameter) {
		this.brand = brand;
		this.diameter = diameter;
	}	
	
	/**
	 * - Nivel 1 fase 2
	 * - Validaciondiametro de ruedas delanteras y traseras
	 */	
	
	public boolean validarDiametroRueda(double diametro) throws Exception{	
		// validamos formato diametro
		return diametro > 0.4 && diametro < 4.0;
	}
	
	public String toString() {
		return "Wheel[brand:" +  brand + " , diameter:" + diameter + "]\n";
	}
	
	
}
