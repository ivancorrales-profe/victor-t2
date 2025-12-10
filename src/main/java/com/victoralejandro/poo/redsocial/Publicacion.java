package com.victoralejandro.poo.redsocial;

import java.time.LocalTime;

public class Publicacion {
	private String texto;
	private LocalTime hora;
	private int numeroLikes;

	public void Mostrar() {
		this.texto = texto;
		this.hora = hora;
		this.numeroLikes = numeroLikes;
		System.out.println(texto);
	}

	public void DarMeGusta() {
		numeroLikes += 1;
	}

	public int NumeroLikes() {
		return numeroLikes;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}