package azterketa1.ariketa2;

public class Candidatura {

    private String partido;
    private String apelCandidato;
    private String idDistrito;
    private String municipio;
    private String prov;

    public Candidatura(String partido, String apelCandidato, String idDistrito, String municipio, String prov) {
        this.partido = partido;
        this.apelCandidato = apelCandidato;
        this.idDistrito = idDistrito;
        this.municipio = municipio;
        this.prov = prov;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public String getApelCandidato() {
        return apelCandidato;
    }

    public void setApelCandidato(String apelCandidato) {
        this.apelCandidato = apelCandidato;
    }

    public String getIdDistrito() {
        return idDistrito;
    }

    public void setIdDistrito(String idDistrito) {
        this.idDistrito = idDistrito;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getProv() {
        return prov;
    }

    public void setProv(String prov) {
        this.prov = prov;
    }
}
