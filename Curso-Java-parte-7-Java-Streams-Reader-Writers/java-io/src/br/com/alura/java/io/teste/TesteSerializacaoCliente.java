package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws IOException, Exception {

//		Cliente cliente = new Cliente();
//		cliente.setNome("Bruno");
//		cliente.setProfissao("DEV");
//		cliente.setCpf("12312312323");
//
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cliente.bin"));
//		oos.writeObject(cliente);
//		oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cli = (Cliente) ois.readObject();
		ois.close();
		System.out.println(cli.getProfissao());
	}

}
