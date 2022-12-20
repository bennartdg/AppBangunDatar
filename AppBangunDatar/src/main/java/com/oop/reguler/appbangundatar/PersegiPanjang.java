package com.oop.reguler.appbangundatar;

public class PersegiPanjang extends BangunDatar {

  private double panjang;
  private double lebar;

  public PersegiPanjang() {
  }

  public double getPanjang() {
    return panjang;
  }

  public void setPanjang(double panjang) {
    this.panjang = panjang;
  }

  public double getLebar() {
    return lebar;
  }

  public void setLebar(double lebar) {
    this.lebar = lebar;
  }

  @Override
  double luas() {
    return panjang * lebar;
  }

  @Override
  double keliling() {
    return 2 * (panjang + lebar);
  }

}
