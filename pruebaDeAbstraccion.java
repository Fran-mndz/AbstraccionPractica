public class pruebaDeAbstraccion {
    public static void main(String[] args) {
        Futbolista futbolista = new Futbolista(1, "Lionel", "Messi", 34, 10, "Delantero");
        futbolista.concentrarse();
        futbolista.viajar();
        futbolista.jugarPartido();
        futbolista.entrenar();

        System.out.println("--------------------------------");
        Entrenador entrenador = new Entrenador(2, "Pep", "Guardiola", 50, "12345");
        entrenador.concentrarse();
        entrenador.viajar();
        entrenador.dirigirPartido();
        entrenador.dirigirEntrenamiento();
        System.out.println("--------------------------------");

        Masajista masajista = new Masajista(3, "Juan", "Pérez", 40, "Fisioterapia", 15);
        masajista.concentrarse();
        masajista.viajar();
        masajista.darMasaje();
        System.out.println("--------------------------------");
    }

    // Clase abstracta MiembroSeleccion
    static abstract class MiembroSeleccion {
        private final int id;
        private String nombre;
        private String apellidos;
        private int edad;
    
        public MiembroSeleccion(int id, String nombre, String apellidos, int edad) {
            this.id = id;
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.edad = edad;
        }

        //getter
        public int getId() {
            return id;
        }
        public String getNombre() {
            return nombre;
        }
        public String getApellidos() {
            return apellidos;
        }
        public int getEdad() {
            return edad;
        }

        //Setters
        public void setNombre(){
            this.nombre = nombre;
        }
        public void setApellidos(){
            this.apellidos = apellidos;
        }
        public void setEdad(){
            this.edad = edad;
        }

        public abstract void concentrarse();
        public abstract void viajar();
    }
    static class Futbolista extends MiembroSeleccion {
        private final int dorsal;
        private final String demarcacion;
    
        public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
            super(id, nombre, apellidos, edad);
            this.dorsal = dorsal;
            this.demarcacion = demarcacion;
        }
    
        @Override
        public void concentrarse() {
            System.out.println("El futbolista " + getNombre() + " se concentra.");
        }
    
        @Override
        public void viajar() {
            System.out.println("El futbolista " + getNombre() + " viaja con el equipo.");
        }
    
        public void jugarPartido() {
            System.out.println("El futbolista " + getNombre() + " juega el partido como " + demarcacion + " con el dorsal " + dorsal + ".");
        }
        public void entrenar() {
            System.out.println("El futbolista " + getNombre() + " entrena.");
        }
    }
    //clase Entrenador
    static class Entrenador extends MiembroSeleccion {
        private final String idFederacion;
    
        public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
            super(id, nombre, apellidos, edad);
            this.idFederacion = idFederacion;
        }
    
        @Override
        public void concentrarse() {
            System.out.println("El entrenador " + getNombre() + " se concentra.");
        }
    
        @Override
        public void viajar() {
            System.out.println("El entrenador " + getNombre() + " viaja con el equipo.");
        }
        public void dirigirPartido() {
            System.out.println("El entrenador " + getNombre() + " dirige el partido.");
        }
        public void dirigirEntrenamiento() {
            System.out.println("El entrenador " + getNombre() + " dirige el entrenamiento.");
        }
    }
    // Clase Masajista
    static class Masajista extends MiembroSeleccion {
        private final String titulacion;
        private final int aniosExperiencia;
    
        public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
            super(id, nombre, apellidos, edad);
            this.titulacion = titulacion;
            this.aniosExperiencia = aniosExperiencia;
        }
    
        @Override
        public void concentrarse() {
            System.out.println("El masajista " + getNombre() + " se concentra.");
        }
    
        @Override
        public void viajar() {
            System.out.println("El masajista " + getNombre() + " viaja con el equipo.");
        }
    
        public void darMasaje() {
            System.out.println("El masajista " + getNombre() + " da un masaje a un jugador.");
        }
    }
}
