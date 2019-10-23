public class Jacket extends Clothes {
    //Атрибуты производного класса
    public String Season;
    public boolean HoodPresence;

    //Конструкторы производного класса
    public Jacket(String manuf, String style, double price, String season,
                  boolean HP){
        super(manuf,style,price);
        Season=season;
        HoodPresence=HP;
    }
    public Jacket(String manuf, String style, double price, String season){
        super(manuf,style,price);
        Season=season;
        HoodPresence=false;
    }
    public Jacket(){
        super();
        Season="Autumn";
        HoodPresence=true;
    }

    //Геттеры производного класса
    public String getSeason(){
        return Season;
    }
    public boolean getHoodPresence(){
        return HoodPresence;
    }

    //Переопределённый метод суперкласса
    public void Brand(){
        System.out.println("Decide what jacket brand you want to buy");
    }
    public void PrintHead() {
        System.out.print("\n                   JACKETS\n");
        System.out.println("___________________________________" +
                "_________________________" +
                "________________________________________");
        System.out.format("| Title                | Manufacturer          | Style          | Price,$ | Season | Hood Presence |\n"
                        + "----------------------------------------------------------------------------------------------------\n");
    }
}
