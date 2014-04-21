/**
 * 
 */
package com.wildc.ucumari.server.framework.to;

import com.wildc.ucumari.base.util.Constantes;

/**
 * @author cmontes
 *
 */
public class BResult extends BaseTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 370715784948421482L;
	
	private String codigo = Constantes.TaskStatus.OK.getCode();
	private String mensaje = null;
	private Object value = null;
	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}


	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	/**
	 * @return the value
	 */
	public Object getValue() {
		return value;
	}


	/**
	 * @param value the value to set
	 */
	public void setValue(Object value) {
		this.value = value;
	}	
	

	public String getMensaje() {
		return mensaje;
	}


	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}


	/**
	 * 
	 */
	public BResult() {		
	}

}
