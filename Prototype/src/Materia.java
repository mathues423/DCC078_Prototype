public class Materia implements Cloneable{

    private String codigo;
    private String ementa;
    private String calendario;

    public Materia(String codigo, String ementa, String calendario){
        this.calendario = calendario;
        this.ementa = ementa;
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }

    public String getCalendario() {
        return calendario;
    }

    public void setCalendario(String calendario) {
        this.calendario = calendario;
    }

    @Override
    public Materia clone() throws CloneNotSupportedException {
        Materia materiaClone = (Materia) super.clone();
        return materiaClone;
    }

    @Override
    public String toString() {
        return "Materia{\n"+
                "Codigo: "+codigo+"\n"+
                "Ementa: "+ementa+"\n"+
                "Calendario: "+calendario+"\n"+
                "}"
                ;
    }
}
