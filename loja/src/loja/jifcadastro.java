package loja;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JLabel;

import persistencia.IncluirEditarDAO;
import classes.Pessoas;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class jifcadastro extends JInternalFrame {
	
	int acao,status;
	Pessoas objpes = new Pessoas();
	IncluirEditarDAO IEDAO;
	
	
	private JTextField jtcod;
	private JTextField jtnome;
	private JTextField jtrg;
	private JTextField jtcpf;
	private JTextField jttel;
	private JTextField jtdata;
	private JTextArea  jtend;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jifcadastro frame = new jifcadastro();
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
	public jifcadastro() {
		setTitle("Cadastro");
		setMaximizable(true);
		setIconifiable(true);
		setClosable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 389);
		getContentPane().setLayout(null);
		
		jtcod = new JTextField();
		jtcod.setBounds(46, 49, 60, 20);
		getContentPane().add(jtcod);
		jtcod.setColumns(10);
		
		jtnome = new JTextField();
		jtnome.setEnabled(false);
		jtnome.setBounds(132, 49, 302, 20);
		getContentPane().add(jtnome);
		jtnome.setColumns(10);
		
		JButton btpesq = new JButton("...");
		btpesq.setBounds(454, 48, 45, 23);
		getContentPane().add(btpesq);
		
		jtrg = new JTextField();
		jtrg.setEnabled(false);
		jtrg.setBounds(46, 95, 155, 20);
		getContentPane().add(jtrg);
		jtrg.setColumns(10);
		
		jtcpf = new JTextField();
		jtcpf.setEnabled(false);
		jtcpf.setBounds(237, 95, 197, 20);
		getContentPane().add(jtcpf);
		jtcpf.setColumns(10);
		
		jttel = new JTextField();
		jttel.setEnabled(false);
		jttel.setBounds(456, 95, 155, 20);
		getContentPane().add(jttel);
		jttel.setColumns(10);
		
		JTextArea jtend = new JTextArea();
		jtend.setEnabled(false);
		jtend.setBounds(56, 151, 389, 102);
		getContentPane().add(jtend);
		
		JLabel lblRg = new JLabel("RG:");
		lblRg.setBounds(46, 80, 46, 14);
		getContentPane().add(lblRg);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setBounds(237, 80, 46, 14);
		getContentPane().add(lblCpf);
		
		JLabel lblTelefone = new JLabel("Telefone");
		lblTelefone.setBounds(454, 80, 46, 14);
		getContentPane().add(lblTelefone);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(133, 26, 46, 14);
		getContentPane().add(lblNome);
		
		JLabel lblId = new JLabel("Id");
		lblId.setBounds(47, 26, 46, 14);
		getContentPane().add(lblId);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(66, 126, 46, 14);
		getContentPane().add(lblEndereo);
		
		jtdata = new JTextField();
		jtdata.setEnabled(true);
		jtdata.setBounds(526, 49, 86, 20);
		getContentPane().add(jtdata);
		jtdata.setColumns(10);
		
		JLabel lblDataDeCadastro = new JLabel("Data de Cadastro");
		lblDataDeCadastro.setBounds(527, 26, 85, 14);
		getContentPane().add(lblDataDeCadastro);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(464, 142, 46, 14);
		getContentPane().add(lblStatus);
		
		JRadioButton jrativo = new JRadioButton("Ativo");
		jrativo.setBounds(464, 163, 109, 23);
		getContentPane().add(jrativo);
		
		JRadioButton jrinativo = new JRadioButton("Inativo");
		jrinativo.setBounds(464, 203, 109, 23);
		getContentPane().add(jrinativo);
		
		JButton jbeditar = new JButton("Editar");
		jbeditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				acao=2;
			}
		});
		jbeditar.setEnabled(false);
		jbeditar.setBounds(160, 286, 94, 40);
		getContentPane().add(jbeditar);
		
		JButton jbcancelar = new JButton("Cancelar");
		jbcancelar.setEnabled(false);
		jbcancelar.setBounds(360, 286, 89, 40);
		getContentPane().add(jbcancelar);
		
		JButton jbsalvar = new JButton("Salvar");
		jbsalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				/*jtnome.setEnabled(false);
				jtend.setEnabled(false);
				jtcpf.setEnabled(false);
				jtrg.setEnabled(false);
				jttel.setEnabled(false);
				jtcod.setEnabled(true);
				jrativo.setSelected(false);
				
				jbeditar.setEnabled(false);
				jbsalvar.setEnabled(false);
				jbcancelar.setEnabled(false);
				
				jtnome.setText("");
				jtend.setText("");
				jtcpf.setText("");
				jtrg.setText("");
				jttel.setText("");
				jtcod.setText("");
				*/
				int cod;
				
				objpes = new Pessoas();
				preencher_objetos();
				
				if(jrativo.isSelected()){
					status = 1;
				}
				
				if(jrinativo.isSelected()){
					status=0;
				}
				
				try{
					
					IEDAO = new IncluirEditarDAO();
					if (acao==1){
						
						cod = IEDAO.Incluir(objpes);
						jtcod.setText(String.valueOf(cod));
						JOptionPane.showMessageDialog(null,"Salvo com Suceso !");
						
						jtnome.setEnabled(false);
						jtend.setEnabled(false);
						jtcpf.setEnabled(false);
						jtrg.setEnabled(false);
						jttel.setEnabled(false);
						jtcod.setEnabled(true);
						jrativo.setSelected(false);
						
						jbeditar.setEnabled(false);
						jbsalvar.setEnabled(false);
						jbcancelar.setEnabled(false);
						
						jtnome.setText("");
						jtend.setText("");
						jtcpf.setText("");
						jtrg.setText("");
						jttel.setText("");
						jtcod.setText("");
						
					}
					
				}catch (Exception error){
					JOptionPane.showMessageDialog(null,"Operação não Realizada !"+error.getMessage());
				}
				
				
				jbsalvar.setEnabled(false);
				
				
			}
		});
		jbsalvar.setEnabled(false);
		jbsalvar.setBounds(264, 286, 86, 40);
		getContentPane().add(jbsalvar);
		
		JButton jbsair = new JButton("Sair");
		jbsair.setBounds(610, 325, 89, 23);
		getContentPane().add(jbsair);
		
		JButton jbexcluir = new JButton("Excluir");
		jbexcluir.setEnabled(false);
		jbexcluir.setBounds(610, 286, 89, 23);
		getContentPane().add(jbexcluir);
		
		
		
		
		ButtonGroup grupo1 = new ButtonGroup();  
		  
		grupo1.add(jrinativo);  
		grupo1.add(jrativo);  
		
		JButton jbnovo = new JButton("Novo");
		jbnovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				jtnome.setEnabled(true);
				jtend.setEnabled(true);
				jtcpf.setEnabled(true);
				jtrg.setEnabled(true);
				jttel.setEnabled(true);
				jtcod.setEnabled(false);
				jtdata.setEnabled(true);
				jrativo.setSelected(true);
				
				jbeditar.setEnabled(true);
				jbsalvar.setEnabled(true);
				jbcancelar.setEnabled(true);
				
				acao=1;
				
				/*Date dataSistema = new Date();
				jtdata.setDate(dataSistema);
				*/
		        
		        
				
			}
		});

		jbnovo.setBounds(56, 286, 94, 40);
		getContentPane().add(jbnovo);
		
		
		
		

	}
	
	public void preencher_objetos(){
		objpes.setPes_nome(jtnome.getText().trim());
		objpes.setPes_rg(jtrg.getText().trim());
		objpes.setPes_cpg(jtcpf.getText().trim());
		
		objpes.setPes_dtcadastro(jtdata.getText().trim());
		objpes.setPes_tel(jttel.getText().trim());
		objpes.setPes_status(status);
	}
}
