
public class TestaBanco {
	
	public static void main(String[] args) {
		
		Cliente rodrigo = new Cliente();
		rodrigo.nome = "Rodrigo Viana Rocha";
		rodrigo.cpf = "222.222.222-22";
		rodrigo.profissao = "Programador e Contador";
		
		Conta contaDoRodrigo = new Conta();
		contaDoRodrigo.deposita(1000);
		
		//Linha da composição
		
		contaDoRodrigo.titular = rodrigo;
		System.out.println(contaDoRodrigo.titular.nome);
		System.out.println(contaDoRodrigo.titular);
		
		
	}

}
