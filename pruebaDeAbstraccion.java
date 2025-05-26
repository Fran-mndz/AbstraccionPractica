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
    public static abstract class MiembroSeleccion {
        protected int id;
        protected String nombre;
        protected String apellidos;
        protected int edad;
    
        public MiembroSeleccion(int id, String nombre, String apellidos, int edad) {
            this.id = id;
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.edad = edad;
        }
        public abstract void concentrarse();
        public abstract void viajar();
    }
    static class Futbolista extends MiembroSeleccion {
        private int dorsal;
        private String demarcacion;
    
        public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
            super(id, nombre, apellidos, edad);
            this.dorsal = dorsal;
            this.demarcacion = demarcacion;
        }
    
        @Override
        public void concentrarse() {
            System.out.println("El futbolista " + nombre + " se concentra.");
        }
    
        @Override
        public void viajar() {
            System.out.println("El futbolista " + nombre + " viaja con el equipo.");
        }
    
        public void jugarPartido() {
            System.out.println("El futbolista " + nombre + " juega el partido como " + demarcacion + " con el dorsal " + dorsal + ".");
        }
        public void entrenar() {
            System.out.println("El futbolista " + nombre + " entrena.");
        }
    }
    //clase Entrenador
    static class Entrenador extends MiembroSeleccion {
        private String idFederacion;
    
        public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
            super(id, nombre, apellidos, edad);
            this.idFederacion = idFederacion;
        }
    
        @Override
        public void concentrarse() {
            System.out.println("El entrenador " + nombre + " se concentra.");
        }
    
        @Override
        public void viajar() {
            System.out.println("El entrenador " + nombre + " viaja con el equipo.");
        }
        public void dirigirPartido() {
            System.out.println("El entrenador " + nombre + " dirige el partido.");
        }
        public void dirigirEntrenamiento() {
            System.out.println("El entrenador " + nombre + " dirige el entrenamiento.");
        }
    }
    // Clase Masajista
    static class Masajista extends MiembroSeleccion {
        private String titulacion;
        private int aniosExperiencia;
    
        public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
            super(id, nombre, apellidos, edad);
            this.titulacion = titulacion;
            this.aniosExperiencia = aniosExperiencia;
        }
    
        @Override
        public void concentrarse() {
            System.out.println("El masajista " + nombre + " se concentra.");
        }
    
        @Override
        public void viajar() {
            System.out.println("El masajista " + nombre + " viaja con el equipo.");
        }
    
        public void darMasaje() {
            System.out.println("El masajista " + nombre + " da un masaje a un jugador.");
        }
    }
}
