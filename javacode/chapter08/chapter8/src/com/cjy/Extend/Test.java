package com.cjy.Extend;

public class Test {
    public static void main(String[] args) {
        PC pc = new PC("i9","16GB","1.5T","华硕天选");
        NotePad notePad = new NotePad("r7","8GB","256GB","华为");
        pc.info();
        notePad.info();
    }
}
