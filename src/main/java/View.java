package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View extends JFrame {

    private JLabel polinom1Label;
    private JLabel titluLabel ;
    private JTextField polinom1Field;
    private JTextField polinom2Field;
    private JTextField rezultatArea;
    private JLabel polinomLabel;
    private JButton adunareButton;
    private JButton scadereButton;
    private JButton inmultireButton;
    private JButton impartireButton;
    private JButton derivareButton;
    private JButton integrareButton;
    private JButton deleteAllButton;
    private  JLabel rezultatLabel;

    public View(){
        this.setBounds(100, 100, 766, 492);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);

        polinom1Label = new JLabel("Polinom 1");
        polinom1Label.setHorizontalAlignment(SwingConstants.CENTER);
        polinom1Label.setFont(new Font("Tahoma", Font.PLAIN, 16));
        polinom1Label.setBounds(47, 132, 106, 35);
        this.getContentPane().add(polinom1Label);

        polinom1Field = new JTextField();
        polinom1Field.setBounds(156, 134, 348, 35);
        this.getContentPane().add(polinom1Field);
        polinom1Field.setColumns(10);

        polinomLabel = new JLabel("Polinom 2");
        polinomLabel.setHorizontalAlignment(SwingConstants.CENTER);
        polinomLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        polinomLabel.setBounds(47, 207, 106, 35);
        this.getContentPane().add(polinomLabel);

        polinom2Field = new JTextField();
        polinom2Field.setColumns(10);
        polinom2Field.setBounds(156, 209, 348, 35);
        this.getContentPane().add(polinom2Field);

        titluLabel = new JLabel("CALCULATOR DE POLINOAME");
        titluLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titluLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        titluLabel.setBounds(205, 37, 330, 46);
        this.getContentPane().add(titluLabel);

        rezultatLabel = new JLabel("Rezultat");
        rezultatLabel.setHorizontalAlignment(SwingConstants.CENTER);
        rezultatLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rezultatLabel.setBounds(47, 281, 106, 35);
        this.getContentPane().add(rezultatLabel);

        rezultatArea = new JTextField();
        rezultatArea.setColumns(10);
        rezultatArea.setBounds(156, 283, 348, 35);
        this.getContentPane().add(rezultatArea);

        adunareButton = new JButton("+");
        adunareButton.setBounds(523, 134, 85, 35);
        this.getContentPane().add(adunareButton);

        scadereButton = new JButton("-");
        scadereButton.setBounds(639, 134, 85, 35);
        this.getContentPane().add(scadereButton);

        inmultireButton = new JButton("*");
        inmultireButton.setBounds(523, 209, 85, 35);
        this.getContentPane().add(inmultireButton);

        derivareButton = new JButton("( )'");
        derivareButton.setBounds(523, 283, 85, 35);
        this.getContentPane().add(derivareButton);

        integrareButton = new JButton("S( )dx");
        integrareButton.setBounds(639, 283, 85, 35);
        this.getContentPane().add(integrareButton);

        impartireButton = new JButton("/");
        impartireButton.setBounds(639, 209, 85, 35);
        this.getContentPane().add(impartireButton);

        deleteAllButton = new JButton("Delete all");
        deleteAllButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
        deleteAllButton.setBounds(261, 359, 137, 46);
       // deleteAllButton.setBounds(311, 373, 137, 46);
        this.getContentPane().add(deleteAllButton);

        this.setVisible(true);
    }

    public void addAdunareListener(ActionListener action) {
        this.adunareButton.addActionListener(action);
    }
    public void addScadereListener(ActionListener action) {
        this.scadereButton.addActionListener(action);
    }
    public void addInmultireListener(ActionListener action) {
        this.inmultireButton.addActionListener(action);
    }
    public void addImpartireListener(ActionListener action) {
        this.impartireButton.addActionListener(action);
    }
    public void addDerivareListener(ActionListener action) {
        this.derivareButton.addActionListener(action);
    }
    public void addIntegrareListener(ActionListener action) {
        this.integrareButton.addActionListener(action);
    }
    public void addDeleteAllListener(ActionListener action) {
        this.deleteAllButton.addActionListener(action);
    }

    public String getPolinom1Field() {
        return polinom1Field.getText();
    }

    public void setPolinom1Field(String polinom1Field) {
        this.polinom1Field.setText(polinom1Field);
    }

    public String getPolinom2Field() {
        return polinom2Field.getText();
    }

    public void setPolinom2Field(String polinom2Field) {
        this.polinom2Field.setText((polinom2Field));
    }
    public void setRezultatArea(String rezultatArea) {
        this.rezultatArea.setText(String.valueOf((rezultatArea)));
    }
}

