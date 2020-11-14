public class Eleitor {
	private String nomeEleitor = "";
	private String rgEleitor = null;
	
	public Eleitor () {}
	
	public Eleitor (String nomeEleitor, String rgEleitor) {
		this.setNomeEleitor(nomeEleitor);
		this.setRgEleitor(rgEleitor);
	}
	
	public String getNomeEleitor() {
		return this.nomeEleitor;
	}
	public void setNomeEleitor(String nomeEleitor) {
		this.nomeEleitor = nomeEleitor;
	}
	
	public String getRgEleitor() {
		return this.rgEleitor;
	}
	
	public boolean setRgEleitor(String rgEleitor) {
		if (rgEleitor.length() < 9 || rgEleitor.length() > 12) {
			return false;
		}
		
		this.rgEleitor = rgEleitor;
		
		return true;
	}
	
	public boolean verificarDocumentos () {
		return nomeEleitor != null && rgEleitor != null;
	}
	
}

