package exercicio02;

public class Produto {
	private int codigo;
	private String nome;
	private double preco;

	public Produto(int codigo, String nome, double preco) {
		setCodigo(codigo);
		setNome(nome);
		setPreco(preco);

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) throws IllegalArgumentException {
		if (codigo <=0) {
			 throw new IllegalArgumentException("C�digo inv�lido: "+ codigo);
		}
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) throws IllegalArgumentException{
		if ((nome == null) || (nome.equals(""))) {
			throw new IllegalArgumentException("Nome inv�lido!");
		}
			
			
			this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) throws IllegalArgumentException{
		if (preco <= 0) {
			throw new IllegalArgumentException("Pre�o inv�lido!");
		}
		this.preco = preco;
	}

}
