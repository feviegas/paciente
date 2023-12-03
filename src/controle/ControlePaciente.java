package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.w3c.dom.UserDataHandler;

import dao.PacienteDAO;
import modelo.Paciente;
import visao.VisaoPaciente;

public class ControlePaciente implements ActionListener{
	
	private PacienteDAO pacdao;
	private Paciente pac;
	private VisaoPaciente vispac;
	
	public ControlePaciente(VisaoPaciente vispac, Paciente pac) {
		this.pac = pac;
		this.vispac = vispac;
		pacdao = new PacienteDAO();
		registraPaciente();
	}
	
	public void registraPaciente() {
		vispac.getBotaoCadastra().addActionListener(this);
		vispac.getBotaoConsulta().addActionListener(this);
		vispac.getBotaoLimpa().addActionListener(this);
		vispac.getBotaoLimpaCadastro().addActionListener(this);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Cadastra")) {
			String cpf = vispac.getFieldCadastraCPF().getText();
			String nome = vispac.getFieldCadastraNome().getText();
			String endereco = vispac.getFieldCadastraEndereco().getText();
			
			pac.setCpf(cpf);
			pac.setNome(nome);
			pac.setEdereco(endereco);
			boolean cadasatro = pacdao.cadastraPaciente(pac);
			
			if(cadasatro) {
				System.out.println("Cadastro Realizado Com Sucesso");
				vispac.getFieldCadastraCPF().setText("");
				vispac.getFieldCadastraNome().setText("");
				vispac.getFieldCadastraEndereco().setText("");
				
			}else {
				System.out.println("Erro");
				vispac.getFieldCadastraCPF().setText("");
				vispac.getFieldCadastraNome().setText("");
				vispac.getFieldCadastraEndereco().setText("");				
			}
			
		}else if(e.getActionCommand().equals("Consultar")) {
			String cpf = vispac.getFieldConsultaCPF().getText();
			pac.setCpf(cpf);
			pacdao.consultaPaciente(pac);
			vispac.getFieldConsultaNome().setText(pac.getNome());
			vispac.getFieldConsultaEndereco().setText(pac.getEdereco());
			
		}else if(e.getActionCommand().equals("Limpar")) {
			vispac.getFieldCadastraCPF().setText("");
			vispac.getFieldCadastraNome().setText("");
			vispac.getFieldCadastraEndereco().setText("");
			
		} else if(e.getActionCommand().equals("Limpa")) {
			vispac.getFieldConsultaCPF().setText("");
			vispac.getFieldConsultaNome().setText("");
			vispac.getFieldConsultaEndereco().setText("");
		}
		
	}
	

}
