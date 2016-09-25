package interface_oriented_design;

import interface_demo.Output;
import interface_demo.Printer;

/**
 * Created by lyne on 16-7-3.
 */
public class OutputFactory {

    public Output getOutput(){
        return new Printer();
    }

    public static void main(String[] args) {
        OutputFactory outputFactory = new OutputFactory();
        Computer computer = new Computer(outputFactory.getOutput());
        computer.keyIn("luffy");
        computer.print();
    }

}
