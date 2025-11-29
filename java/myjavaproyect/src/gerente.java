import java.util.List;

public class gerente extends empleado{

    private List<empleado> proyecto;

    @Override
    public void tarea(){
        System.out.println("Soy un gerente razo");
    }

    public gerente(String nombre, String id, double salarioBase, List<empleado> proyecto) {
        super(nombre, id, salarioBase);
        this.proyecto = proyecto;
    }

    public List<empleado> getProyecto() {
        return proyecto;
    }

    public void setProyecto(List<empleado> proyecto) {
        this.proyecto = proyecto;
    }

    

    
}
