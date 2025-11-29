public class empleado {
    private String nombre;
    private String id;
    private double salarioBase;

    public void tarea(){
        System.out.println("Soy un empleado razo");
    }

    public empleado(String nombre, String id, double salarioBase) {
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalarioBase() {
        if (salarioBase >= 0) {
        }
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }



}
