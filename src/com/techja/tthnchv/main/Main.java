package com.techja.tthnchv.main;

import com.techja.tthnchv.dinh.Dinh;
import com.techja.tthnchv.hinhtron.HinhTron;
import com.techja.tthnchv.tugiac.HinhChuNhat;
import com.techja.tthnchv.tugiac.HinhVuong;
import com.techja.tthnchv.tugiac.TuGiac;

public class Main {
    public static void main(String[] args) {
        Dinh dinh1 = new Dinh(0, 0);
        Dinh dinh2 = new Dinh(0, 5);
        Dinh dinh3 = new Dinh(5, 5);
        Dinh dinh4 = new Dinh(5, 0);

        // hv
        TuGiac tg1 = new HinhVuong(dinh1, dinh2, dinh3, dinh4);
        ((HinhVuong)tg1).tinhDoDaiCanh();
        tg1.tinhCV();
        tg1.tinhDT();
        tg1.inTT();

        System.out.println();

        // hcn
        dinh2.setX(5);
        dinh2.setY(0);

        dinh3.setX(5);
        dinh3.setY(2);

        dinh4.setX(0);
        dinh4.setY(2);

        TuGiac tg2 = new HinhChuNhat(dinh1, dinh2, dinh3, dinh4);

        ((HinhChuNhat)tg2).tinhCDCR();
        tg2.tinhCV();
        tg2.tinhDT();
        tg2.inTT();

        HinhTron ht = new HinhTron(5);
        ht.tinhCV();
        ht.tinhDT();
        ht.inTT();
    }
}
