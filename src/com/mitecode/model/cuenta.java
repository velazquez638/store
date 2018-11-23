package com.mitecode.model;

public class cuenta {

	public static int IDusuario = 1020345;
    public static String usuario;
    private double saldoInicial;
    
    public cuenta (int IDusuario, String usuario, double saldoInicial) {
   	 cuenta.IDusuario = IDusuario;
   	 cuenta.usuario=usuario;
   	 this.saldoInicial=saldoInicial;
    }
    
    public int getIDusuario() {
		return IDusuario;
	}
	public void setIDusuario(int iDusuario) {
		IDusuario = iDusuario;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		cuenta.usuario = usuario;
	}
	public double getSaldoInicial() {
		return saldoInicial;
	}
	public void setSaldoInicial(double saldoInicial) {
		this.saldoInicial = saldoInicial;
	}


}
