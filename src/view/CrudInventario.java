package src.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CrudInventario extends JFrame implements ActionListener {

    JButton criarImovel, criarMovel, criarVeiculo;
    JPanel opMovel, opImovel, opVeiculo;

    public CrudInventario(){
        

        //Configurando Janela
        setTitle("DoomDec");
        this.setLayout(null);
        this.setSize(1360, 730);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(255, 255, 255));

        //Configurando Navbar
        JPanel navbar = new JPanel();
        navbar.setLayout(null);
        navbar.setBounds(0, 0, 1360, 100);
        navbar.setBackground(new Color(0, 0, 0));
        JLabel titulo = new JLabel("DoomDec");
        titulo.setForeground(Color.white);
        titulo.setBounds(20, 25, 325, 51);
        titulo.setFont(new Font("Regular", Font.BOLD, 48));

        //configurando botões
        criarImovel = new JButton("Criar Imovel");
        criarImovel.setBounds(480,318,400, 60);
        criarImovel.setFont(new Font("Regular", Font.BOLD, 48));
        criarImovel.setBackground(new Color (11,181,79));
        criarImovel.setForeground(new Color (255,255,255));
        criarImovel.addActionListener(this);
        criarMovel = new JButton("Criar Movel");
        criarMovel.setBounds(480,439,400, 60);
        criarMovel.setBackground(new Color (11,181,79));
        criarMovel.setFont(new Font("Regular", Font.BOLD, 48));
        criarMovel.setForeground(new Color (255,255,255));
        criarMovel.addActionListener(this);
        criarVeiculo = new JButton("Criar Veiculo");
        criarVeiculo.setBounds(480,560,400, 60);
        criarVeiculo.setBackground(new Color (11,181,79));
        criarVeiculo.setFont(new Font("Regular", Font.BOLD, 48));
        criarVeiculo.setForeground(new Color (255,255,255));
        criarVeiculo.addActionListener(this);

        

        //configurando leitura de textos: nome
        JLabel dNome = new JLabel("Nome");
        dNome.setForeground(Color.black);
        dNome.setBounds(92, 157, 85, 36);
        dNome.setFont(new Font("Regular", Font.BOLD, 30));
        JTextField nome = new JTextField();
        nome.setBounds(92, 193, 550, 41);
        nome.setFont(new Font("Regular", Font.BOLD, 29));
        nome.setBackground(new Color(217, 217, 217));

        //tipo
        JLabel dTipo = new JLabel("Tipo");
        dTipo.setForeground(Color.black);
        dTipo.setBounds(718, 157, 65, 36);
        dTipo.setFont(new Font("Regular", Font.BOLD, 30));
        JTextField tipo = new JTextField();
        tipo.setBounds(718, 193, 550, 41);
        tipo.setFont(new Font("Regular", Font.BOLD, 29));
        tipo.setBackground(new Color(217, 217, 217));

        //valor
        JLabel dValor = new JLabel("Valor");
        dValor.setForeground(Color.black);
        dValor.setBounds(92, 264, 75, 36);
        dValor.setFont(new Font("Regular", Font.BOLD, 30));
        JTextField valor = new JTextField();
        valor.setBounds(92, 300, 550, 41);
        valor.setFont(new Font("Regular", Font.BOLD, 29));
        valor.setBackground(new Color(217, 217, 217));

        //descricao
        JLabel dDescricao = new JLabel("Descrição");
        dDescricao.setForeground(Color.black);
        dDescricao.setBounds(718, 264, 150, 36);
        dDescricao.setFont(new Font("Regular", Font.BOLD, 30));
        JTextField descricao = new JTextField();
        descricao.setBounds(718, 300, 550, 41);
        descricao.setFont(new Font("Regular", Font.BOLD, 29));
        descricao.setBackground(new Color(217, 217, 217));

        //local
        JLabel dLocal = new JLabel("Local");
        dLocal.setForeground(Color.black);
        dLocal.setBounds(92, 371, 80, 36);
        dLocal.setFont(new Font("Regular", Font.BOLD, 30));
        JTextField local = new JTextField();
        local.setBounds(92, 407, 550, 41);
        local.setFont(new Font("Regular", Font.BOLD, 29));
        local.setBackground(new Color(217, 217, 217));

        //data de aquisicao
        JLabel dData = new JLabel("Data de Aquisição");
        dData.setForeground(Color.black);
        dData.setBounds(718, 371, 260, 36);
        dData.setFont(new Font("Regular", Font.BOLD, 30));
        JTextField data = new JTextField();
        data.setBounds(718, 407, 550, 41);
        data.setFont(new Font("Regular", Font.BOLD, 29));
        data.setBackground(new Color(217, 217, 217));

        //numero de comodos
        JLabel dComodos = new JLabel("Nº de Comodos");
        dComodos.setForeground(Color.black);
        dComodos.setBounds(92, 478, 230, 36);
        dComodos.setFont(new Font("Regular", Font.BOLD, 30));
        JTextField comodos = new JTextField();
        comodos.setBounds(92, 514, 550, 41);
        comodos.setFont(new Font("Regular", Font.BOLD, 29));
        comodos.setBackground(new Color(217, 217, 217));

        //Area
        JLabel dArea = new JLabel("Area");
        dArea.setForeground(Color.black);
        dArea.setBounds(718, 478, 70, 36);
        dArea.setFont(new Font("Regular", Font.BOLD, 30));
        JTextField area = new JTextField();
        area.setBounds(718, 514, 550, 41);
        area.setFont(new Font("Regular", Font.BOLD, 29));
        area.setBackground(new Color(217, 217, 217));

        //dimenções
        JLabel dDimencoes = new JLabel("Dimenções");
        dDimencoes.setForeground(Color.black);
        dDimencoes.setBounds(92, 478, 230, 36);
        dDimencoes.setFont(new Font("Regular", Font.BOLD, 30));
        JTextField dimencoes = new JTextField();
        dimencoes.setBounds(92, 514, 550, 41);
        dimencoes.setFont(new Font("Regular", Font.BOLD, 29));
        dimencoes.setBackground(new Color(217, 217, 217));

        //identificação
        JLabel dIdentificacao = new JLabel("Identificação");
        dIdentificacao.setForeground(Color.black);
        dIdentificacao.setBounds(92, 478, 230, 36);
        dIdentificacao.setFont(new Font("Regular", Font.BOLD, 30));
        JTextField identificacao = new JTextField();
        identificacao.setBounds(92, 514, 550, 41);
        identificacao.setFont(new Font("Regular", Font.BOLD, 29));
        identificacao.setBackground(new Color(217, 217, 217));

        //porte
        JLabel dPorte = new JLabel("porte");
        dPorte.setForeground(Color.black);
        dPorte.setBounds(718, 478, 70, 36);
        dPorte.setFont(new Font("Regular", Font.BOLD, 30));
        JTextField porte = new JTextField();
        porte.setBounds(718, 514, 550, 41);
        porte.setFont(new Font("Regular", Font.BOLD, 29));
        porte.setBackground(new Color(217, 217, 217));

        opImovel.setLayout(null);
        opImovel.setBounds(0, 530, 1360, 200);
        opImovel.setBackground(new Color(255, 255, 255));
        opMovel.setLayout(null);
        opMovel.setBounds(0, 530, 1360, 200);
        opMovel.setBackground(new Color(255, 255, 255));
        opVeiculo.setLayout(null);
        opVeiculo.setBounds(0, 530, 1360, 200);
        opVeiculo.setBackground(new Color(255, 255, 255));

        //Adicionando
        this.add(criarImovel);
        this.add(criarMovel);
        this.add(criarVeiculo);
        this.add(nome);
        this.add(dNome);
        this.add(tipo);
        this.add(dTipo);
        this.add(valor);
        this.add(dValor);
        this.add(descricao);
        this.add(dDescricao);
        this.add(local);
        this.add(dLocal);
        this.add(data);
        this.add(dData);
        opMovel.add(dimencoes);
        opMovel.add(dDimencoes);
        opImovel.add(comodos);
        opImovel.add(dComodos);
        opImovel.add(area);
        opImovel.add(dArea);
        opVeiculo.add(identificacao);
        opVeiculo.add(dIdentificacao);
        opVeiculo.add(porte);
        opVeiculo.add(dPorte);
        this.add(opImovel);
        this.add(titulo);
        this.add(navbar);
        this.setVisible(true);
        this.requestFocusInWindow();
    }
    public static void main(String[] args) {
        new CrudInventario();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object clicado = e.getSource();
        if (clicado == criarImovel) {
            opImovel.setVisible(true);
            opMovel.setVisible(false);
            opVeiculo.setVisible(false);
        }
        if (clicado == criarMovel) {
            opImovel.setVisible(false);
            opMovel.setVisible(true);
            opVeiculo.setVisible(false);
        }
        if (clicado == criarVeiculo) {
            opImovel.setVisible(false);
            opMovel.setVisible(false);
            opVeiculo.setVisible(true);
        }
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}