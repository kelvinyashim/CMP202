package UI;

import UI.Formulas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
   /*     Formulas myObj = new Formulas();
        myObj.accessGravity();
        Scanner input = new Scanner(System.in);
        try {
            float d = input.nextFloat();
            float t = input.nextFloat();
            System.out.println(myObj.KineticEnergy(d,t));
        }catch (InputMismatchException inputMismatchException){
            System.out.println("Enter a Valid number");
        }
        catch (Exception e) {
            System.out.println("!!!!!!Something went wrong");
            //Exception means handling all possible errors
        }
    }*/
  FormulasGUI myObj = new FormulasGUI();
  myObj.mainUi();
  myObj.forceBtn_();

}}
