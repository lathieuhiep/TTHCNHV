package com.techja.tthnchv.tugiac;

import com.techja.tthnchv.dinh.Dinh;

public class HinhChuNhat extends TuGiac {
    double chieuDai, chieuRong;

    public HinhChuNhat(Dinh dinh1, Dinh dinh2, Dinh dinh3, Dinh dinh4) {
        super(dinh1, dinh2, dinh3, dinh4);
    }

    public void tinhCDCR() {
        double bpX = (dinh1.getX() - dinh2.getX()) * (dinh1.getX() - dinh2.getX());
        double bpY = Math.pow(dinh1.getY() - dinh2.getY(), 2);
        chieuDai = Math.sqrt(bpX + bpY);

        bpX = (dinh3.getX() - dinh2.getX()) * (dinh3.getX() - dinh2.getX());
        bpY = Math.pow(dinh3.getY() - dinh2.getY(), 2);
        chieuRong = Math.sqrt(bpX + bpY);
    }

    @Override
    public void inTT() {
        super.inTT();
        System.out.println("Chieu rong: " + chieuRong);
        System.out.println("Chieu dai: " + chieuDai);
    }

    @Override
    public void tinhDT() {
        dienTich = chieuRong * chieuDai;
    }

    @Override
    public void tinhCV() {
        chuVi = (chieuRong + chieuDai) * 2;
    }
}
