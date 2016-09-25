package interface_oriented_design;

import interface_demo.Output;

/**
 * Created by lyne on 16-7-3.
 */
public class Computer {

    private Output output;

    public Computer(Output output){
        this.output = output;
    }

    public void keyIn(String msg){
        output.getData(msg);
    }

    public void print(){
        output.out();
    }

}
