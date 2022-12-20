package com.oop.reguler.appbangundatar;

public class Main {
  public static void main(String[] args) {
    Persegi persegi = new Persegi();
    PersegiPanjang persegiPanjang = new PersegiPanjang();
    Segitiga segitiga = new Segitiga();
    Lingkaran lingkaran = new Lingkaran();
    
    persegi.setNamaBangunDatar("Persegi");
    persegi.setSisi(4);
    
    persegiPanjang.setNamaBangunDatar("Persegi Panjang");
    persegiPanjang.setPanjang(4);
    persegiPanjang.setLebar(5);
    
    segitiga.setNamaBangunDatar("Segitiga");
    segitiga.setAlas(2);
    segitiga.setTinggi(4);
    
    lingkaran.setNamaBangunDatar("Lingkaran");
    lingkaran.setR(7);
    
    
    System.out.println("Nama : " + persegi.getNamaBangunDatar());
    
    System.out.println("Luas : " + persegi.luas());
    System.out.println("Keliling : " + persegi.keliling());
    
    System.out.println("Nama : " + persegiPanjang.getNamaBangunDatar());
    
    System.out.println("Luas : " + persegiPanjang.luas());
    System.out.println("Keliling : " + persegiPanjang.keliling());
    
    System.out.println("Nama : " + segitiga.getNamaBangunDatar());
    
    System.out.println("Luas : " + segitiga.luas());
    System.out.println("Keliling : " + segitiga.keliling());
    
    System.out.println("Nama : " + lingkaran.getNamaBangunDatar());
    
    System.out.println("Luas : " + lingkaran.luas());
    System.out.println("Keliling : " + lingkaran.keliling());
    
    
  }
}
