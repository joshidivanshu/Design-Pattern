/**
 * Implementation of facade design pattern.
 * The Facade design pattern is a structural design pattern that provides a simplified interface to a set of interfaces in a subsystem.
 * It defines a higher-level interface that makes the subsystem easier to use.
 * @author Divanshu Joshi
 * @version 1.0
 * @since 2023-10-01
 */
class CPU {
    public void start() {
        System.out.println("CPU Started");
    }
}

class Memory {
    public void load() {
        System.out.println("Memory loaded");
    }
}

class HardDrive {
    public void readData() {
        System.out.println("Read data from hard drive");
    }
}

class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void startComputer() {
        cpu.start();
        memory.load();
        hardDrive.readData();
        System.out.println("Computer started successfully!!!");
    }
}

/**
 * Client Class.
 *
 * Class that will be used by client to start a computer.
 *
 * @author Divanshu Joshi
 * @version 1.0
 * @since 2023-10-01
 */
public class FacadeDesign {
    public static void main(String[] args) {
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.startComputer();
    }
}
