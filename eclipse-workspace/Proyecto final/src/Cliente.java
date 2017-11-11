
public class Cliente {
private int Rut;
private String Nombre;
private String Apellido;
private String Nacionalidad;
private int Edad;
private String Categoria;
public Cliente(int rut, String nombre, String apellido, String nacionalidad, int edad, String categoria) {
	super();
	Rut = rut;
	Nombre = nombre;
	Apellido = apellido;
	Nacionalidad = nacionalidad;
	Edad = edad;
	Categoria = categoria;
	
}
public int getRut() {
	return Rut;
}
public void setRut(int rut) {
	Rut = rut;
}
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public String getApellido() {
	return Apellido;
}
public void setApellido(String apellido) {
	Apellido = apellido;
}
public String getNacionalidad() {
	return Nacionalidad;
}
public void setNacionalidad(String nacionalidad) {
	Nacionalidad = nacionalidad;
}
public int getEdad() {
	return Edad;
}
public void setEdad(int edad) {
	Edad = edad;
}
public String getCategoria() {
	return Categoria;
}
public void setCategoria(String categoria) {
	Categoria = categoria;}
	
@Override
public String toString() {
	return "Cliente [Rut=" + Rut + ", Nombre=" + Nombre + ", Apellido=" + Apellido + ", Nacionalidad=" + Nacionalidad
			+ ", Edad=" + Edad + ", Categoria=" + Categoria + "]";
}
}

