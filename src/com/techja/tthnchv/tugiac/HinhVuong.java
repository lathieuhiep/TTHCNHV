package com.techja.tthnchv.tugiac;

import com.techja.tthnchv.dinh.Dinh;

public class HinhVuong extends TuGiac {
    private double doDaiCanh;

    public HinhVuong(Dinh dinh1, Dinh dinh2, Dinh dinh3, Dinh dinh4) {
        super(dinh1, dinh2, dinh3, dinh4);
    }

    public void tinhDoDaiCanh() {
        double bpX = (dinh1.getX() - dinh2.getX()) * (dinh1.getX() - dinh2.getX());
        double bpY = Math.pow(dinh1.getY() - dinh2.getY(), 2);

        doDaiCanh = Math.sqrt(bpX + bpY);
    }

    @Override
    public void inTT() {
        super.inTT();
        System.out.println("Do dai canh: " + doDaiCanh);
    }

    @Override
    public void tinhDT() {
        dienTich = doDaiCanh * doDaiCanh;
    }

    @Override
    public void tinhCV() {
        chuVi = doDaiCanh * 4;
    }
}
