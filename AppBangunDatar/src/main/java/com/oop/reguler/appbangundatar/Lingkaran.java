/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.oop.reguler.appbangundatar;

/**
 *
 * @author MEMi
 */
public class Lingkaran extends BangunDatar {

  private double r;
  public final double phi = 3.14;

  public double getR() {
    return r;
  }

  public void setR(double r) {
    this.r = r;
  }

  @Override
  double luas() {
    return phi * r * r;
  }

  @Override
  double keliling() {
    return 2 * phi * r;
  }

}
