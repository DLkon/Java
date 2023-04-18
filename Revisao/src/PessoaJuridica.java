public class PessoaJuridica extends Pessoa {
private String cnpj;


public PessoaJuridica() {
	
}

public PessoaJuridica(String cnpj) {
	this.cnpj = cnpj;
}

public PessoaJuridica(String nome, String endereco, double renda, String cnpj) {
	super(nome, endereco, renda);
	this.cnpj = cnpj;
}


public String getCnpj() {
	return cnpj;
}

public void setCnpj(String cnpj) {
	this.cnpj = cnpj;
}

public String toString() {
	return super.toString() + "\n " + "Cnpj: " + cnpj;
}
}
