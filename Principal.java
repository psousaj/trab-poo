import banco.*;
import pessoa.*;

public class Principal {
    public static void main(String[] args) {
        PessoaFisica jeova = new PessoaFisica("Jeová", "Tavares", 37);
        Conta c = new Conta(jeova);
        c.creditar(2000.0);
        c.debitar(100);

        PessoaJuridica samuel = new PessoaJuridica("Samuel", "Rodrigues", 37);
        ContaEspecial c2 = new ContaEspecial(samuel, 200);
        c2.debitar(500);

        ContaPoupanca c3 = new ContaPoupanca(
                new Pessoa("Agamenon", "Quinderé", 25),
                10000);

        c3.rendeJuros();

        System.out.println(c);

        System.out.println(c2);

        System.out.println(c3);

        samuel.setCnpj("12345678000910");
        samuel.setRazaoSocial("Professores unidos LTDA.");
        System.out.println(samuel);
    }
}
