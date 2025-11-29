public class desarrollador extends empleado {

    private String lenguajePrincipal;

    @Override
    public void tarea(){
        System.out.println("Soy un desarrollador razo");
    }

    public desarrollador(String nombre, String id, double salarioBase, String lenguajePrincipal) {
        super(nombre, id, salarioBase);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }

    public void setLenguajePrincipal(String lenguajePrincipal) {
        this.lenguajePrincipal = lenguajePrincipal;
    }

}
