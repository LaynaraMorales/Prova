import java.util.*;

public class Urna {
	private List<Votos> votos;
	private List<String> jaVotaram;	
	private List<Candidato> candidatoPrefeito;
	private List<Candidato> candidatoVereador;
	
	public Urna () {
		this.votos = new ArrayList<>();
		this.jaVotaram = new ArrayList<>();
		this.candidatoPrefeito = new ArrayList<>();
		this.candidatoVereador = new ArrayList<>();
	}
	
	public int totalVotos () {
		return this.votos.size();
	}
	
	public void mostrarEleito () {
		System.out.println("Resultados");
		this.EleitoPrefeito();
		this.EleitoVereador();
	}
	
	private void EleitoPrefeito () {
		Iterator<Candidato> iterator = this.candidatoPrefeito.iterator();
		Candidato vencedor = this.candidatoPrefeito.iterator().next();
		
		while (iterator.hasNext()) {
			Candidato candidato = iterator.next();
			
			if (vencedor.getvotosCandidato() < candidato.getvotosCandidato()) {
				vencedor = candidato;
			}
		}
		
		System.out.println(
			"Candidato eleito a Prefeito: \n" +
			"\tNome: " + vencedor.getNome() + "\n" +
			"\tRG: " + vencedor.getRg() + "\n" +
			"\tQuantidade de votos: " + vencedor.getvotosCandidato()
		);
	}
	
	private void EleitoVereador () {
		Iterator<Candidato> iterator = this.candidatoVereador.iterator();
		Candidato vencedor = this.candidatoVereador.iterator().next();
		
		while (iterator.hasNext()) {
			Candidato candidato = iterator.next();
			
			if (vencedor.getvotosCandidato() < candidato.getvotosCandidato()) {
				vencedor = candidato;
			}
		}
		
		System.out.println(
			"O Vencedor para Vereador foi: \n" +
			"\tNome: " + vencedor.getNome() + "\n" +
			"\tRG: " + vencedor.getRg() + "\n" +
			"\tQuantidade de votos: " + vencedor.getvotosCandidato()
		);
	}
	
	public boolean adicionarVoto (int codigoVereador, int codigoPrefeito, Eleitor eleitor) {
		boolean condition = !eleitor.verificarDocumentos() ||
			this.jaVotaram.contains(eleitor.getRg());
		
		if (condition) return false;
		
		Candidato vereador = this.acharCandidato(1, "", codigoVereador);
		if (vereador == null) return false;
		
		Candidato prefeito = this.acharCandidato(2, "", codigoPrefeito);
		if (prefeito == null) return false;
		
		Votos voto = new Votos (vereador, prefeito, eleitor);
		vereador.acrescentarVotos();
		prefeito.acrescentarVotos();
		
		this.votos.add(voto);
		this.jaVotaram.add(voto.getEleitor().getRg());
		return true;
	}
	
	public Candidato acharCandidato (int cargo, String rg, int codigo) {
		Iterator<Candidato> iterator;
		
		if (cargo == 2) {
			iterator = this.candidatoPrefeito.iterator();
		} else {
			iterator = this.candidatoVereador.iterator();
		}
		
		while (iterator.hasNext()) {
			Candidato candidato = iterator.next();
			
			if (candidato.getRg().equals(rg)) {
				return candidato;
			}
			if (candidato.getvotosdoCandidato() == codigo) {
				return candidato;
			}
		}
		return null;
	}
	
	public boolean adicionarCandidato (Candidato candidato) {		
		if (!candidato.verificarDocumentos()) return false;
		
		Candidato temp = this.acharCandidato(
			candidato.getCargo(),
			candidato.getRg(),
			candidato.getvotosdoCandidato()
		);
		
		if (temp != null) return false;
		
		
		if (candidato.getCargo() == 1) {
			this.candidatoVereador.add(candidato);
		} else {
			this.candidatoPrefeito.add(candidato);
		}
		
		return true;
	}
}
