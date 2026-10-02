package act2_ejercicio1_escuela;

public class Asignatura {

    //ATRIBUTOS
    private String codigo;
    private String nombre;
    private String descripcion;
    private int anioNivel;
    
    //CONSTRUCTOR
    public Asignatura(String codigo, String nombre, String descripcion, int anioNivel){
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.anioNivel = anioNivel;
    }
    
    //METODO PARA REGISTRAR LA ASIGNATURA
    public void registrar(){
        System.out.println("La asignatura " + nombre + " ha sido registrada");
    }
    
    //METODO PARA MODIFICAR LA DESCRIPCION
    public void modificar(String nuevaDescripcion){
        this.descripcion = nuevaDescripcion;
    }
    
    //METODO PARA CONSULTAR LOS DATOS DE LA ASIGNATURA
    public void consultar(){
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Anio/Nivel: " + anioNivel);
    }
}
