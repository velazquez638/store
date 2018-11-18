package com.mitecode.model;

public class cuenta {

	private int IDusuario;
    private String usuario;
    private double saldoInicial;
    
    public cuenta (int IDusuario, String usuario, double saldoInicial) {
   	 this.IDusuario = IDusuario;
   	 this.usuario=usuario;
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
		this.usuario = usuario;
	}
	public double getSaldoInicial() {
		return saldoInicial;
	}
	public void setSaldoInicial(double saldoInicial) {
		this.saldoInicial = saldoInicial;
	}


}
