public class Mascotas {

    private Object raza;
    public Object getRaza() {
        return raza;
    }

    public void setRaza(Object raza) {
        this.raza = raza;
    }

    private Object edad;
    public Object getEdad() {
        return edad;
    }

    public void setEdad(Object edad) {
        this.edad = edad;
    }

    private Object tamaño;
    public Object getTamaño() {
        return tamaño;
    }

    public void setTamaño(Object tamaño) {
        this.tamaño = tamaño;
    }

    public Mascotas(Object nombrePerro, Object nombreDueño) {
        this.nombrePerro = nombrePerro;
        this.nombreDueño = nombreDueño;
    }

    private Object nombrePerro;
    private Object nombreDueño;

    public Mascotas(nombrePerro edad, raza tamaño,nombreDueño) {
        this.edad = edad;
        this.tamaño = tamaño;
        Object nombrePerro;
        this.nombrePerro= nombrePerro;
        Object nombreDueño;
        this.nombreDueño= nombreDueño;
    }
    
}

    public Object getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(Object nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public Object getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(Object nombreDueño) {
        this.nombreDueño = nombreDueño;
    }
