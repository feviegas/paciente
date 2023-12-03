package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import modelo.Paciente;

public class PacienteDAO {

	File arq;

	public PacienteDAO() {
		arq = new File("Pacientes.txt");

	}

	public boolean cadastraPaciente(Paciente pac) {
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fw = new FileWriter(arq, true);
			bw = new BufferedWriter(fw);
			bw.write(pac.toString());
			bw.newLine();
			bw.flush();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return false;

	}

	public boolean consultaPaciente(Paciente pac) {
		boolean resp = false;
		try {
			FileReader fr = new FileReader(arq);
			BufferedReader br = new BufferedReader(fr);

			String linha = null;
			String[] campos = new String[3];

			while ((linha = br.readLine()) != null) {
				campos = linha.split("#");

				if (campos[0].equals(pac.getCpf())) {
					pac.setNome(campos[1]);
					pac.setEdereco(campos[2]);

					resp = true;
					break;

				}

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;

	}
}
