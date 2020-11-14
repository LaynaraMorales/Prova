public class Votos {
	private Candidato vereador;
	private Candidato prefeito;
	private Eleitor eleitor;
	
	public Votos () {}
	
	public Votos (Candidato vereador, Candidato prefeito, Eleitor eleitor) {
		this.setVereador(vereador);
		this.setPrefeito(prefeito);
		this.setEleitor(eleitor);
	}
	
	public boolean setVereador(Candidato vereador) {
		if (vereador.getCargoCandidato() != 1 || vereador.getRgCandidato() == null) {
			return false;
		}
		
		this.vereador = vereador;
		
		return true;
	}
	
	public boolean setPrefeito(Candidato prefeito) {
		if (prefeito.getCargoCandidato() != 2 || vereador.getRgCandidato() == null) {
			return false;
		}
		
		this.prefeito = prefeito;
		
		return true;
	}
	
	public boolean setEleitor(Eleitor eleitor) {
		if (eleitor.getRgCandidato() == null) return false;
		
		this.eleitor = eleitor;
		
		return true;
	}
	
	public Eleitor getEleitor() {
		return eleitor;
	}
	
	public Candidato getVereador() {
		return vereador;
	}
	
	public Candidato getPrefeito() {
		return prefeito;
	}
}

