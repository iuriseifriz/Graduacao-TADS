public class Prontuario {
    private String statusConsulta;
    private String sintomas;
    private String examesSolicitados;
    private String medicamentos;

    public Prontuario(String statusConsulta, String sintomas, String examesSolicitados, String medicamentos) {
        this.statusConsulta = statusConsulta;
        this.sintomas = sintomas;
        this.examesSolicitados = examesSolicitados;
        this.medicamentos = medicamentos;
    }

    public String getStatusConsulta() {
        return statusConsulta;
    }

    public void setDetalhesConsulta(String detalhesConsulta) {
        this.statusConsulta = detalhesConsulta;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public String getExamesSolicitados() {
        return examesSolicitados;
    }

    public void setExamesSolicitados(String examesSolicitados) {
        this.examesSolicitados = examesSolicitados;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }


}