package tech.zeta.java.designpatterns.structural.adapter2.object;

public class XMLToJsonAdapter implements JSONDataProvider{
    private LegacyXMLDataProvider legacyXMLDataProvider;

    public XMLToJsonAdapter(LegacyXMLDataProvider legacyXMLDataProvider){
        this.legacyXMLDataProvider=legacyXMLDataProvider;
    }
    @Override
    public String getJsonData() {
        String xmlData=legacyXMLDataProvider.getXMLData();
        String jsonData=xmlData.replace("<customer><name>","{\"name\":\"")
                .replace("</name><aeg>","\", \"age\" : \"")
                .replace("</age></customer>","\"}");
        return jsonData;
    }
}
