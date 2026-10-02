package act2_ejercicio1_escuela;

public class Alumno {
  
    //ATRIBUTOS
    private int legajo;
    private int dni;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String email;
    private String telefono;
    
    //CONTRUCTOR
    public Alumno(int legajo, int dni, String nombre, String apellido,String fechaNacimiento, String email, String telefono){
        this.legajo = legajo;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
        this.telefono = telefono;
    }
    
    //METODO PARA ACTUALIZAR DATOS DE CONTACTO
    public void actualizarDatos(String email, String telefono){
        this.email = email;
        this.telefono = telefono;
    }
    
    //METODO PARA CONSULTAR DATOS DEL ALUMNO
    public void consultarDatos(){
        System.out.println("Legajo: " + legajo);
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("Email: " + email);
        System.out.println("Telefono: " + telefono);
    }
}
