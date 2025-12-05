package com.victormoreno.prueba;

public class TareaSimple {

	int duracionEnHoras;
	String titulo;
	boolean completado;

	public int getDuracionEnHoras() {
		return duracionEnHoras;
	}

	public void setDuracionEnHoras(int duracionEnHoras) {
		this.duracionEnHoras = duracionEnHoras;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public boolean isCompletado() {
		return completado;
	}

	public void setCompletado(boolean completado) {
		this.completado = completado;
	}

	public TareaSimple(int duracionEnHoras, String titulo, boolean completado) {
		super();
		this.duracionEnHoras = duracionEnHoras;
		this.titulo = titulo;
		this.completado = completado;
	}

	public TareaSimple() {
		super();
	}
	
	public void mostrarEstado() {
		if (completado) {
			System.out.println("La tarea " + titulo + " esta completada");
		}else {
			System.out.println("La tarea " + titulo + " no esta completada");
		}
	}
	
	public void cambiarEstado() {
		if (this.completado) {
			completado = false;
		}else {
			completado = true;
		}
	}
}