package UI;

public class Formulas extends Physics {
    void accessGravity(){
        System.out.println(getGravity());
        //setGravity(80f);
        //System.out.println(getGravity());

    }
    float mutiply(float num1, float num2) {

        return super.mutiply(num1, num2);
    }
    float Force(float m, float a){
        return mutiply(m,a);
    }

    float KineticEnergy(float m,float v){
        return divide(1,2) * mutiply(m,powTwo(v));
    }

    float PEnergy(float mass, float height){
        return mass * getGravity() * height;
    }

    float WorkDone(float force, float distance){return force * distance;}

    float Pressure(float force, float area){ return divide(force,area);}



}
