package pessoa;

public class PessoaFisica extends Pessoa{
	private String cpf; 
	
	public PessoaFisica(String nome, String sobrenome, int idade) {
		super(nome, sobrenome, idade);
		// TODO Auto-generated constructor stub
	}
	
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String valor) {
		this.cpf = valor;
	}
	
	@Override
	public String toString() {
		return super.fullName() 
				+ "CPF: "+getCpf();
	}
}
