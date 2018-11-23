package com.mitecode.proxy;

import com.mitecode.inter.Icuenta;
import com.mitecode.model.cuenta;

import java.util.logging.Logger;

import com.mitecode.inter.CuentaBancoAImpl;

public class cuentaProxy implements Icuenta {
	
	
	private Icuenta cuentaReal;
	private final static Logger LOGGER = Logger.getLogger(cuentaProxy.class.getName());
	
	public cuentaProxy(Icuenta cuentaReal) {
		this.cuentaReal = cuentaReal;
	}
	@Override
	public cuenta retirarDinero(cuenta cuenta, double monto) {
		LOGGER.info("------CUENTA PROXY---------RETIRAR DINERO-----------");
		if (cuentaReal==null) {
			cuentaReal = new CuentaBancoAImpl();
			return cuentaReal.retirarDinero(cuenta, monto);
		}
		else {
			return cuentaReal.retirarDinero(cuenta, monto);

		}
		
	}

	@Override
	public cuenta depositarDinero(cuenta cuenta, double monto) {
		LOGGER.info("------CUENTA PROXY----------DEPOSITAR DINERO-----------");
		if (cuentaReal==null) {
			cuentaReal = new CuentaBancoAImpl();
			return cuentaReal.depositarDinero(cuenta, monto);
		}
		else {
			return cuentaReal.depositarDinero(cuenta, monto);

		}
	}

}
