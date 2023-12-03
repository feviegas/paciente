package controle;

import modelo.Paciente;
import visao.VisaoPaciente;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
		VisaoPaciente vis = new VisaoPaciente();
		vis.setVisible(true);
		vis.setVisible(true);
		Paciente paciente = new Paciente();
		ControlePaciente pacCon = new ControlePaciente(vis, paciente); 
	}

}
