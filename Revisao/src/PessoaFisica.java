
public class PessoaFisica extends Pessoa {
private String cpf;

public PessoaFisica() {
	
}

public PessoaFisica(String cpf) {
	this.cpf = cpf;
}

public PessoaFisica(String nome, String endereco, double renda, String cpf) {
	super(nome, endereco, renda);
	this.cpf = cpf;
}

public double calculaImposto() {
	double imposto = 0;
	if(super.getRenda() >= 3600.01) {
		imposto = (super.getRenda() * 0.3) - 700;
		return imposto;
	} else if(super.getRenda() >= 2800.01 && super.getRenda() < 3600.01) {
		imposto = (super.getRenda() * 0.25) - 500;
		
	} else if (super.getRenda() >= 2100.01 && super.getRenda() < 2800.00) {
		imposto = (super.getRenda() * 0.15) - 270;
		
	} else if (super.getRenda() >= 1400.01 && super.getRenda() < 2100.00) {
		imposto = (super.getRenda() * 0.10) - 100;
		
	} else {
		System.out.println("Não paga imposto");
	}
	return imposto;
}

public String getCpf() {
	return cpf;
}

public void setCpf(String cpf) {
	this.cpf = cpf;
}


public String toString() {
	return super.toString()  + "\n" + "Cpf:" + cpf;
	
}

}
