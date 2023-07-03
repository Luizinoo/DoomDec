package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.DefaultListModel;

import model.Inventario;

/**
 * Uma classe que representa a janela de lista de itens do inventário.
 */
public class Lista extends JFrame implements ActionListener, ListSelectionListener {

    JButton criarBem, bPesquisa, deletarImovel, deletarMovel, deletarVeiculo, editarImovel, editarMovel, editarVeiculo;
    Inventario inv;
    String imovelSelecionado, movelSelecionado, veiculoSelecionado;
    JTextField pesquisa;
    JList<String> imoveisList = new JList<>();
    JList<String> moveisList = new JList<>();
    JList<String> veiculosList = new JList<>();

    /**
     * Construtor para a classe Lista.
     *
     * @param inv o inventário associado à lista
     */
    public Lista(Inventario inventario) {
        this.inv = inventario;
        DefaultListModel<String> imoveisListModel = new DefaultListModel<>();
        DefaultListModel<String> moveisListModel = new DefaultListModel<>();
        DefaultListModel<String> veiculosListModel = new DefaultListModel<>();

        for (String imovel : inv.getImoveis()) {
            imoveisListModel.addElement(imovel);
        }

        for (String movel : inv.getMoveis()) {
            moveisListModel.addElement(movel);
        }

        for (String veiculo : inv.getVeiculos()) {
            veiculosListModel.addElement(veiculo);
        }

        imoveisList = new JList<>(imoveisListModel);
        moveisList = new JList<>(moveisListModel);
        veiculosList = new JList<>(veiculosListModel);
        imoveisList.addListSelectionListener(this);
        moveisList.addListSelectionListener(this);
        veiculosList.addListSelectionListener(this);

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

        // configurando botões
        bPesquisa = new JButton("Pesquisar");
        bPesquisa.setBounds(920, 121, 400, 55);
        bPesquisa.setFont(new Font("Regular", Font.BOLD, 38));
        bPesquisa.setBackground(new Color(11, 181, 79));
        bPesquisa.setForeground(new Color(255, 255, 255));
        bPesquisa.addActionListener(this);
        criarBem = new JButton("Criar Bem");
        criarBem.setBounds(920, 23, 400, 55);
        criarBem.setFont(new Font("Regular", Font.BOLD, 38));
        criarBem.setBackground(new Color(11, 181, 79));
        criarBem.setForeground(new Color(255, 255, 255));
        criarBem.addActionListener(this);
        deletarImovel = new JButton("Deletar");
        deletarImovel.setBounds(340, 186, 100, 48);
        deletarImovel.setFont(new Font("Regular", Font.BOLD, 10));
        deletarImovel.setBackground(new Color(11, 181, 79));
        deletarImovel.setForeground(new Color(255, 255, 255));
        deletarImovel.addActionListener(this);
        deletarMovel = new JButton("Deletar");
        deletarMovel.setBounds(780, 186, 100, 48);
        deletarMovel.setFont(new Font("Regular", Font.BOLD, 10));
        deletarMovel.setBackground(new Color(11, 181, 79));
        deletarMovel.setForeground(new Color(255, 255, 255));
        deletarMovel.addActionListener(this);
        deletarVeiculo = new JButton("Deletar");
        deletarVeiculo.setBounds(1220, 186, 100, 48);
        deletarVeiculo.setFont(new Font("Regular", Font.BOLD, 10));
        deletarVeiculo.setBackground(new Color(11, 181, 79));
        deletarVeiculo.setForeground(new Color(255, 255, 255));
        deletarVeiculo.addActionListener(this);
        editarImovel = new JButton("editar");
        editarImovel.setBounds(219, 186, 100, 48);
        editarImovel.setFont(new Font("Regular", Font.BOLD, 10));
        editarImovel.setBackground(new Color(11, 181, 79));
        editarImovel.setForeground(new Color(255, 255, 255));
        editarImovel.addActionListener(this);
        editarMovel = new JButton("editar");
        editarMovel.setBounds(659, 186, 100, 48);
        editarMovel.setFont(new Font("Regular", Font.BOLD, 10));
        editarMovel.setBackground(new Color(11, 181, 79));
        editarMovel.setForeground(new Color(255, 255, 255));
        editarMovel.addActionListener(this);
        editarVeiculo = new JButton("editar");
        editarVeiculo.setBounds(1099, 186, 100, 48);
        editarVeiculo.setFont(new Font("Regular", Font.BOLD, 10));
        editarVeiculo.setBackground(new Color(11, 181, 79));
        editarVeiculo.setForeground(new Color(255, 255, 255));
        editarVeiculo.addActionListener(this);

        // configurando pesquisa
        pesquisa = new JTextField();
        pesquisa.setBounds(48, 121, 800, 55);
        pesquisa.setFont(new Font("Regular", Font.BOLD, 30));
        pesquisa.setBackground(new Color(217, 217, 217));

        // configurando barras de detalhes: Imoveis
        JLabel tImoveis = new JLabel("Imoveis");
        tImoveis.setForeground(Color.black);
        tImoveis.setBounds(40, 186, 150, 48);
        tImoveis.setFont(new Font("Regular", Font.BOLD, 40));
        JPanel fImoveis = new JPanel();
        fImoveis.setLayout(new BoxLayout(fImoveis, BoxLayout.Y_AXIS));
        fImoveis.setBackground(new Color(217, 217, 217));
        JScrollPane sImoveis = new JScrollPane(imoveisList);
        sImoveis.setBounds(40, 234, 400, 450);
        sImoveis.setBackground(new Color(217, 217, 217));

        // configurando barras de detalhes: Moveis
        JLabel tMoveis = new JLabel("Moveis");
        tMoveis.setForeground(Color.black);
        tMoveis.setBounds(480, 186, 140, 48);
        tMoveis.setFont(new Font("Regular", Font.BOLD, 40));
        JPanel fMoveis = new JPanel();
        fMoveis.setLayout(new BoxLayout(fMoveis, BoxLayout.Y_AXIS));
        fMoveis.setBackground(new Color(217, 217, 217));
        JScrollPane sMoveis = new JScrollPane(moveisList);
        sMoveis.setBounds(480, 234, 400, 450);
        sMoveis.setBackground(new Color(217, 217, 217));

        // configurando barras de detalhes: Veiculos
        JLabel tVeiculos = new JLabel("Veiculos");
        tVeiculos.setForeground(Color.black);
        tVeiculos.setBounds(920, 186, 170, 48);
        tVeiculos.setFont(new Font("Regular", Font.BOLD, 40));
        JPanel fVeiculos = new JPanel();
        fVeiculos.setLayout(new BoxLayout(fVeiculos, BoxLayout.Y_AXIS));
        fVeiculos.setBackground(new Color(217, 217, 217));
        JScrollPane sVeiculos = new JScrollPane(veiculosList);
        sVeiculos.setBounds(920, 234, 400, 450);
        sVeiculos.setBackground(new Color(217, 217, 217));

        // adicionando
        fImoveis.add(sImoveis);
        fMoveis.add(sMoveis);
        fVeiculos.add(sVeiculos);
        this.add(editarImovel);
        this.add(editarMovel);
        this.add(editarVeiculo);
        this.add(deletarImovel);
        this.add(deletarMovel);
        this.add(deletarVeiculo);
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
        if (clicado == deletarImovel) {
            inv.excluirItem(imovelSelecionado);
            DefaultListModel<String> imoveisListModel = (DefaultListModel<String>) imoveisList.getModel();
            imoveisListModel.removeElement(imovelSelecionado);
            imovelSelecionado = null;
        }
        if (clicado == deletarMovel) {
            inv.excluirItem(movelSelecionado);
            DefaultListModel<String> moveisListModel = (DefaultListModel<String>) moveisList.getModel();
            moveisListModel.removeElement(movelSelecionado);
            movelSelecionado = null;
        }
        if (clicado == deletarVeiculo) {
            inv.excluirItem(veiculoSelecionado);
            DefaultListModel<String> veiculosListModel = (DefaultListModel<String>) veiculosList.getModel();
            veiculosListModel.removeElement(veiculoSelecionado);
            veiculoSelecionado = null;
        }
        if (clicado == editarVeiculo) {
            new CrudInventario(inv, veiculoSelecionado);
        }
        if (clicado == editarMovel) {
            new CrudInventario(inv, movelSelecionado);
        }
        if (clicado == editarImovel) {
            new CrudInventario(inv, imovelSelecionado);
        }
        if (clicado == bPesquisa) {
            String textoPesquisa = pesquisa.getText();
            System.out.println(textoPesquisa);
            new CrudInventario(inv, textoPesquisa);
        }

        repaint();
        revalidate();
    }

    /**
     * Método de seleção de lista.
     * 
     * @param e o evento de seleção de lista
     */
    @Override
    public void valueChanged(ListSelectionEvent e) {
        Object clicado = e.getSource();
        if (clicado == imoveisList) {
            imovelSelecionado = imoveisList.getSelectedValue();

        }
        if (clicado == moveisList) {
            movelSelecionado = moveisList.getSelectedValue();

        }
        if (clicado == veiculosList) {
            veiculoSelecionado = veiculosList.getSelectedValue();

        }
    }
}