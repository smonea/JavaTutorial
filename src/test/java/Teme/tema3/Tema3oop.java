package Teme.tema3;

public class Tema3oop {

    public String placaDeBaza;
    public String procesor;
    public String ram;
    public String cooler;
    public String sursa;
    public String placaVideo;
    public String ssd;
    public String carcasa;
    public String ventilatoare;
    public int pret;
    public boolean livrareLaDomiciliu;

    public Tema3oop(String placaDeBaza, String procesor, String ram, String cooler, String sursa, String placaVideo, String ssd, String carcasa, String ventilatoare, int pret, boolean livrareLaDomiciliu) {
        this.placaDeBaza = placaDeBaza;
        this.procesor = procesor;
        this.ram = ram;
        this.cooler = cooler;
        this.sursa = sursa;
        this.placaVideo = placaVideo;
        this.ssd = ssd;
        this.carcasa = carcasa;
        this.ventilatoare = ventilatoare;
        this.pret = pret;
        this.livrareLaDomiciliu = livrareLaDomiciliu;
    }

    public void prezentareComandaPC(){
        System.out.println("Placa de baza: "+placaDeBaza);
        System.out.println("Procesor: "+procesor);
        System.out.println("Ram: "+ram);
        System.out.println("Cooler: "+cooler);
        System.out.println("Sursa: "+sursa);
        System.out.println("Placa video: "+placaVideo);
        System.out.println("SSD: "+ssd);
        System.out.println("Carcasa: "+carcasa);
        System.out.println("Ventilatoare: "+ventilatoare);
        System.out.println("Pret: "+pret);
        if (livrareLaDomiciliu) {  //Verifica daca este true fara ==
            System.out.println("Livrare domiciliu: Da" );
        }else {
            System.out.println("Livrare domiciliu: Nu" );
        }
    }
}
