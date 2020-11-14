public class Candidato extends Eleitor {
    private int cargoCandidato = -1;
    private int votosCandidato = 0;
    private int numeroCandidato = -1;
    
    public Candidato () {}
    
    public Candidato (String nomeCandidato, String rgCandidato, int cargoCandidato, int numeroCandidato) {
        this.setNomeCandidato(nomeCandidato);
        this.setRgCandidato(rgCandidato);
        this.setCargo(cargoCandidato);
        this.setnumeroCandidato(numeroCandidato);
    }
    
    public int getcargoCandidato() {
        return cargoCandidato;
    }

    public boolean setcargoCandidato(int cargoCandidato) {
        if (cargoCandidato == 1 || cargoCandidato == 2) {
            this.cargoCandidato = cargoCandidato;
            
            return true;
        } else {
            return false;
        }
    }
    
    public int getvotosCandidato () {
        return this.votosCandidato;
    }
    
    public void acrescentarVotos () {
        this.votosCandidato++;
    }
    
    public int numeroDandidato () {
        return this.numeroCandidato;
    }
    
    public boolean setnumeroCandidato (int numeroCandidato) {
        if (numeroCandidato <= 0) return false;
        this.numeroCandidato = numeroCandidato;
        return true;
    }
    
    public boolean verificarDocumento () {
        return super.verificarDocumento() &&
            cargoCandidato != -1 &&
            numeroCandidato != -1;
    }
}