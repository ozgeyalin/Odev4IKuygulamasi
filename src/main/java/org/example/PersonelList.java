package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PersonelList {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        classPersonel Personel1 = new classPersonel();
        classPersonel Personel2 = new classPersonel();
        classPersonel Personel3 = new classPersonel();
        classPersonel Personel4 = new classPersonel();

        Personel1.isim = "Ozge";
        Personel1.soyadi = "Yalin";
        Personel1.bölüm = "Uretim";
        Personel1.sicilno = "123456";

        Personel2.isim = "Fatma";
        Personel2.soyadi = "Acar";
        Personel2.bölüm = "Satis";
        Personel2.sicilno = "234244";

        Personel3.isim = "Mert";
        Personel3.soyadi = "Yalin";
        Personel3.bölüm = "Uretim";
        Personel3.sicilno = "465748";

        Personel4.isim = "Ali";
        Personel4.soyadi = "Acar";
        Personel4.bölüm = "Satis";
        Personel4.sicilno = "454650";

        Personel1.isimlistesi();
        Personel1.soyadilistesi();
        Personel1.bölümlistesi();
        Personel1.sicilnolistesi();

        Personel2.isimlistesi();
        Personel2.soyadilistesi();
        Personel2.bölümlistesi();
        Personel2.sicilnolistesi();

        Personel3.isimlistesi();
        Personel3.soyadilistesi();
        Personel3.bölümlistesi();
        Personel3.sicilnolistesi();

        Personel4.isimlistesi();
        Personel4.soyadilistesi();
        Personel4.bölümlistesi();
        Personel4.sicilnolistesi();








    }
}