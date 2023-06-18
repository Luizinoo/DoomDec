package src.view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CriacaoInventario extends JFrame {

    public CriacaoInventario() {

        //Configurando Janela
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

        //texto inicial
        JLabel texto = new JLabel("Gerencie seu Inventario",JLabel.CENTER);
        texto.setForeground(Color.black);
        texto.setBounds(132, 154, 1095, 157);
        texto.setFont(new Font("Regular", Font.BOLD, 70));

        //configurando botões
        JButton criarImovel = new JButton("Criar Imovel");
        criarImovel.setBounds(480,318,400, 60);
        criarImovel.setFont(new Font("Regular", Font.BOLD, 48));
        criarImovel.setBackground(new Color (11,181,79));
        criarImovel.setForeground(new Color (255,255,255));
        JButton criarMovel = new JButton("Criar Movel");
        criarMovel.setBounds(480,439,400, 60);
        criarMovel.setBackground(new Color (11,181,79));
        criarMovel.setFont(new Font("Regular", Font.BOLD, 48));
        criarMovel.setForeground(new Color (255,255,255));
        JButton criarVeiculo = new JButton("Criar Veiculo");
        criarVeiculo.setBounds(480,560,400, 60);
        criarVeiculo.setBackground(new Color (11,181,79));
        criarVeiculo.setFont(new Font("Regular", Font.BOLD, 48));
        criarVeiculo.setForeground(new Color (255,255,255));

        this.add(titulo);
        this.add(navbar);
        this.add(texto);
        this.add(criarImovel);
        this.add(criarMovel);
        this.add(criarVeiculo);
        this.setVisible(true);
        this.requestFocusInWindow();
    }

    public static void main(String[] args) {
        new CriacaoInventario();
    }
}
