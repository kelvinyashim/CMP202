package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

public class  FormulasGUI {
    JFrame frame = new JFrame("Physics");
    JButton forceBtn = new JButton("Calculate Force");

    JFrame forceFrame = new JFrame("Force");
    JTextField enterForce = new JTextField("Enter Mass");
    JTextField enterForce1 = new JTextField("Enter acceleration");
    JButton PEnergyBtn = new JButton("Calculate PEnergy");
    JFrame PEnergyFrame = new  JFrame("PEnergy");

    JTextField enterPEnergy = new JTextField ("Enter mass");
    Font font = new Font("Arial", Font.BOLD, 16); // Create a Font object with font family, style, and size


    JTextField enterPEnergy1 = new JTextField("enter height");


    JButton WorkDoneBtn = new JButton("Calculate WorkDone");

    JFrame WorkDoneFrame = new JFrame("WorkDone");

    JTextField enterWorkDone = new JTextField("Enter force");

    Font font1 = new Font("Arial", Font.BOLD,16);


    JTextField enterWorkDone1 = new JTextField("Enter height");

    JButton KineticEnergyBtn = new JButton("Calculate KineticEnergy");


    JFrame KineticEnergyFrame = new JFrame("KineticEnergy");



    JTextField enterKineticEnergy =new JTextField("Enter m");


    Font font2 = new Font("Arial", Font.BOLD,16);


    JTextField enterKineticEnergy1 = new JTextField("Enter v");






    public void mainUi(){
        frame.add(forceBtn);
        frame.setSize(200,200);
        frame.setLayout(new GridLayout(5,1));
        frame.setVisible(true);

    }
    public void mainUi1(){
        frame.add(PEnergyBtn);
        frame.setSize(200,200);
        frame.setLayout(new GridLayout(5,1));
        frame.setVisible(true);


    }
    public void mainUi2(){
        frame.add(WorkDoneBtn);
        frame.setSize(200,200);
        frame.setLayout(new GridLayout(5,1));
        frame.setVisible(true);
    }
    public void mainUi3(){
        frame.add(KineticEnergyBtn);
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
            JOptionPane.showMessageDialog(null, "Calculate Force");


    }

}
    Formulas formulas1= new Formulas();
    public void PEnergyBtn_(){
        PEnergyBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcPEnergy();

            }
        });
    }
    public void calcPEnergy(){
        forceFrame.add(enterPEnergy);
        forceFrame.add(enterPEnergy1);
        forceFrame.add(PEnergyBtn);
        forceFrame.setSize(200,200);
        forceFrame.setLayout(new GridLayout(3,1));
        forceFrame.setVisible(true);
        enterPEnergy.setBackground(Color.GRAY);
        enterPEnergy.setForeground(Color.WHITE);
        enterPEnergy1.setBackground(Color.GRAY);
        enterPEnergy1.setForeground(Color.WHITE);
        enterPEnergy.setFont(font); // Set the font of the text field using setFont() method
        enterPEnergy1.setFont(font); // Set the font of the text field using setFont() method

        try {
            float PEnergy = formulas.PEnergy(Float.parseFloat(enterPEnergy.getText()),Float.parseFloat(enterPEnergy1.getText()));
            JOptionPane.showMessageDialog(null,  PEnergy);
        }catch (Exception e){
            System.out.println("Calculate PEnergy");


        }

}
    Formulas formulas2 = new Formulas();
    public void WorkDoneBtn_() {
        WorkDoneBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              calcWorkDone();
            }
        });
    }
    public void calcWorkDone() {
        forceFrame.add(enterWorkDone);
        forceFrame.add(enterWorkDone1);
        forceFrame.add(WorkDoneBtn);
        forceFrame.setSize(200, 200);
        forceFrame.setLayout(new GridLayout(3, 1));
        forceFrame.setVisible(true);
        enterPEnergy.setBackground(Color.GRAY);
        enterPEnergy.setForeground(Color.WHITE);
        enterPEnergy1.setBackground(Color.GRAY);
        enterPEnergy1.setForeground(Color.WHITE);
        enterPEnergy.setFont(font); // Set the font of the text field using setFont() method
        enterPEnergy1.setFont(font);

        try {
            float PEnergy = formulas.PEnergy(Float.parseFloat(enterWorkDone.getText()), Float.parseFloat(enterWorkDone1.getText()));
            JOptionPane.showMessageDialog(null, PEnergy);
        } catch (Exception e) {
            System.out.println("Calculate WorkDone");
        }
    }
        Formulas formulas3 = new Formulas();

        public void KineticEnergyBtn_ ()
        {

            KineticEnergyBtn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    calKineticEnergy();
                }
            });
        }

        public void calKineticEnergy(){
            forceFrame.add(enterKineticEnergy);
            forceFrame.add(enterKineticEnergy1);
            forceFrame.add(KineticEnergyBtn);
            forceFrame.setSize(200,200);
            forceFrame.setLayout(new GridLayout(3,1));
            forceFrame.setVisible(true);
            enterKineticEnergy.setBackground(Color.GRAY);
            enterKineticEnergy.setForeground(Color.WHITE);
            enterKineticEnergy1.setBackground(Color.GRAY);
            enterKineticEnergy1.setForeground(Color.WHITE);
            enterKineticEnergy.setFont(font);
            enterKineticEnergy1.setFont(font);

            try{
                float KineticEnergy = formulas.KineticEnergy(Float.parseFloat(enterKineticEnergy.getText()),Float.parseFloat(enterKineticEnergy1.getText()));
                JOptionPane.showMessageDialog(null,  KineticEnergy);
            }catch (Exception e){
                System.out.println("invalid input");
            }





        }
    }


