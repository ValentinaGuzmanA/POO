package salud;

public class Empleado extends Persona {

    private String cargo;
    private double valorhora;
    private int horastrabajadas;
    private String Departamento;

    public Empleado(String tipoDoc, String documento, String nombre, String apellido, String cargo, int horastrabajadas,
            double valorhora) {
        super(tipoDoc, documento, nombre, apellido);
        this.setCargo(cargo);
        this.setHorastrabajadas(horastrabajadas);
        this.setValorhora(valorhora);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getValorhora() {
        return valorhora;
    }

    public void setValorhora(double valorhora) {
        this.valorhora = valorhora;
    }

    public int getHorastrabajadas() {
        return horastrabajadas;
    }

    public void setHorastrabajadas(int horastrabajadas) {
        this.horastrabajadas = horastrabajadas;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }

    public void calcularHonorarios() {
        double valorhonorario;
        valorhonorario = this.getValorhora() * this.getHorastrabajadas();
        double reteica = valorhonorario * 0.966 / 100;
        double valortotal = valorhonorario - reteica;

        System.out.println("Tipo de documento: " + this.getTipoDoc());
        System.out.println("Número de documento: " + this.getDocumento());
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Apellido: " + this.getApellido());
        System.out.println("cargo: " + this.getCargo());
        System.out.println("Horas trabajadas: " + this.getHorastrabajadas());
        System.out.println("Valor hora: " + this.getValorhora());
        System.out.println("total: " + valortotal);
    }
}
