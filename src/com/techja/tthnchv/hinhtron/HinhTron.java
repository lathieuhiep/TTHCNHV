package com.techja.tthnchv.hinhtron;

import com.techja.tthnchv.ichung.IHinh;

public class HinhTron implements IHinh {
    private double r, chuVi, dienTich;

    public HinhTron(double r) {
        this.r = r;
    }

    @Override
    public void tinhCV() {
        chuVi = 2 * Math.PI * r;
    }

    @Override
    public void tinhDT() {
        dienTich = Math.PI * r *r;
    }

    @Override
    public void inTT() {
        System.out.println("Thong tin hinh tron");
        System.out.println("Ban kinh: " + r);
        System.out.println("Chu vi: " + chuVi);
        System.out.println("Dien Tich: " + dienTich);
    }
}
