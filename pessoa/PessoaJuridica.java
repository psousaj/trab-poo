package pessoa;

public class PessoaJuridica extends Pessoa{
	private String cnpj;
	private String razaoSocial;
	
	public PessoaJuridica(String nome, String sobrenome, int idade) {
		super(nome, sobrenome, idade);
		// TODO Auto-generated constructor stub
	}

	public String getCnpj() {
		StringBuilder sb = new StringBuilder(cnpj);
		sb.insert(2, ".");
		sb.insert(6, ".");
		sb.insert(10, "/");
		sb.insert(15, "-");

		return sb.toString();
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
		StringBuilder sb = new StringBuilder("\n-------------------------------\n");
			sb.append(super.fullName());
			sb.append("\nCPNJ: "+getCnpj());
			sb.append("\nRazao Social: "+getRazaoSocial());

		return super.toString()+(sb.toString());
	}
}
