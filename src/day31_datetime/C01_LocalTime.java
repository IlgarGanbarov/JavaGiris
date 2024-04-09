package day31_datetime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C01_LocalTime {
    public static void main(String[] args) {

        LocalTime saat= LocalTime.now();

        //saat varibl'i canli bir kronometre veya saat deyil
        //9.satirin calisdigi anda bilgisayarimizin saatini kaydeden bir variable'dir
        System.out.println(saat);




        for (int i = 0; i <10000000 ; i++) {

            String str=i+"";

        }
        System.out.println("saat:"+saat);
        LocalTime bitisSaaati=LocalTime.now();
        System.out.println("bitissaati:"+bitisSaaati);

        LocalTime japonsaati=LocalTime.now(ZoneId.of("Japan"));
        System.out.println("japonya saati"+japonsaati);
        LocalTime istenensaat=LocalTime.of(12,10,23);

        System.out.println(saat.plusMinutes(267));
        System.out.println(saat.minusSeconds(10500));
        //with metodlari saatin istediyimiz bolumune farkli atamamizi saglar
        System.out.println(saat.withHour(17));

        System.out.println(saat.withSecond(0).withNano(0));
        System.out.println(saat.isBefore(bitisSaaati));
        System.out.println(saat.isAfter(bitisSaaati));
        System.out.println(saat.getNano());
        System.out.println(saat.toNanoOfDay());
        System.out.println(saat.toSecondOfDay());

        LocalTime loopbaslangic=LocalTime.now();
        Long loopbaslangicNanao=LocalTime.now().toNanoOfDay();

        for (int i = 0; i <10000000 ; i++) {

            String str = i + "";


        }
        LocalTime loopbitis=LocalTime.now();
        Long loopbitisNanao=LocalTime.now().toNanoOfDay();

        System.out.println("loop baslangic:"+loopbaslangic);
        System.out.println("loop bitis:"+loopbitis);
        System.out.println("loop islem suresi nano saniye olarak:"+(loopbitisNanao-loopbaslangicNanao));
    }
}
