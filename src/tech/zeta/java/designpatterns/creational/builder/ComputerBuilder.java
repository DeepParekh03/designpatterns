package tech.zeta.java.designpatterns.creational.builder;

public interface ComputerBuilder {
    ComputerBuilder setCpu(String cpu);
    ComputerBuilder setRam(String ram);
    ComputerBuilder setStorage(String storage);
    ComputerBuilder setgraphicsCard(String graphicsCard);
    ComputerBuilder setMotherBoard(String setMotherBoard);

    Computer build();
}
