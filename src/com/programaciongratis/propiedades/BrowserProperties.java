package com.programaciongratis.propiedades;

import java.math.BigDecimal;

public class BrowserProperties {
	
	private int numberOfColumns;
	
	private BigDecimal columnWidth;
	private BigDecimal spaceBetweenColumns;
	private BigDecimal windowWidth;
	
	/**Este constructor asigna cero a todas
	 * las propiedades.
	 */
	public BrowserProperties() {
		setNumberOfColumns(0);
		setColumnWidth(BigDecimal.ZERO);
		setSpaceBetweenColumns(BigDecimal.ZERO);
		setWindowWidth(BigDecimal.ZERO);
	}
	
	/**Este constructor te deja crear un objeto
	 * con las propiedades que definas.
	 * 
	 * @param pNumberOfColumns int
	 * @param pColumnWidth double
	 * @param pSpaceBetweenColumns double
	 * @param pwindowWidth double
	 */
	public BrowserProperties(
			  int pNumberOfColumns
			, double pColumnWidth
			, double pSpaceBetweenColumns
			, double pwindowWidth) {
		
		setNumberOfColumns(pNumberOfColumns);
		setColumnWidth(new BigDecimal(pColumnWidth));
		setSpaceBetweenColumns(new BigDecimal(pSpaceBetweenColumns));
		setWindowWidth(new BigDecimal(pwindowWidth));
	}

	/**Este metodo te retorna el numero
	 * de columnas.
	 * 
	 * @return numberOfColumns int
	 */
	public final int getNumberOfColumns() {
		return numberOfColumns;
	}

	/**Este metodo asigna un numero de
	 * columnas que le pases.
	 * 
	 * @param numberOfColumns int
	 */
	public final void setNumberOfColumns(final int numberOfColumns) {
		this.numberOfColumns = numberOfColumns;
	}

	/**Este metodo retorna el ancho de
	 * la columna en BigDecimal.
	 * 
	 * @return columnWidth BigDecimal
	 */
	public final BigDecimal getColumnWidth() {
		return columnWidth;
	}

	/**Este metodo asigna el ancho de 
	 * la columna en BigDecimal.
	 * 
	 * @param columnWidth BigDecimal
	 */
	public final void setColumnWidth(final BigDecimal columnWidth) {
		this.columnWidth = columnWidth;
	}

	/**Este metodo retorna el espacio
	 * entre las columnas en BigDecimal.
	 * 
	 * @return spaceBetweenColumns BigDecimal
	 */
	public final BigDecimal getSpaceBetweenColumns() {
		return spaceBetweenColumns;
	}

	/**Este metodo asigna el espacio entre
	 * columnas en BigDecimal.
	 * 
	 * @param spaceBetweenColumns BigDecimal
	 */
	public final void setSpaceBetweenColumns(final BigDecimal spaceBetweenColumns) {
		this.spaceBetweenColumns = spaceBetweenColumns;
	}

	/**Este metodo retorna el ancho de la
	 * ventana en BigDecimal.
	 * 
	 * @return windowWidth BigDecimal
	 */
	public final BigDecimal getWindowWidth() {
		return windowWidth;
	}

	/**Este metodo asigna el ancho de 
	 * la ventana en BigDecimal.
	 * 
	 * @param windowWidth BigDecimal
	 */
	public final void setWindowWidth(final BigDecimal windowWidth) {
		this.windowWidth = windowWidth;
	}


}
