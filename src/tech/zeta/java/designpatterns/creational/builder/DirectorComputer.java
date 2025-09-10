package tech.zeta.java.designpatterns.creational.builder;

public class DirectorComputer{
    private ComputerBuilder builder;

    public DirectorComputer(ComputerBuilder builder){
        this.builder=builder;
    }

    public Computer constructGamingComputer(){
        return builder.setCpu("AMD Radeon").setRam("32GB")
                .setStorage("1TB SSD")
                .setgraphicsCard("NVIDIA RTX 4090")
                .setMotherBoard("ASUS ROG")
                .build();
    }
    public Computer constructOfficeComputer(){
        return builder.setCpu("Intel i5").setRam("16GB")
                .setStorage("512GB SSD")
                .setMotherBoard("Intel")
                .build();
    }
}
