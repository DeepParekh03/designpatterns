package tech.zeta.java.designpatterns.creational.builder;

public class Computer {
    private String cpu;
    private String ram;
    private String storage;
    private String graphicsCard;
    private String motherBoard;

    public Computer(String cpu, String ram, String storage, String graphicsCard, String motherBoard) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.graphicsCard = graphicsCard;
        this.motherBoard = motherBoard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", motherBoard='" + motherBoard + '\'' +
                '}';
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public String getMotherBoard() {
        return motherBoard;
    }
}
