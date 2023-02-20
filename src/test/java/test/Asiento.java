package test;
//package ClasesCarro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Asiento {
String color;
int precio;
int registro;

void cambiarColor(String nuevoColor) {
	List<String> colores = new ArrayList<>(Arrays.asList("rojo", "verde", "amarillo", "negro", "blanco"));
	for (int i=0;i<colores.size();i++) {
		if (nuevoColor==colores.get(i)) { //nuevoColor.equals(colores.get(i))
            this.color = nuevoColor;
            break;
		}
	}
}
}
