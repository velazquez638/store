package com.mitecode.inter;
import com.mitecode.model.cuenta;

public interface Icuenta {

	cuenta retirarDinero(cuenta cuenta, double monto);
	cuenta depositarDinero(cuenta cuenta, double monto);


}
