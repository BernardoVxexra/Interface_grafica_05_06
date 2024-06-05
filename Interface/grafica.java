import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class grafica extends JFrame{
    //Declarando as variáveis
        JLabel nome,idade,aluno,rotulo1,rotulo2,rotulo3,rotulo4;
        JComboBox EstadCivil;
        JTextField nom,ida;
        String civil[] = {"Solteiro(a)","Casado(a)","Divorciado(a)","Viuvo(a)"};
        JButton limpar,enviar,sair;
        JCheckBox auto,barco,avioes;
        JRadioButton masc,femi;
        ButtonGroup sexos;


    //Iniciando Estrutura
        public grafica(){
        super("Formulário ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 450);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);
        Container tela = getContentPane();
        
        //Itens da tela
        rotulo4 = new JLabel("");
        nome = new JLabel("Nome :"); 
        nom = new JTextField("");
        idade = new JLabel("Idade :");
        ida = new JTextField("");
        EstadCivil = new JComboBox(civil);
        limpar = new JButton("Limpar os dados");
        limpar.setToolTipText("Limpar todos os dados aqui");
        enviar = new JButton("Enviar os dados");
        enviar.setToolTipText("Enviar os dados aqui");
        rotulo2 = new JLabel("Interesses :");
        auto = new JCheckBox("Automóveis");
        barco = new JCheckBox("Barco");
        avioes = new JCheckBox("Aviões");
        rotulo1 = new JLabel("Estado Civil :");
        rotulo3 = new JLabel("Sexo :");
        masc = new JRadioButton("Masculino");
        femi = new JRadioButton("Feminino");
        sair = new JButton("Sair");
        sair.setToolTipText("Sair aqui");
        aluno = new JLabel("Desenvolvido por: Bernardo Vieira/2DS-AMS");
        

        EstadCivil = new JComboBox(civil);
        EstadCivil.setMaximumRowCount(4);
        EstadCivil.setSelectedIndex(-1);
        
        //ButtonGroup para apenas um tipo de sexo escolhido
        sexos = new ButtonGroup();
        sexos.add(masc);
        sexos.add(femi);

        //Estruturando as medidas corretas
        nome.setBounds(20, 20, 300, 20);
        nom.setBounds(70,25,130,18);
        rotulo3.setBounds(40,20,40,40);
        idade.setBounds(20, 40, 100, 25);
        ida.setBounds(70,45,130,18);
        rotulo3.setBounds(30,60,50,45);
        masc.setBounds(70, 70, 85, 30);
        femi.setBounds(160, 70, 80, 30);
        rotulo2.setBounds(50,105,100,20);
        auto.setBounds(75, 130, 100, 20);
        barco.setBounds(75, 150, 100, 20);
        avioes.setBounds(75, 170, 100, 20);
        rotulo1.setBounds(60,220,100,20);
        EstadCivil.setBounds(140, 220, 100, 20);
        limpar.setBounds(105, 250, 130, 20);
        enviar.setBounds(240, 250, 130, 20);
        sair.setBounds(200,280,90,20);
        aluno.setBounds(100, 270, 450, 100);
       

        limpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                nom.setText("");
                ida.setText("");
                sexos.clearSelection();
                avioes.setSelected(false);
                barco.setSelected(false);
                auto.setSelected(false);
                EstadCivil.setSelectedIndex(-1);
                
            }
        });

        enviar.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null,"Informações preenchidas", "Mensagem",
            JOptionPane.INFORMATION_MESSAGE);
            JOptionPane.showMessageDialog(null,"Você Cadastrou os seguintes dados: \n"
            + "Nome: " +nom.getText() +"\n"
            + "Idade: " +ida.getText() +"\n"
            +"Estado Civil: " +EstadCivil.getSelectedItem().toString()
            ,"Resultado",JOptionPane.INFORMATION_MESSAGE);
            
          }
        });

       sair.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            int opcao;
            opcao = JOptionPane.showConfirmDialog(null,
            "Deseja Fechar esta janela? ","Fechar", JOptionPane.YES_NO_OPTION);
            if(opcao==JOptionPane.YES_OPTION)
            System.exit(0);
        }
       });




        //Atalho limpar
        limpar.setMnemonic(KeyEvent.VK_L);

      

        //Adicionando as telas
        tela.add(nome);
        tela.add(idade);
        tela.add(EstadCivil);
        tela.add(limpar);
        tela.add(enviar);
        tela.add(auto);
        tela.add(barco);
        tela.add(avioes);
        tela.add(masc);
        tela.add(femi);
        tela.add(aluno);
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(nom);
        tela.add(ida);
        tela.add(sair);
      
        setVisible(true);


    }
    public static void main (String [] args){
        grafica app = new grafica();    
            app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      } 
}//Fim do programa