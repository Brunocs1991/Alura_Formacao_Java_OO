package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, Exception {

//		String nome = "Bruno Costa";
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
//		oos.writeObject(nome);
//		oos.close();

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
		String nomeLindo = (String) ois.readObject();
		ois.close();
		System.out.println(nomeLindo);
	}

}
