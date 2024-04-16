package com.techja.tthnchv.tugiac;

import com.techja.tthnchv.dinh.Dinh;
import com.techja.tthnchv.ichung.IHinh;

public abstract class TuGiac implements IHinh {
    protected Dinh dinh1, dinh2, dinh3, dinh4;
    protected double chuVi, dienTich;

    public TuGiac(Dinh dinh1, Dinh dinh2, Dinh dinh3, Dinh dinh4) {
        this.dinh1 = dinh1;
        this.dinh2 = dinh2;
        this.dinh3 = dinh3;
        this.dinh4 = dinh4;
    }

    @Override
    public void inTT() {
        System.out.println("Thông tin 4 đỉnh");
        dinh1.inTT();
        dinh2.inTT();
        dinh3.inTT();
        dinh4.inTT();

        System.out.println("Chu vi: " + chuVi);
        System.out.println("Diện tích: " + dienTich);
    }
}
