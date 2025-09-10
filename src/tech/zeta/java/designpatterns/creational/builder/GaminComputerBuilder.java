package tech.zeta.java.designpatterns.creational.builder;

public class GaminComputerBuilder implements ComputerBuilder{
    private String cpu;
    private String ram;
    private String storage;
    private String graphicsCard;
    private String motherBoard;

    @Override
    public GaminComputerBuilder setCpu(String cpu) {
        this.cpu=cpu;
        return this;
    }

    @Override
    public GaminComputerBuilder setRam(String ram) {
        this.ram=ram;
        return this;
    }

    @Override
    public GaminComputerBuilder setStorage(String storage) {
        this.storage=storage;
        return this;
    }

    @Override
    public GaminComputerBuilder setgraphicsCard(String graphicsCard) {
        this.graphicsCard=graphicsCard;
        return this;
    }

    @Override
    public GaminComputerBuilder setMotherBoard(String motherBoard) {
        this.motherBoard=motherBoard;
        return this;
    }

    @Override
    public Computer build() {
        return new Computer(cpu,ram,storage,graphicsCard,motherBoard);
    }
}
