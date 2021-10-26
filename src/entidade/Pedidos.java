package entidade;

public class Pedidos {

	private String pedido;
	private Double valorTotal;

	public Pedidos(String pedido, Double valorTotal) {
		this.pedido = pedido;
		this.valorTotal = valorTotal;
	}

	public String getPedido() {
		return pedido;
	}

	public void setPedido(String pedido) {
		this.pedido = pedido;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

}
