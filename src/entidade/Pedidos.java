package entidade;

public class Pedidos {
	
	private String alimento;
	private String bebida;
	private Double valorAlimento;
	private Double valorBebida;
	
	public Pedidos(String alimento, String bebida, Double valorAlimento, Double valorBebida) {
		this.alimento = alimento;
		this.bebida = bebida;
		this.valorAlimento = valorAlimento;
		this.valorBebida = valorBebida;
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}

	public String getBebida() {
		return bebida;
	}

	public void setBebida(String bebida) {
		this.bebida = bebida;
	}

	public Double getValorAlimento() {
		return valorAlimento;
	}

	public void setValorAlimento(Double valorAlimento) {
		this.valorAlimento = valorAlimento;
	}

	public Double getValorBebida() {
		return valorBebida;
	}

	public void setValorBebida(Double valorBebida) {
		this.valorBebida = valorBebida;
	}
	
	
}
