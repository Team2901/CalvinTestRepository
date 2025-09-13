package org.firstinspires.ftc.teamcode.ExamplesAndOtherTests;

//import androidx.annotation.NonNull;

import java.util.HashMap;
import java.util.Map;

abstract class State{
    abstract void enter();
}
class TrafficLight{
    boolean red;
    boolean green;
    boolean yellow;
    public TrafficLight(){
        red = false;
        green = false;
        yellow = false;
    }
    void makeRed(){
        red = true;
        green = false;
        yellow = false;
    }
    void makeGreen(){
        green = true;
        red = false;
        yellow = false;
    }
    void makeYellow(){
        yellow = true;
        red = false;
        green = false;
    }
    //@NonNull
    public String toString(){
        StringBuilder sb = new StringBuilder();
        if (red) sb.append("RED");
        if (yellow) sb.append("YELLOW");
        if (green) sb.append("GREEN");
        return sb.toString();
    }
}
abstract class TrafficLightState extends State{
    TrafficLight northLight = new TrafficLight();
    TrafficLight southLight = new TrafficLight();
    TrafficLight eastLight = new TrafficLight();
    TrafficLight westLight = new TrafficLight();
}

class A extends TrafficLightState {
    @Override
    public void enter() {
        northLight.makeGreen();
        southLight.makeGreen();
        eastLight.makeRed();
        westLight.makeRed();
    }
}
class B extends TrafficLightState {
    @Override
    public void enter(){
        northLight.makeYellow();
        southLight.makeYellow();
        eastLight.makeRed();
        westLight.makeRed();
    }
}
class C extends TrafficLightState {
    @Override
    public void enter(){
        northLight.makeRed();
        southLight.makeRed();
        eastLight.makeGreen();
        westLight.makeGreen();
    }
}
class D extends TrafficLightState {
    @Override
    public void enter(){
        northLight.makeRed();
        southLight.makeRed();
        eastLight.makeYellow();
        westLight.makeYellow();
    }
}
class E extends TrafficLightState {
    @Override
    public void enter(){
        northLight.makeRed();
        southLight.makeRed();
        eastLight.makeRed();
        westLight.makeRed();
    }
}
class F extends TrafficLightState {
    @Override
    public void enter(){
        northLight.makeRed();
        southLight.makeRed();
        eastLight.makeRed();
        westLight.makeRed();
    }
}

class TrafficStateMachine {
    double time;
    enum States { A, B, C, D, E, F};
    Map<States, TrafficLightState> theStates = new HashMap<>();
    States currentState;

    public TrafficStateMachine (){
        theStates.put(States.A, new A());
        theStates.put(States.B, new B());
        theStates.put(States.C, new C());
        theStates.put(States.D, new D());
        theStates.put(States.E, new E());
        theStates.put(States.F, new F());

        time = System.nanoTime();
        currentState = States.A;
        theStates.get(currentState).enter();
    }

    void update(){
        States nextState = null;
        switch (currentState) {
            case A:
                if ((System.nanoTime() - time) > 1e9) {
                    nextState = States.B;
                }
                break;
            case B:
                if ((System.nanoTime() - time) > 1e9) {
                    nextState = States.E;
                }
                break;
            case E:
                if ((System.nanoTime() - time) > 1e9) {
                    nextState = States.C;
                }
                break;
            case C:
                if ((System.nanoTime() - time) > 1e9) {
                    nextState = States.D;
                }
                break;
            case D:
                if ((System.nanoTime() - time) > 1e9) {
                    nextState = States.F;
                }
                break;
            case F:
                if ((System.nanoTime() - time) > 1e9) {
                    nextState = States.A;
                }
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + currentState.getClass());
        }

        if (nextState != null) {
            currentState = nextState;
            theStates.get(currentState).enter();
            time = System.nanoTime();
        }
    }
    //@NonNull
    public String toString() {
        String s = "";
        s += "Current State: " + currentState.toString() + "\n";
        s += "Time: " + System.nanoTime() / 1e9 + "\n";
        s += "Timer: " + (System.nanoTime() - time) / 1e9 + "\n";
        TrafficLightState tmp = theStates.get(currentState);
        s += "North: " + tmp.northLight + "\n";
        s += "South: " + tmp.southLight + "\n";
        s += "East: " + tmp.eastLight + "\n";
        s += "West: " + tmp.westLight;
        return s;
    }
}
public class TrafficLightStateMachineTest {
    public static void main(String [] args){
        TrafficStateMachine trafficSystem = new TrafficStateMachine();
        while(true){
            trafficSystem.update();
            System.out.println(trafficSystem);
        }
    }
}
