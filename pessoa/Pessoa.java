package pessoa;

public class Pessoa {
	private String nome; 
	private String sobrenome;
	private int idade;
	
	public Pessoa(String nome, String sobrenome, int idade) {
		this.idade = idade;
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getIdade() {
		return idade;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public String fullName() {
		return nome + " " + sobrenome;
	}
	
//	@Override
//	public String toString() {
//		return fullName()+ ", com "+ idade+ " anos.";
//	}
}
