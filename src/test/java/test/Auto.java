package test;
//package ClasesCarro;

public class Auto {
	
String modelo;
int precio;
Asiento[] asientos;
String marca;
Motor motor;
int registro;
static int cantidadCreados;



public int cantidadAsientos(){
	int n_asientos=0;
	for (int i=0; i<asientos.length ;i++) {
		if (asientos[i]!=null){
			n_asientos++;
		}}
	return n_asientos;
		
	}


public String verificarIntegridad() {
	if (this.registro==motor.registro){
		for (int i=0; i<asientos.length;i++) {
			if (asientos[i].registro==this.registro) {
				//nada
			} else {
				return "Las piezas no son originales";
			}
		}
	} else {
		return "Las piezas no son originales";
	}
	return "Auto original";
}
	
}

