package test;
//package ClasesCarro;

public class Motor {

int numeroCilindros;
String tipo;
int registro;

void cambiarRegistro(int NuevoReg) {
	this.registro=NuevoReg;
}

void asignarTipo(String NuevoTipo) {
	if (NuevoTipo=="electrico" || NuevoTipo=="gasolina") {
		this.tipo=NuevoTipo;
	}
}
}
