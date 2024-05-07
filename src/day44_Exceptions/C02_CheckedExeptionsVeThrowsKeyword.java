package day44_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C02_CheckedExeptionsVeThrowsKeyword {
    public static void main(String[] args) throws FileNotFoundException {

        String dosyayolu="src/day44_Exceptions/deneme.txt ";
        FileInputStream fileInputStream=new FileInputStream(dosyayolu);

    }
}
