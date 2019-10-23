public class WriterInfo {
    public static void main(String[] args){
        char truetick=10003;
        //Созание объектов класса Jacket
        Jacket J1=new Jacket("Korea","Sport",
                13.65, "Autumn",false);
        Jacket J2=new Jacket("Great Britain","Glamour",
                29.99, "Winter");
        Jacket J3=new Jacket();

        //Созание объектов класса Sweater
        Sweater S1=new Sweater("Russia","Grunge",
                16.66, 35.5,20);
        Sweater S2=new Sweater("Poland","New-look",
                14.85, 15);
        Sweater S3=new Sweater();

        //Созание объектов класса Trousers
        Trousers T1=new Trousers("Holland","Bohemian",
                12.99, true);
        Trousers T2=new Trousers("Japan","Minimalism",
                20.00);
        Trousers T3=new Trousers();

        //Вывод информации об объектах класса Jacket
        J1.PrintHead();
        System.out.format(" %-22s|","Jacket Yellow Leaf");
        System.out.format(" %-22s",J1.Manufacturer);
        System.out.format("| %-15s",J1.Style);
        System.out.format("| %-8s",J1.Price);
        System.out.format("| %-7s",J1.Season);
        if (J1.HoodPresence==true)
            System.out.format("| %-13s",truetick);
        else
            System.out.format("| %-13s"," ");
        System.out.println();

        System.out.format(" %-22s|","Furry Cat");
        System.out.format(" %-22s",J2.Manufacturer);
        System.out.format("| %-15s",J2.Style);
        System.out.format("| %-8s",J2.Price);
        System.out.format("| %-7s",J2.Season);
        if (J2.HoodPresence==true)
            System.out.format("| %-13s",truetick);
        else
            System.out.format("| %-13s"," ");
        System.out.println();

        System.out.format(" %-22s|","Evening Walk");
        System.out.format(" %-22s",J3.Manufacturer);
        System.out.format("| %-15s",J3.Style);
        System.out.format("| %-8s",J3.Price);
        System.out.format("| %-7s",J3.Season);
        if (J3.HoodPresence==true)
            System.out.format("| %-13s",truetick);
        else
            System.out.format("| %-13s"," ");
        System.out.println();

        //Вывод информации об объектах класса Sweater
        S1.PrintHead();
        System.out.format(" %-22s|","Remember Nirvana");
        System.out.format(" %-22s",S1.Manufacturer);
        System.out.format("| %-15s",S1.Style);
        System.out.format("| %-8s",S1.Price);
        System.out.format("| %-17s",S1.SleeveLength);
        System.out.format("| %-13d",S1.FurPercent);
        System.out.println();

        System.out.format(" %-22s|","Romance");
        System.out.format(" %-22s",S2.Manufacturer);
        System.out.format("| %-15s",S2.Style);
        System.out.format("| %-8s",S2.Price);
        System.out.format("| %-17s",S2.SleeveLength);
        System.out.format("| %-13d",S2.FurPercent);
        System.out.println();

        System.out.format(" %-22s|","Warm Date");
        System.out.format(" %-22s",S3.Manufacturer);
        System.out.format("| %-15s",S3.Style);
        System.out.format("| %-8s",S3.Price);
        System.out.format("| %-17s",S3.SleeveLength);
        System.out.format("| %-13d",S3.FurPercent);
        System.out.println();

        //Вывод информации об объектах класса Trousers
        T1.PrintHead();
        System.out.format(" %-22s|","Remember Nirvana");
        System.out.format(" %-22s",T1.Manufacturer);
        System.out.format("| %-15s",T1.Style);
        System.out.format("| %-8s",T1.Price);
        if (T1.Flare==true)
            System.out.format("| %-17s",truetick);
        else
            System.out.format("| %-17s"," ");
        System.out.println();

        System.out.format(" %-22s|","Romance");
        System.out.format(" %-22s",T2.Manufacturer);
        System.out.format("| %-15s",T2.Style);
        System.out.format("| %-8s",T2.Price);
        if (T2.Flare==true)
            System.out.format("| %-17s",truetick);
        else
            System.out.format("| %-17s"," ");
        System.out.println();

        System.out.format(" %-22s|","Warm Date");
        System.out.format(" %-22s",T3.Manufacturer);
        System.out.format("| %-15s",T3.Style);
        System.out.format("| %-8s",T3.Price);
        if (T3.Flare==true)
         System.out.format("| %-17s",truetick);
        else
            System.out.format("| %-17s"," ");
        System.out.println();
    }
}
