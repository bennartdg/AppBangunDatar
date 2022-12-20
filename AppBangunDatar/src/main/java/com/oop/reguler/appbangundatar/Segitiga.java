/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oop.reguler.appbangundatar;

/**
 *
 * @author SABRINA AZIZA UTAMI
 */
public class Segitiga extends BangunDatar {

  private double alas;
  private double tinggi;

  public Segitiga() {
  }

  public Segitiga(double alas, double tinggi) {
    this.alas = alas;
    this.tinggi = tinggi;
  }

  public double getAlas() {
    return alas;
  }

  public void setAlas(double alas) {
    this.alas = alas;
  }

  public double getTinggi() {
    return tinggi;
  }

  public void setTinggi(double tinggi) {
    this.tinggi = tinggi;
  }

  @Override
  double luas() {
    return alas * tinggi / 2;
  }

  @Override
  double keliling() {
    return sisiMiring() * 2 + alas;
  }

  public double sisiMiring() {
    return Math.sqrt(Math.pow(alas / 2, 2)) + Math.pow(tinggi, 2);
  }
}
