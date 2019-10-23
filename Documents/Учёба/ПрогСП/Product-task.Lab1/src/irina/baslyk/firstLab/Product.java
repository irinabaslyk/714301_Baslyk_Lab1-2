package irina.baslyk.firstLab;

public class Product {
    private String Name;
    private int Avail;
    private double Price;

    public void PrintHead(){
        System.out.format(" Название          | Наличие          | Цена          \n"
                +"-----------------------------------------------------\n");
    }
    public void PrintAll(){
        System.out.format(" %-18s",Name);
        System.out.format("| %-17d",Avail);
        System.out.format("| %-13s",Price);
        System.out.println();
    }
    public Product(String N, int A, double P){
        Name = N;
        Avail = A;
        Price = P;
    }
    public Product(){
        Name = "Яйцо Kinder";
        Avail = 30;
        Price = 2.13;
    }
}

