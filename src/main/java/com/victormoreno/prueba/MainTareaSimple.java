package com.victormoreno.prueba;

public class MainTareaSimple {

	public static void main(String[] args) {
		TareaSimple objeto1 = new TareaSimple();
		objeto1.titulo = "Nueva tarea";
		System.out.println(objeto1.titulo);
		TareaSimple objeto2 = new TareaSimple(3, "Otra tarea", false);
	}
}