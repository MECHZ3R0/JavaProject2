package enums;

public class EnumWithValues {
    enum Websites{
        GOOGLE("www.google.com"),FACEBOOK("www.facebook.com"),YAHOO("www.yahoo.com");
        private String def;
        Websites(String def){
            this.def=def;
        }
        String def(){
            return def;
        }
    }
    public static void main(String[] args) {
        for (Websites web:Websites.values()){
            System.out.println(web.def());
        }
    }
}
