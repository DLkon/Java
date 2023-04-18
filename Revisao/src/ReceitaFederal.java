import java.util.ArrayList;

public class ReceitaFederal {
	private ArrayList<Pessoa> pessoas;

	public ReceitaFederal() {
	 pessoas = new ArrayList<>();
	}

	public ReceitaFederal(ArrayList<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}

	public void addPessoa(Pessoa pessoa) {
		
		for (int i = 0; i < pessoas.size(); i++) {
			if (pessoa instanceof PessoaFisica && pessoas.get(i) instanceof PessoaFisica) {
				PessoaFisica p1 = (PessoaFisica) pessoas.get(i);
				PessoaFisica p2 = (PessoaFisica) pessoa;
				
				
				
				if (p1.getCpf().equals(p2.getCpf())) {
					System.out.println("Cpf ja contem");
				} else {
					pessoas.add(pessoa);
				}		

			}
			
			/*if (pessoas.get(i) instanceof PessoaJuridica) {
				PessoaJuridica p1 = (PessoaJuridica) pessoas.get(i);
				if (pessoas.contains(p1.getCnpj())) {
					System.out.println("Cnpj ja contem");
				} else {
					pessoas.add(pessoa);
				}

			} */
			
		}
		
		if(pessoas.size() == 0) {
			pessoas.add(pessoa);
		}
	}

	public void removerPessoa(String nome) {
		for (int i = 0; i < pessoas.size(); i++) {
			if (pessoas.contains(nome)) {
				pessoas.remove(i);
				System.out.println("Removido com sucesso!");
			}
		}
	}

	public double calculaImpostoPessoa(String nome) {

		for (int i = 0; i < pessoas.size(); i++) {
			if (pessoas.contains(nome)) {
				return pessoas.get(i).calculaImposto();
			}
			System.out.println("Não esta na lista");
		}
		return -1;
	}

	public int quantidadePF() {
		int qnt = 0;
		for (int i = 0; i < pessoas.size(); i++) {
			if (pessoas.get(i) instanceof PessoaFisica) {
				qnt++;
			}
		}

		return qnt;
	}

	public int quantidadePJ() {
		int qnt = 0;
		for (int i = 0; i < pessoas.size(); i++) {
			if (pessoas.get(i) instanceof PessoaJuridica) {
				qnt++;
			}
		}

		return qnt;
	}

	public double totalImposto() {
		double totalImposto = 0;
		for (int i = 0; i < pessoas.size(); i++) {
			totalImposto += pessoas.get(i).calculaImposto();
		}

		return totalImposto;
	}

	
	public String toString() {
	String str = "";
		for(int i = 0;  i < pessoas.size(); i++) {
			return pessoas.get(i).toString();
		}
		return str;
	}
	
	

}
