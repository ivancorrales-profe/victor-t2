package com.victoralejandro.poo.redsocial; 

public class PerfilRedSocial {
	private String nombreUsuario;
	private String nombreVisible;
	private String biografia;
	private String ciudad;
	private int numeroSeguidores;
	private int numeroPublicaciones;
	private EstadoPerfil estadoPerfil;
	private boolean cuentaVerificada;
	
	public void MostrarInformacion () {
		System.out.println(nombreUsuario + nombreVisible + biografia + ciudad + numeroSeguidores + numeroPublicaciones + estadoPerfil + cuentaVerificada);
	}
	
	public void AñadirSeguidores (int numeroSeguidores) {
		private int nuevosSeguidores;
		this.numeroSeguidores = numeroSeguidores + nuevosSeguidores;
		return this.numeroSeguidores;
		
	}
}
		
	