package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import model.Inventario;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
* Uma classe que representa a janela de aplicativo principal.
*/
public class App extends JFrame implements ActionListener {

    JButton criarBem, verInventario;
    Inventario inv;

    /**
    * Construtor para a classe App.
    *
    * @param inv o inventário associado ao aplicativo
    */
    public App(Inventario inventario) {
        this.inv = inventario;

        // configurando janela
        setTitle("DoomDec");
        this.setLayout(null);
        this.setSize(1360, 730);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(255, 255, 255));

        // configurando navbar
        JPanel navbar = new JPanel();
        navbar.setLayout(null);
        navbar.setBounds(0, 0, 1360, 100);
        navbar.setBackground(new Color(0, 0, 0));
        JLabel titulo = new JLabel("DoomDec");
        titulo.setForeground(Color.white);
        titulo.setBounds(20, 25, 325, 51);
        titulo.setFont(new Font("Regular", Font.BOLD, 48));

        // texto inicial
        JLabel texto = new JLabel("Gerencie seu Inventario", JLabel.CENTER);
        texto.setForeground(Color.black);
        texto.setBounds(132, 154, 1095, 157);
        texto.setFont(new Font("Regular", Font.BOLD, 70));

        // configurando botões
        criarBem = new JButton("Criar Bem");
        criarBem.setBounds(480, 365, 400, 60);
        criarBem.setFont(new Font("Regular", Font.BOLD, 48));
        criarBem.setBackground(new Color(11, 181, 79));
        criarBem.setForeground(new Color(255, 255, 255));
        criarBem.addActionListener(this);
        verInventario = new JButton("Ver Inventario");
        verInventario.setBounds(480, 500, 400, 60);
        verInventario.setBackground(new Color(11, 181, 79));
        verInventario.setFont(new Font("Regular", Font.BOLD, 48));
        verInventario.setForeground(new Color(255, 255, 255));
        verInventario.addActionListener(this);

        // adicionando
        this.add(titulo);
        this.add(navbar);
        this.add(texto);
        this.add(criarBem);
        this.add(verInventario);
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
        if (clicado == verInventario) {
            new Lista(inv);
        }
    }

    /**
    * Método principal para executar o programa.
    *
    * @param args os argumentos de linha de comando
    */
    public static void main(String[] args) {
        Inventario inv = new Inventario(
                "Epic Gomes",
                false,
                null);
        inv.dadosPrecarregados();
        new App(inv);
    }
}