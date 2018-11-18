package com.mitecode.inter;

import com.mitecode.model.cuenta;
import com.mitecode.inter.Icuenta;


public class CuentaBancoAImpl implements Icuenta {

	public cuenta retirarDinero(cuenta cuenta, double monto) {
		double saldoActual = cuenta.getSaldoInicial() - monto;
		cuenta.setSaldoInicial(saldoActual);
		System.out.println("Saldo actual: " + cuenta.getSaldoInicial());
		return cuenta;
	}

	public cuenta depositarDinero(cuenta cuenta, double monto) {
		double saldoActual = cuenta.getSaldoInicial() + monto + 0.20;
		cuenta.setSaldoInicial(saldoActual);
		System.out.println("Saldo actual despues del deposito: " + cuenta.getSaldoInicial());
		return cuenta;
	}

	public void mostrarSaldo(cuenta cuenta) {
		System.out.println("Saldo actual: " + cuenta.getSaldoInicial());
	}

}