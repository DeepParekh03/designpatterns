package tech.zeta.java.designpatterns.structural.adapter2.object;

public class XMLToJsonClient {
    public static void main(String[] args) {
        LegacyXMLDataProvider xmlDataProvider=new LegacyXMLDataProvider();
        JSONDataProvider jsonDataProvider=new XMLToJsonAdapter(xmlDataProvider);
        System.out.println(jsonDataProvider.getJsonData());
    }
}
