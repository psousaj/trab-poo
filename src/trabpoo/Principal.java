//1° questão
/**
 * 
 * a) Encapsulamento é a capacidade de restringir o acesso a atributos e métodos sensíveis de uma dada classe
 * 
 * b) Herança nos possibilita definir uma classe pai onde as subclasses desta, recebem TODOS os métodos e atributos do pai(assinatura),
 *    podendo ser usados da mesma forma ou sobrescritos com a notação @override
 * 
 * c) Polimorfismo é a capacidade de fazer várias implementações de diversas formas
 * 
 * d) Atributo é toda característica de uma classe, armazenam dados ÚNICOS a cada instancia, e podem ser public, private ou protected
 * 	  Métodos são implementações de todas as "funções" de um objeto instancia da classe a que pertence.
 *    também podem ser public, private, e protected, devem conter na declaração seu tipo de retorno(primitivos, objetos ou void)
 *    e podem ou não ter parâmetros.
 * 
 * e) O que STATIC faz é tornar os atributos e/ou métodos padrão, e com o mesmo valor para cada instancia da classe
 * 
 * 2ª questão
 * 
 * Sobrecarga: 
 * 		public int calcula(int num1, int num2) {
 * 			return num1 + num2;
 * 		}
 * 
 *		public int calcula(int num1, int num2, int num3) {
 *			return num1 + num2 + num3;
 *		} 
 *
 * Sobrescrita:
 * 		@Override
 * 		public String toString() {
 * 			return "Sobrescrita";
 * 		}
 * 
**/

package trabpoo;

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
	}
}
