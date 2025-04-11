class Persona {
    public String nombre;
    public int edad;
    public String ciudad;

    public Persona(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }
    // a) Agrega un método para mostrar el saludo: "Hola, soy (nombre) de {ciudad}"
    public void saludo() {
        System.out.println("Hola, soy " + nombre + " de " + ciudad);
    }
    // c) verificando si son mayores de edad
    public void verificandoEdad() {
        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad");
        } else {
            System.out.println(nombre + " no es mayor de edad");
        }
    }
}
