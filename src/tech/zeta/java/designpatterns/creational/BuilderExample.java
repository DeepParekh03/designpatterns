package tech.zeta.java.designpatterns.creational;

import tech.zeta.java.designpatterns.creational.builder.Computer;
import tech.zeta.java.designpatterns.creational.builder.ComputerBuilder;
import tech.zeta.java.designpatterns.creational.builder.DirectorComputer;
import tech.zeta.java.designpatterns.creational.builder.GaminComputerBuilder;

public class BuilderExample {
    public static void main(String[] args) {
        GaminComputerBuilder gaminComputerBuilder=new GaminComputerBuilder();
        DirectorComputer directorComputer=new DirectorComputer(gaminComputerBuilder);

        Computer gamingComputer= directorComputer.constructGamingComputer();
        System.out.println(gamingComputer);

        GaminComputerBuilder officeComputerBuilder= new GaminComputerBuilder();
        directorComputer=new DirectorComputer(officeComputerBuilder);
        Computer officeComputer= directorComputer.constructOfficeComputer();
        System.out.println(officeComputer);
    }
}
