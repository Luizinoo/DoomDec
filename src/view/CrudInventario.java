package src.view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JTextField;

import src.model.Imovel;
import src.model.Inventario;
import src.model.Movel;
import src.model.Veiculo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
* A classe CrudInventario é responsável por exibir uma interface gráfica para gerenciar um inventário de itens.
* Permite a criação de itens do tipo Imovel, Movel e Veiculo, além de salvá-los no inventário.
*/
public class CrudInventario extends JFrame implements ActionListener {

    JButton criarImovel, criarMovel, criarVeiculo, botaoSalvar;
    JPanel opMovel, opImovel, opVeiculo;
    JTextField nome, tipo, descricao, valor, local, data, comodos, area, dimencoes, identificacao, porte;
    Imovel moradia;
    Movel mobilia;
    Veiculo transporte;
    Inventario inv;

    /**
    * Construtor da classe CrudInventario.
    * Inicializa a interface gráfica e configura os componentes necessários.
    *
    * @param inv O inventário a ser gerenciado.
    */
    public CrudInventario(Inventario inv){
        
        this.inv = inv;

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
        criarImovel.setBounds(445,37,160, 32);
        criarImovel.setFont(new Font("Regular", Font.BOLD, 16));
        criarImovel.setBackground(new Color (11,181,79));
        criarImovel.setForeground(new Color (255,255,255));
        criarImovel.addActionListener(this);
        criarMovel = new JButton("Criar Movel");
        criarMovel.setBounds(624,37,160, 32);
        criarMovel.setBackground(new Color (11,181,79));
        criarMovel.setFont(new Font("Regular", Font.BOLD, 16));
        criarMovel.setForeground(new Color (255,255,255));
        criarMovel.addActionListener(this);
        criarVeiculo = new JButton("Criar Veiculo");
        criarVeiculo.setBounds(803,37,160, 32);
        criarVeiculo.setBackground(new Color (11,181,79));
        criarVeiculo.setFont(new Font("Regular", Font.BOLD, 16));
        criarVeiculo.setForeground(new Color (255,255,255));
        criarVeiculo.addActionListener(this);
        botaoSalvar = new JButton("Salvar");
        botaoSalvar.setBounds(480,621,400, 60);
        botaoSalvar.setBackground(new Color (11,181,79));
        botaoSalvar.setFont(new Font("Regular", Font.BOLD, 48));
        botaoSalvar.setForeground(new Color (255,255,255));
        botaoSalvar.addActionListener(this);

        

        //configurando leitura de textos: nome
        JLabel dNome = new JLabel("Nome");
        dNome.setForeground(Color.black);
        dNome.setBounds(92, 157, 85, 36);
        dNome.setFont(new Font("Regular", Font.BOLD, 30));
        nome = new JTextField();
        nome.setBounds(92, 193, 550, 41);
        nome.setFont(new Font("Regular", Font.BOLD, 29));
        nome.setBackground(new Color(217, 217, 217));

        //tipo
        JLabel dTipo = new JLabel("Tipo");
        dTipo.setForeground(Color.black);
        dTipo.setBounds(718, 157, 65, 36);
        dTipo.setFont(new Font("Regular", Font.BOLD, 30));
        tipo = new JTextField();
        tipo.setBounds(718, 193, 550, 41);
        tipo.setFont(new Font("Regular", Font.BOLD, 29));
        tipo.setBackground(new Color(217, 217, 217));

        //valor
        JLabel dValor = new JLabel("Valor");
        dValor.setForeground(Color.black);
        dValor.setBounds(92, 264, 75, 36);
        dValor.setFont(new Font("Regular", Font.BOLD, 30));
        valor = new JTextField();
        valor.setBounds(92, 300, 550, 41);
        valor.setFont(new Font("Regular", Font.BOLD, 29));
        valor.setBackground(new Color(217, 217, 217));

        //descricao
        JLabel dDescricao = new JLabel("Descrição");
        dDescricao.setForeground(Color.black);
        dDescricao.setBounds(718, 264, 150, 36);
        dDescricao.setFont(new Font("Regular", Font.BOLD, 30));
        descricao = new JTextField();
        descricao.setBounds(718, 300, 550, 41);
        descricao.setFont(new Font("Regular", Font.BOLD, 29));
        descricao.setBackground(new Color(217, 217, 217));

        //local
        JLabel dLocal = new JLabel("Local");
        dLocal.setForeground(Color.black);
        dLocal.setBounds(92, 371, 80, 36);
        dLocal.setFont(new Font("Regular", Font.BOLD, 30));
        local = new JTextField();
        local.setBounds(92, 407, 550, 41);
        local.setFont(new Font("Regular", Font.BOLD, 29));
        local.setBackground(new Color(217, 217, 217));

        //data de aquisicao
        JLabel dData = new JLabel("Data de Aquisição");
        dData.setForeground(Color.black);
        dData.setBounds(718, 371, 260, 36);
        dData.setFont(new Font("Regular", Font.BOLD, 30));
        data = new JTextField();
        data.setBounds(718, 407, 550, 41);
        data.setFont(new Font("Regular", Font.BOLD, 29));
        data.setBackground(new Color(217, 217, 217));

        //numero de comodos
        JLabel dComodos = new JLabel("Nº de Comodos");
        dComodos.setForeground(Color.black);
        dComodos.setBounds(92, 8, 230, 36);
        dComodos.setFont(new Font("Regular", Font.BOLD, 30));
        comodos = new JTextField();
        comodos.setBounds(92, 44, 550, 41);
        comodos.setFont(new Font("Regular", Font.BOLD, 29));
        comodos.setBackground(new Color(217, 217, 217));

        //Area
        JLabel dArea = new JLabel("Area");
        dArea.setForeground(Color.black);
        dArea.setBounds(718, 8, 70, 36);
        dArea.setFont(new Font("Regular", Font.BOLD, 30));
        area = new JTextField();
        area.setBounds(718, 44, 550, 41);
        area.setFont(new Font("Regular", Font.BOLD, 29));
        area.setBackground(new Color(217, 217, 217));

        //dimenções
        JLabel dDimencoes = new JLabel("Dimenções");
        dDimencoes.setForeground(Color.black);
        dDimencoes.setBounds(92, 8, 230, 36);
        dDimencoes.setFont(new Font("Regular", Font.BOLD, 30));
        dimencoes = new JTextField();
        dimencoes.setBounds(92, 44, 550, 41);
        dimencoes.setFont(new Font("Regular", Font.BOLD, 29));
        dimencoes.setBackground(new Color(217, 217, 217));

        //identificação
        JLabel dIdentificacao = new JLabel("Identificação");
        dIdentificacao.setForeground(Color.black);
        dIdentificacao.setBounds(92, 8, 230, 36);
        dIdentificacao.setFont(new Font("Regular", Font.BOLD, 30));
        identificacao = new JTextField();
        identificacao.setBounds(92, 44, 550, 41);
        identificacao.setFont(new Font("Regular", Font.BOLD, 29));
        identificacao.setBackground(new Color(217, 217, 217));

        //porte
        JLabel dPorte = new JLabel("Porte");
        dPorte.setForeground(Color.black);
        dPorte.setBounds(718, 8, 80, 36);
        dPorte.setFont(new Font("Regular", Font.BOLD, 30));
        porte = new JTextField();
        porte.setBounds(718, 44, 550, 41);
        porte.setFont(new Font("Regular", Font.BOLD, 29));
        porte.setBackground(new Color(217, 217, 217));

        opImovel = new JPanel();
        opImovel.setLayout(null);
        opImovel.setBounds(0, 470, 1360, 150);
        opImovel.setBackground(new Color(255, 255, 255));
        opMovel = new JPanel();
        opMovel.setLayout(null);
        opMovel.setBounds(0, 470, 1360, 150);
        opMovel.setBackground(new Color(255, 255, 255));
        opVeiculo = new JPanel();
        opVeiculo.setLayout(null);
        opVeiculo.setBounds(0, 470, 1360, 150);
        opVeiculo.setBackground(new Color(255, 255, 255));

        //Adicionando
        this.add(criarImovel);
        this.add(criarMovel);
        this.add(criarVeiculo);
        this.add(botaoSalvar);
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
        this.add(opMovel);
        this.add(opVeiculo);
        this.add(titulo);
        this.add(navbar);
        opMovel.setVisible(true);
        this.setVisible(true);
        this.requestFocusInWindow();
    }
    
    public Movel getMobilia() {
        return mobilia;
    }
    public Imovel getMoradia() {
        return moradia;
    }
    public Veiculo getTrasporte() {
        return transporte;
    }

    /**
     * Método de ação para lidar com eventos.
     * Manipula os eventos gerados pelos botões e executa as ações correspondentes.
     *
     * @param e O evento acionado.
     */
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
        if (clicado == botaoSalvar){
            if (opMovel.isVisible()) {
                mobilia = new Movel(nome.getText(), tipo.getText(), Integer.parseInt(valor.getText()) ,descricao.getText(), local.getText(), data.getText(), dimencoes.getText());
                inv.addItem(mobilia);
                inv.toString();
            }
            if (opImovel.isVisible()) {
                moradia = new Imovel(nome.getText(), tipo.getText(), Integer.parseInt(valor.getText()), descricao.getText(), local.getText(), data.getText(), Integer.parseInt(comodos.getText()), Integer.parseInt(area.getText()));
                inv.addItem(moradia);
                inv.toString();
            }
            if (opVeiculo.isVisible()) {
                transporte = new Veiculo(nome.getText(), tipo.getText(),  Integer.parseInt(valor.getText()), descricao.getText(), local.getText(), data.getText(), identificacao.getText(), (char) Integer.parseInt(porte.getText()));
                inv.addItem(transporte);
                System.out.println(inv.toString());
            }
            inv.toString();
        }
    }
}