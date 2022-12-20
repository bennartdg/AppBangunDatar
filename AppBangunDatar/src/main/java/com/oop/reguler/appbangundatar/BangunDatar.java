package com.oop.reguler.appbangundatar;

abstract class BangunDatar {

  private String namaBangunDatar;

  public BangunDatar() {
  
  }

  public String getNamaBangunDatar() {
    return namaBangunDatar;
  }

  public void setNamaBangunDatar(String namaBangunDatar) {
    this.namaBangunDatar = namaBangunDatar;
  }

  abstract double luas();

  abstract double keliling();
}
