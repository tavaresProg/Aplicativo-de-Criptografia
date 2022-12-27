package com.br.programaDeEncriptacao.Frame;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class JanelaPrincipal implements ActionListener {

	JFrame janela = new JFrame();
	JLabel label;
	JButton criptografar;
	JButton descriptografar;
	JButton sair;
	JButton creditos;

	public JanelaPrincipal() {

		criptografar = new JButton("CRIPTOGRAFAR MENSAGEM");
		criptografar.setBounds(50, 50, 400, 50);
		criptografar.setFocusable(false);
		criptografar.setBackground(Color.WHITE);
		criptografar.addActionListener(this);

		descriptografar = new JButton("DESCRIPTOGRAFAR MENSAGEM");
		descriptografar.setBounds(50, 150, 400, 50);
		descriptografar.setFocusable(false);
		descriptografar.setBackground(Color.WHITE);
		descriptografar.addActionListener(this);

		sair = new JButton("SAIR");
		sair.setBounds(50, 250, 200, 50);
		sair.setFocusable(false);
		sair.setBackground(Color.WHITE);
		sair.addActionListener(this);

		creditos = new JButton("CRÉDITOS");
		creditos.setBounds(250, 250, 200, 50);
		creditos.setFocusable(false);
		creditos.setBackground(Color.WHITE);
		creditos.addActionListener(this);

		janela.setTitle("By TavaresProg");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(500, 400);
		janela.getContentPane().setBackground(new Color(235, 180, 52));
		janela.setLocationRelativeTo(null);
		janela.setLayout(null);
		janela.add(criptografar);
		janela.add(descriptografar);
		janela.add(sair);
		janela.add(creditos);
		janela.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == criptografar) {

			janela.dispose();
			new JanelaCriptografar();

		}

		if (e.getSource() == descriptografar) {

			janela.dispose();
			new JanelaDescriptografar();

		}

		if (e.getSource() == sair) {
			System.exit(0);
		}

		if (e.getSource() == creditos) {
			JOptionPane.showMessageDialog(null, "Criado por TavaresProg :)");
		}
	}

}
