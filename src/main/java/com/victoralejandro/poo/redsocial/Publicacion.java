package com.victoralejandro.poo.redsocial;

import java.time.LocalTime;

public class Publicacion {
	private String texto;
	private LocalTime hora;
	private int numeroLikes;

	public void mostrar() {
		System.out.println(texto + hora + numeroLikes);
	}

	public void darMeGusta() {
		numeroLikes += 1;
	}

	public int numeroLikes() {
		return numeroLikes;
	}
}