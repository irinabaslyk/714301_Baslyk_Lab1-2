<<<<<<< HEAD
public class Sweater extends Clothes {
    //Атрибуты производного класса
    public double SleeveLength;
    public int FurPercent;

    //Конструкторы производного класса
    public Sweater(String manuf, String style, double price, double SL,
                 int FP){
        super(manuf,style,price);
        SleeveLength=SL;
        FurPercent=FP;
    }
    public Sweater(String manuf, String style, double price, int FP){
        super(manuf,style,price);
        SleeveLength=20.3;
        FurPercent=FP;
    }
    public Sweater(){
        super();
        SleeveLength=40.3;
        FurPercent=40;
    }

    //Геттеры производного класса
    public double getSleeveLength(){
        return SleeveLength;
    }
    public int getFurPercent(){
        return FurPercent;
    }

    //Переопределённый метод суперкласса
    public void Brand(){
        System.out.println("Decide what sweater brand you want to buy");
    }
    public void PrintHead() {
        System.out.print("\n\n                   SWEATERS\n");
        System.out.println("_____________________________________" +
                "_________________________" +
                "________________________________________");
        System.out.print("| Title                | Manufacturer          | Style          | Price,$ | Sleeve Length,cm | Fur,% |\n"
                        + "------------------------------------------------------------------------------------------------------\n");
    }

}
=======
public class Sweater extends Clothes {
    //Атрибуты производного класса
    public double SleeveLength;
    public int FurPercent;

    //Конструкторы производного класса
    public Sweater(String manuf, String style, double price, double SL,
                 int FP){
        super(manuf,style,price);
        SleeveLength=SL;
        FurPercent=FP;
    }
    public Sweater(String manuf, String style, double price, int FP){
        super(manuf,style,price);
        SleeveLength=20.3;
        FurPercent=FP;
    }
    public Sweater(){
        super();
        SleeveLength=40.3;
        FurPercent=40;
    }

    //Геттеры производного класса
    public double getSleeveLength(){
        return SleeveLength;
    }
    public int getFurPercent(){
        return FurPercent;
    }

    //Переопределённый метод суперкласса
    public void Brand(){
        System.out.println("Decide what sweater brand you want to buy");
    }
    public void PrintHead() {
        System.out.print("\n\n                   SWEATERS\n");
        System.out.println("_____________________________________" +
                "_________________________" +
                "________________________________________");
        System.out.print("| Title                | Manufacturer          | Style          | Price,$ | Sleeve Length,cm | Fur,% |\n"
                        + "------------------------------------------------------------------------------------------------------\n");
    }

}
>>>>>>> e6f454f58ff83b983aeef7aaa6d7f9cd2a6db535
