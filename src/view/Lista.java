package src.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import src.model.Inventario;

/**
* Uma classe que representa a janela de lista de itens do inventário.
*/
public class Lista extends JFrame implements ActionListener{

    JButton criarBem, bPesquisa;
    Inventario inv;
    
    /**
    * Construtor para a classe Lista.
    *
    * @param inv o inventário associado à lista
    */
    public Lista(Inventario inv) {

        //configurando janela
        setTitle("DoomDec");
        this.setLayout(null);
        this.setSize(1360, 730);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(255, 255, 255));

        //configurando navbar
        JPanel navbar = new JPanel();
        navbar.setLayout(null);
        navbar.setBounds(0, 0, 1360, 100);
        navbar.setBackground(new Color(0, 0, 0));
        JLabel titulo = new JLabel("DoomDec");
        titulo.setForeground(Color.white);
        titulo.setBounds(20, 25, 325, 51);
        titulo.setFont(new Font("Regular", Font.BOLD, 48));

        //configurando botões
        JButton bPesquisa = new JButton("Pesquisar");
        bPesquisa.setBounds(920,121,400, 55);
        bPesquisa.setFont(new Font("Regular", Font.BOLD, 38));
        bPesquisa.setBackground(new Color (11,181,79));
        bPesquisa.setForeground(new Color (255,255,255));
        bPesquisa.addActionListener(this);
        criarBem = new JButton("Criar Bem");
        criarBem.setBounds(920,23,400, 55);
        criarBem.setFont(new Font("Regular", Font.BOLD, 38));
        criarBem.setBackground(new Color (11,181,79));
        criarBem.setForeground(new Color (255,255,255));
        criarBem.addActionListener(this);

        //configurando pesquisa
        JTextField pesquisa = new JTextField();
        pesquisa.setBounds(48, 121, 800, 55);
        pesquisa.setFont(new Font("Regular", Font.BOLD, 30));
        pesquisa.setBackground(new Color(217, 217, 217));

        //configurando barras de detalhes: Imoveis
        JLabel tImoveis = new JLabel("Imoveis");
        tImoveis.setForeground(Color.black);
        tImoveis.setBounds(40, 186, 150, 48);
        tImoveis.setFont(new Font("Regular", Font.BOLD, 40));
        JPanel fImoveis = new JPanel();
        fImoveis.setLayout(new BoxLayout(fImoveis, BoxLayout.Y_AXIS));
        fImoveis.setBackground(new Color(217, 217, 217));
        JScrollPane sImoveis = new JScrollPane(fImoveis);
        sImoveis.setBounds(40, 234, 400, 450);
        sImoveis.setBackground(new Color(217, 217, 217));

        //configurando barras de detalhes: Moveis
        JLabel tMoveis = new JLabel("Moveis");
        tMoveis.setForeground(Color.black);
        tMoveis.setBounds(480, 186, 140, 48);
        tMoveis.setFont(new Font("Regular", Font.BOLD, 40));
        JPanel fMoveis = new JPanel();
        fMoveis.setLayout(new BoxLayout(fMoveis, BoxLayout.Y_AXIS));
        fMoveis.setBackground(new Color(217, 217, 217));
        JScrollPane sMoveis = new JScrollPane(fMoveis);
        sMoveis.setBounds(480, 234, 400, 450);
        sMoveis.setBackground(new Color(217, 217, 217));

        //configurando barras de detalhes: Veiculos
        JLabel tVeiculos = new JLabel("Veiculos");
        tVeiculos.setForeground(Color.black);
        tVeiculos.setBounds(920, 186, 170, 48);
        tVeiculos.setFont(new Font("Regular", Font.BOLD, 40));
        JPanel fVeiculos = new JPanel();
        fVeiculos.setLayout(new BoxLayout(fVeiculos, BoxLayout.Y_AXIS));
        fVeiculos.setBackground(new Color(217, 217, 217));
        JScrollPane sVeiculos = new JScrollPane(fVeiculos);
        sVeiculos.setBounds(920, 234, 400, 450);
        sVeiculos.setBackground(new Color(217, 217, 217));

        //adicionando
        sImoveis.add(fImoveis);
        this.add(sImoveis);
        this.add(sMoveis);
        this.add(sVeiculos);
        this.add(tImoveis);
        this.add(tMoveis);
        this.add(tVeiculos);
        this.add(titulo);
        this.add(navbar);
        this.add(pesquisa);
        this.add(criarBem);
        this.add(bPesquisa);
        this.setVisible(true);
        this.requestFocusInWindow();
    }

    /**
    * Método de ação para eventos de botão.
    *
    * @param e o evento de ação
    */
    @Override
    public void actionPerformed(ActionEvent e) {
        Object clicado = e.getSource();
        if (clicado == criarBem) {
            new CrudInventario(inv);
        }
        if (clicado == bPesquisa) {
            new Lista(inv);
        }
    }
}