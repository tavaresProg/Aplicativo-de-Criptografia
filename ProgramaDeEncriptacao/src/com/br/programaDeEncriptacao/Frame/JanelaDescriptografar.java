package com.br.programaDeEncriptacao.Frame;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.br.programaDeEncriptacao.Funcionalidade.MetodoDeCodificacao;

public class JanelaDescriptografar extends MetodoDeCodificacao implements ActionListener {

	private JFrame janela = new JFrame();
	private JLabel label = new JLabel();
	private JTextField campoDeTexto = new JTextField();
	private JTextField campoDeResposta = new JTextField();
	private JButton ok;
	private JButton voltar;
	private String guardarMensagemDigitada;

	JanelaDescriptografar() {

		label.setBounds(50, 50, 400, 50);
		label.setText("DIGITE A MENSAGEM E APERTE [OK]");
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("MS Sans Serif", Font.PLAIN, 20));

		ok = new JButton("OK");
		ok.setBounds(50, 250, 200, 50);
		ok.setFocusable(false);
		ok.setBackground(Color.WHITE);
		ok.addActionListener(this);

		voltar = new JButton("VOLTAR");
		voltar.setBounds(250, 250, 200, 50);
		voltar.setFocusable(false);
		voltar.setBackground(Color.WHITE);
		voltar.addActionListener(this);

		campoDeTexto.setBounds(50, 100, 400, 50);
		campoDeTexto.setBackground(Color.WHITE);
		campoDeTexto.setFont(new Font("MS Sans Serif", Font.PLAIN, 20));

		campoDeResposta.setBounds(50, 160, 400, 50);
		campoDeResposta.setBackground(Color.WHITE);
		campoDeResposta.setFont(new Font("MS Sans Serif", Font.PLAIN, 20));
		campoDeResposta.setEditable(false);

		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(500, 400);
		janela.getContentPane().setBackground(new Color(235, 180, 52));
		janela.setLocationRelativeTo(null);
		janela.setLayout(null);
		janela.add(label);
		janela.add(ok);
		janela.add(voltar);
		janela.add(campoDeTexto);
		janela.add(campoDeResposta);
		janela.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == ok) {

			campoDeTexto.setEditable(false);
			guardarMensagemDigitada = campoDeTexto.getText();
			caracteres = guardarMensagemDigitada.toCharArray();

			descriptografar();

			campoDeResposta.setText(getMensagem());
			ok.setEnabled(false);
		}

		if (e.getSource() == voltar) {
			janela.dispose();
			new JanelaPrincipal();
		}

	}

}
