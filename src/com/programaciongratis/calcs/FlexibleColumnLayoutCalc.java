package com.programaciongratis.calcs;

import java.util.List;

import com.programaciongratis.propiedades.BrowserProperties;

public interface FlexibleColumnLayoutCalc {
	
	/**
	 * Este metodo va calcular el ancho de
	 * las columnas. Suponiendo que pasaste
	 * el ancho de la ventana, el ancho del
	 * espacio entre columnas, y el numero
	 * de columnas.
	 * 
	 * @param props BrowserProperties
	 * @return BigDecimal
	 */
	double calcAnchoDeColumna(final BrowserProperties props);
	
	/**
	 * Este metodo va calcular el valor de
	 * cada columna desde 1 hasta n.
	 * Donde n es el total  de columnas.
	 */
	List<Double> calcCadaAnchoDeColumna(final BrowserProperties props);

}
