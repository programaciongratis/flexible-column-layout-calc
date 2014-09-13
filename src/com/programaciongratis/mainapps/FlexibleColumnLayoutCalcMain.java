package com.programaciongratis.mainapps;

import com.programaciongratis.calcs.FlexibleColumnLayoutCalc;
import com.programaciongratis.calcs.FlexibleColumnLayoutCalcImp;
import com.programaciongratis.propiedades.BrowserProperties;

public class FlexibleColumnLayoutCalcMain {
	
	public static void main(String[] args) {
		
		BrowserProperties props = new BrowserProperties(10, 0, 10, 1900);
		
		FlexibleColumnLayoutCalc calc = new FlexibleColumnLayoutCalcImp();
		
		System.out.println(calc.calcAnchoDeColumna(props) + "px");
		
		String[] cols = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
		
		int col = 0;
		
		System.out.println("Solo copia esto en tu archivo CSS");
		
		for (Double colWidth : calc.calcCadaAnchoDeColumna(props)) {
			System.out.printf("%s %.6f%s\n", "." +cols[col] + "Col {width: ", colWidth.doubleValue(), "%; }");
			col++;
		}
		
	}

}
