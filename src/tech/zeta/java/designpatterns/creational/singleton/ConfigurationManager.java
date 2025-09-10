package tech.zeta.java.designpatterns.creational.singleton;

public class ConfigurationManager {
    private static final ConfigurationManager instance= new ConfigurationManager();
    private String databaseURL;
    private int maxConnection;

    private ConfigurationManager(){
        this.databaseURL="jdbc://localhost:5432/techyz";
        this.maxConnection=10;
        System.out.println("ConfigurationManger instance created");
    }

    public static ConfigurationManager getInstance(){
        return instance;
    }

    public String getDatabaseURL(){return  databaseURL;}

    public void setDatabaseURL(String databaseURL){ this.databaseURL=databaseURL;}

    public int getMaxConnection() {return maxConnection;}

    public void setMaxConnection(int maxConnection) {this.maxConnection = maxConnection;}
}
