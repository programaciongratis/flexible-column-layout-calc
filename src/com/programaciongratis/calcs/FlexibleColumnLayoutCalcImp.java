package com.programaciongratis.calcs;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.programaciongratis.propiedades.BrowserProperties;

public class FlexibleColumnLayoutCalcImp implements FlexibleColumnLayoutCalc {

	@Override
	public double calcAnchoDeColumna(final BrowserProperties props) {
		
		if (props != null) {
			
			int n = props.getNumberOfColumns();
			BigDecimal z = props.getWindowWidth();
			BigDecimal x = props.getSpaceBetweenColumns();
			
			props.setColumnWidth(z.subtract(x.multiply(new BigDecimal(n + 1)))
					.divide(new BigDecimal(n))
					.setScale(6));
			
		}
		
		return props.getColumnWidth().doubleValue();
	}

	@Override
	public List<Double> calcCadaAnchoDeColumna(final BrowserProperties props) {
		
		List<Double> listaDeColumnas = null;
		
		if (props != null) {
			
			listaDeColumnas = new ArrayList<Double>();
			BigDecimal resultado = BigDecimal.ZERO;
			
			BigDecimal y = props.getColumnWidth();
			BigDecimal x = props.getSpaceBetweenColumns();
			BigDecimal z = props.getWindowWidth();
			
			for (int i = 1; i <= props.getNumberOfColumns(); i++) {
				
				resultado = resultado.add(y.multiply(new BigDecimal(i)));
				
				resultado = resultado.add(x.multiply(new BigDecimal(i - 1)));
						
				resultado = resultado.multiply(new BigDecimal(100)).divide(z, 6, BigDecimal.ROUND_HALF_UP);
				
				listaDeColumnas.add(resultado.doubleValue());
				
				resultado = BigDecimal.ZERO;
			}
		}
		
		return listaDeColumnas;
	}
}
