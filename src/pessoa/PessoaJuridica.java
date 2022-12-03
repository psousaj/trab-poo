package pessoa;

public class PessoaJuridica extends Pessoa{
	private String cnpj;
	private String razaoSocial;
	
	public PessoaJuridica(String nome, String sobrenome, int idade) {
		super(nome, sobrenome, idade);
		// TODO Auto-generated constructor stub
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	
	@Override
	public String toString() {
		return super.fullName()
				+"CPNJ: "+getCnpj()
				+"Razão Social: "+getRazaoSocial();
	}
}
