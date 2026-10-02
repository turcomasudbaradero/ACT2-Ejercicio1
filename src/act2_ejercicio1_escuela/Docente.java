package act2_ejercicio1_escuela;

public class Docente {
    
    // ATRIBUTOS
    private int legajo;
    private int dni;
    private String nombre;
    private String apellido;
    private String especialidad;
    private String email;
    private String telefono;
    
    //CONSTRUCTOR
    public Docente(int legajo, int dni, String nombre, String apellido, String especialidad, String email, String telefono){
        this.legajo = legajo;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
        this.email = email;
        this.telefono = telefono;
    }
    
    //METODO PARA ACTUALIZAR DATOS DE CONTACTO
    public void actualizarDatos(String email, String telefono){
        this.email = email;
        this.telefono = telefono;
    }
    
    //METODO PARA CONSULTAR LOS DATOS DEL DOCENTE
    public void consultarDatos() {
        System.out.println("Legajo: " + legajo);
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Email: " + email);
        System.out.println("Telefono: " + telefono);
    }
}
