package MusicClass;

public class Music {
    //Переменные
    private String Name;
    private boolean mp3yn;
    private int Amount;

    //Конструкторы
    public Music(){};
    public Music (String name, boolean mp3yn, int amount){
        this.Name=name;
        this.mp3yn=mp3yn;
        this.Amount=amount;
    }
    public Music(Music Ex){
        this.Name=Ex.Name;
        this.mp3yn=Ex.mp3yn;
        this.Amount=Ex.Amount;
    }
    public Music (String name, boolean mp3yn){
        this.Name=name;
        this.mp3yn=mp3yn;
    }

    //Методы получения полей
    public String getName(){
        return Name;
    }
    public boolean mp3ynShow(){
        return mp3yn;
    }
    public int getAmount(){
        return Amount;
    }

    //Метод для подсчёта количества песен с возможностью
    //скачать их в mp3
    public static int CanBeDownloaded(Music []Music){
        int amo=0;
        for (int i=0; i<7; i++)
            if(Music[i].mp3yn==true)
                amo++;
            return amo;
    }
    //Метод для подсчёта общего количества проданных копий
    public static int GeneralAmount(Music []song){
        int genamo=0;
        for (int i=0; i<7; i++)
            genamo+=song[i].Amount;
        return genamo;
    }

    //Вывод всего
    public void Print(){
        char download=9660;
            System.out.format("| %-40s|", this.getName());
            if (this.mp3ynShow())
                System.out.format(" %-2s|", download);
            else
                System.out.format(" %-2s|", " ");
            System.out.format(" %-8d |", this.getAmount());
            System.out.print("\n----------------------------------------------------------\n");
    }
}

