package day44_Exceptions;

import javax.imageio.IIOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_MultipleCheckedExeptions {
    public static void main(String[] args) throws IOException {



        String dosyayolu="src/day44_Exceptions/deneme.txt";
        FileInputStream fileInputStream=new FileInputStream(dosyayolu);

        int k=0;
        while((k= fileInputStream.read() ) != (-1)) { // dosyayi okuyup, bize getirme
            // Unhandled exception: java.io.IOException
            System.out.print((char) k);
        }


    }
}
