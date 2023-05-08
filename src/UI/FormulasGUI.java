package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

public class FormulasGUI {
    JFrame frame = new JFrame("Physics");
    JButton forceBtn = new JButton("Calculate Force");
    JFrame forceFrame = new JFrame("Force");
    JTextField enterForce = new JTextField("Enter Mass");
    JTextField enterForce1 = new JTextField("Enter acceleration");
    public void mainUi(){
        frame.add(forceBtn);
        frame.setSize(200,200);
        frame.setLayout(new GridLayout(5,1));
        frame.setVisible(true);

    }
    Formulas formulas = new Formulas();
    public void forceBtn_(){
        forceBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            calcForce();

            }
        });
    }
    public void calcForce(){
        forceFrame.add(enterForce);
        forceFrame.add(enterForce1);
        forceFrame.add(forceBtn);
        forceFrame.setSize(200,200);
        forceFrame.setLayout(new GridLayout(3,1));
        forceFrame.setVisible(true);
        try {
            float force = formulas.Force(Float.parseFloat(enterForce.getText()),Float.parseFloat(enterForce1.getText()));
            JOptionPane.showMessageDialog(null, force);
        }catch (Exception e){
            System.out.println("Calculate Force");


    }

}}

