import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

    public class Janela extends JFrame implements ActionListener {
        GridLayout layout = new GridLayout(3,2);
        JButton novoJogo = new JButton("Novo Jogo");
        JButton btnJogar = new JButton("Jogar");
        JTextField textfield = new JTextField(6);


        Random rand = new Random();
        int dado1 = rand.nextInt(6) + 1;
        int dado2 = rand.nextInt(6) + 1;
        int chances = 3;

    public Janela(){
        System.out.println("Inicio de jogo!");
        setLayout(layout);
        add(textfield);
        add(btnJogar);
        add(novoJogo);
        setSize(300,200);
        setVisible(true);
        btnJogar.setEnabled(false);

        novoJogo.addActionListener(this);
        btnJogar.addActionListener(this);
    }

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==btnJogar){
                if(textfield.getText().equals(String.valueOf(dado1))||textfield.getText().equals(String.valueOf(dado2))){
                    JOptionPane.showMessageDialog(null,"Parabéns, você acertou!");
                    btnJogar.setEnabled(false);
                }else{
                    chances--;
                    JOptionPane.showMessageDialog(null,"Voce errou!Tentativas restantes = "+ chances);
                    if (chances==0){
                        JOptionPane.showMessageDialog(null,"Fim de jogo.Dados = "+dado1 +" e "+ dado2);
                        btnJogar.setEnabled(false);
                    }
                }
            }
            if(e.getSource()==novoJogo){
                JOptionPane.showMessageDialog(null,"Inicio de jogo!");
                chances = 3;
                dado1 = rand.nextInt(6)+1;
                dado2 = rand.nextInt(6)+1;
                btnJogar.setEnabled(true);
            }
        }


    }


