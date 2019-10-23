public class Clothes {
    //Атрибуты суперкласса
    public String Manufacturer, Style;
    public double Price;

    //Конструкторы
    public Clothes(String manuf, String style, double price){
        this.Manufacturer=manuf;
        this.Style=style;
        this.Price=price;
    }
    public Clothes(String style, double price){
        this.Style=style;
        this.Price=price;
    }
    public Clothes(){
        Manufacturer="Belarus";
        Style="Casual";
        Price=29.99;
    }

    //Геттеры
    public String getManufacturer(){
        return Manufacturer;
    }
    public String getStyle(){
        return Style;
    }
    public double getPrice(){
        return Price;
    }

    //Переопределяемые методы
    public void Brand(){
        System.out.println("Welcome to our clothing store!");
    }
    public void PrintHead() {
        System.out.format(" Title                 | Manufacturer          | Style          | Price ($) \n"
                + "----------------------------------------------------------------------------------\n");
    }

}
