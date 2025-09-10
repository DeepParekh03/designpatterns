package tech.zeta.java.designpatterns.creational;

import tech.zeta.java.designpatterns.creational.singleton.ConfigurationManager;

public class ConfigurationManagerTest {
    public static void main(String[] args) {
        ConfigurationManager configurationManager=ConfigurationManager.getInstance();
        ConfigurationManager configurationManager1=ConfigurationManager.getInstance();

        System.out.println(configurationManager=configurationManager1);
        System.out.println("config1");
        System.out.println("Database URL: "+configurationManager.getDatabaseURL());
        System.out.println("Max Connections: "+configurationManager.getDatabaseURL());
        System.out.println("config2");
        System.out.println("Database URL: "+configurationManager1.getDatabaseURL());
        System.out.println("Max Connections: "+configurationManager1.getDatabaseURL());
        configurationManager1.setDatabaseURL("jdbc://newurl:5432/newdb");
        System.out.println("config1");
        System.out.println("Database URL: "+configurationManager.getDatabaseURL());
        System.out.println("Max Connections: "+configurationManager.getDatabaseURL());
        System.out.println("config2");
        System.out.println("Database URL: "+configurationManager1.getDatabaseURL());
        System.out.println("Max Connections: "+configurationManager1.getDatabaseURL());

    }
}
