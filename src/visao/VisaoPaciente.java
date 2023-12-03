package visao;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VisaoPaciente extends JFrame implements ActionListener{

	public final JTextField getFieldCadastraCPF() {
		return fieldCadastraCPF;
	}

	public final void setFieldCadastraCPF(JTextField fieldCadastraCPF) {
		this.fieldCadastraCPF = fieldCadastraCPF;
	}

	public final JTextField getFieldCadastraNome() {
		return fieldCadastraNome;
	}

	public final void setFieldCadastraNome(JTextField fieldCadastraNome) {
		this.fieldCadastraNome = fieldCadastraNome;
	}

	public final JTextField getFieldCadastraEndereco() {
		return fieldCadastraEndereco;
	}

	public final void setFieldCadastraEndereco(JTextField fieldCadastraEndereco) {
		this.fieldCadastraEndereco = fieldCadastraEndereco;
	}

	public final JTextField getFieldConsultaCPF() {
		return fieldConsultaCPF;
	}

	public final void setFieldConsultaCPF(JTextField fieldConsultaCPF) {
		this.fieldConsultaCPF = fieldConsultaCPF;
	}

	public final JTextField getFieldConsultaNome() {
		return fieldConsultaNome;
	}

	public final void setFieldConsultaNome(JTextField fieldConsultaNome) {
		this.fieldConsultaNome = fieldConsultaNome;
	}

	public final JTextField getFieldConsultaEndereco() {
		return fieldConsultaEndereco;
	}

	public final void setFieldConsultaEndereco(JTextField fieldConsultaEndereco) {
		this.fieldConsultaEndereco = fieldConsultaEndereco;
	}

	public final JButton getBotaoLimpa() {
		return botaoLimpa;
	}

	public final void setBotaoLimpa(JButton botaoLimpa) {
		this.botaoLimpa = botaoLimpa;
	}

	public final JButton getBotaoConsulta() {
		return botaoConsulta;
	}

	public final void setBotaoConsulta(JButton botaoConsulta) {
		this.botaoConsulta = botaoConsulta;
	}

	public final JButton getBotaoLimpaCadastro() {
		return botaoLimpaCadastro;
	}

	public final void setBotaoLimpaCadastro(JButton botaoLimpaCadastro) {
		this.botaoLimpaCadastro = botaoLimpaCadastro;
	}

	public final JButton getBotaoCadastra() {
		return botaoCadastra;
	}

	public final void setBotaoCadastra(JButton botaoCadastra) {
		this.botaoCadastra = botaoCadastra;
	}

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private CardLayout card;
	private JTextField fieldCadastraCPF;
	private JTextField fieldCadastraNome;
	private JTextField fieldCadastraEndereco;
	private JTextField fieldConsultaCPF;
	private JTextField fieldConsultaNome;
	private JTextField fieldConsultaEndereco;
	private JButton botaoLimpa;
	private JButton botaoConsulta;
	private JButton botaoLimpaCadastro;
	private JButton botaoCadastra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VisaoPaciente frame = new VisaoPaciente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VisaoPaciente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menuArquivo = new JMenu("Arquivo");
		menuBar.add(menuArquivo);
		
		JMenuItem menuCadastrar = new JMenuItem("Cadastrar");
		menuCadastrar.addActionListener(this);
		menuArquivo.add(menuCadastrar);
		
		JMenuItem menuConsultar = new JMenuItem("Consultar");
		menuConsultar.addActionListener(this);
		menuArquivo.add(menuConsultar);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		card = (CardLayout) contentPane.getLayout();

		
		JPanel panelCadastra = new JPanel();
		contentPane.add(panelCadastra, "t1");
		panelCadastra.setLayout(new BorderLayout(0, 0));
		
		JPanel northCPanel = new JPanel();
		FlowLayout fl_northCPanel = (FlowLayout) northCPanel.getLayout();
		fl_northCPanel.setAlignment(FlowLayout.LEFT);
		panelCadastra.add(northCPanel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Cadastra Paciente");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		northCPanel.add(lblNewLabel);
		
		JPanel centerCPanel = new JPanel();
		FlowLayout fl_centerCPanel = (FlowLayout) centerCPanel.getLayout();
		fl_centerCPanel.setAlignment(FlowLayout.LEFT);
		panelCadastra.add(centerCPanel, BorderLayout.CENTER);
		
		JLabel lblNewLabel_2 = new JLabel("CPF");
		centerCPanel.add(lblNewLabel_2);
		
		fieldCadastraCPF = new JTextField();
		centerCPanel.add(fieldCadastraCPF);
		fieldCadastraCPF.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("NOME");
		centerCPanel.add(lblNewLabel_3);
		
		fieldCadastraNome = new JTextField();
		centerCPanel.add(fieldCadastraNome);
		fieldCadastraNome.setColumns(20);
		
		JLabel lblNewLabel_4 = new JLabel("ENDEREÇO");
		centerCPanel.add(lblNewLabel_4);
		
		fieldCadastraEndereco = new JTextField();
		centerCPanel.add(fieldCadastraEndereco);
		fieldCadastraEndereco.setColumns(25);
		
		JPanel southCPanel = new JPanel();
		FlowLayout fl_southCPanel = (FlowLayout) southCPanel.getLayout();
		fl_southCPanel.setAlignment(FlowLayout.LEFT);
		panelCadastra.add(southCPanel, BorderLayout.SOUTH);
		
		botaoCadastra = new JButton("Cadastra");
		southCPanel.add(botaoCadastra);
		
		botaoLimpaCadastro = new JButton("Limpar");
		southCPanel.add(botaoLimpaCadastro);
		
		JPanel panelConsulta = new JPanel();
		contentPane.add(panelConsulta, "t2");
		panelConsulta.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		panelConsulta.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel_1 = new JLabel("Consulta Paciente");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout_2 = (FlowLayout) panel_1.getLayout();
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		panelConsulta.add(panel_1, BorderLayout.SOUTH);
		
		botaoConsulta = new JButton("Consultar");
		panel_1.add(botaoConsulta);
		
		botaoLimpa = new JButton("Limpa");
		panel_1.add(botaoLimpa);
		
		JPanel panel_2 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_2.getLayout();
		flowLayout_1.setAlignOnBaseline(true);
		flowLayout_1.setAlignment(FlowLayout.LEFT);
		panelConsulta.add(panel_2, BorderLayout.CENTER);
		
		JLabel lblNewLabel_5 = new JLabel("CPF");
		panel_2.add(lblNewLabel_5);
		
		fieldConsultaCPF = new JTextField();
		panel_2.add(fieldConsultaCPF);
		fieldConsultaCPF.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("NOME");
		panel_2.add(lblNewLabel_6);
		
		fieldConsultaNome = new JTextField();
		panel_2.add(fieldConsultaNome);
		fieldConsultaNome.setColumns(20);
		
		JLabel lblNewLabel_7 = new JLabel("ENDRECO");
		panel_2.add(lblNewLabel_7);
		
		fieldConsultaEndereco = new JTextField();
		panel_2.add(fieldConsultaEndereco);
		fieldConsultaEndereco.setColumns(25);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Cadastrar")) {
			card.show(contentPane, "t1");
		}else if (e.getActionCommand().equals("Consultar")) {
			card.show(contentPane, "t2");
		}
		
	}

}
