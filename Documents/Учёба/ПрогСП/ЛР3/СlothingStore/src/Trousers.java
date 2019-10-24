
public class Trousers extends Clothes {
    //Атрибуты производного класса
    public boolean Flare;

    //Конструкторы производного класса
    public Trousers(String manuf, String style, double price, boolean flare){
        super(manuf,style,price);
        Flare=flare;
    }
    public Trousers(String manuf, String style, double price){
        super(manuf,style,price);
        Flare=true;
    }
    public Trousers(){
        super();
        Flare=false;
    }

    //Геттер производного класса
    public boolean getFlare(){
        return Flare;
    }


    //Переопределённый метод суперкласса
    public void Brand(){
        System.out.println("Decide what trousers brand you want to buy");
    }
    public void PrintHead() {
        System.out.print("\n\n                   TROUSERS\n");
        System.out.println("_________________________________________" +
                "_________________________" +
                "_________________");
        System.out.format("| Title                | Manufacturer          | Style          | Price,$ | Flare |\n"
                        + "-----------------------------------------------------------------------------------\n");
    }

}

