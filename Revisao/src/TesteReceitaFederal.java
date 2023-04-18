import java.util.Scanner;

public class TesteReceitaFederal {
	
public static void main(String[] args) {

Scanner input = new Scanner(System.in);
/*while(true) {
	System.out.println("Digite a opção que deseja realizar: "
			+ "\n 1-Adicionar Pessoa"
			+ "\n 2-Remover Pessoa"
			+ "\n 3-Retornar quantidade de pessoas fisicas"
			+ "\n 4-Retornar quantidade de pessoas juridicas"
			+ "\n 5-Calcular o imposto de uma pessoa"
			+ "\n 6-Calcular o imposto a receber"
			+ "\n 7-Imprimir o dado de todas pessoas");
}*/

ReceitaFederal rf = new ReceitaFederal();

PessoaFisica daniel = new PessoaFisica("Daniel", "rua ramiro marigo", 2000, "1");
PessoaFisica lopes = new PessoaFisica("Daniel", "rua ramiro marigo", 2000, "1");
PessoaFisica santos = new PessoaFisica("Daniel", "rua ramiro marigo", 2000, "1");
rf.addPessoa(daniel);
rf.addPessoa(lopes);








}
}

