package act2_ejercicio1_escuela;

public class ACT2_Ejercicio1_Escuela {

    public static void main(String[] args) {
        
        //INSTACIA DEL ALUMNO
        Alumno alumno1 = new Alumno(1001, 40111222, "Juan", "Perez", "12/05/2010", "juan.perez@escuela.edu.ar", "1122334455");
        
        //INSTANCIA DEL DOCENTE
        Docente docente1 = new Docente(501, 25111222, "Maria", "Gomez", "Matematica", "maria.gomez@escuela.edu.ar", "1166778899");
        
        //INSTANCIA DE LA ASIGNATURA
        Asignatura asignatura1 = new Asignatura("MAT01", "Matematica", "Matematica de cuarto anio", 4);
        
        
        //CONSULTA DEL ALUMNO
        System.out.println("================");
        System.out.println("DATOS DEL ALUMNO");
        System.out.println("================");

        alumno1.consultarDatos();
        
        //CONSULTA DEL DOCENTE
        System.out.println();
        System.out.println("=================");
        System.out.println("DATOS DEL DOCENTE");
        System.out.println("=================");

        docente1.consultarDatos();
        
        //CONSULTA DE LA ASIGNATURA
        System.out.println();
        System.out.println("======================");
        System.out.println("DATOS DE LA ASIGNATURA");
        System.out.println("======================");

        asignatura1.consultar();
        
        
        // ACTUALIZAR DATOS DEL ALUMNO
        alumno1.actualizarDatos("juan.perez.nuevo@escuela.edu.ar", "1199988877");

        System.out.println();
        System.out.println("============================");
        System.out.println("ALUMNO DESPUES DE ACTUALIZAR");
        System.out.println("============================");

        alumno1.consultarDatos();
        
        //ACTUALIZAR DATOS DEL DOCENTE
        docente1.actualizarDatos("maria.gomez.nuevo@escuela.edu.ar", "1155554444");

        System.out.println();
        System.out.println("=============================");
        System.out.println("DOCENTE DESPUES DE ACTUALIZAR");
        System.out.println("=============================");

        docente1.consultarDatos();
        
        //ACTTUALIZAR DATOS DE LA ASIGNATURA
        asignatura1.modificar("Matematica correspondiente al cuarto anio del nivel secundario");

        System.out.println();
        System.out.println("===============================");
        System.out.println("ASIGNATURA DESPUES DE MODIFICAR");
        System.out.println("===============================");

        asignatura1.consultar();
        
        
        // REGISTRAR ASIGNATURA
        System.out.println();
        asignatura1.registrar();
    }
}
