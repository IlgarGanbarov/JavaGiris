package day26_Constarctors;

public class C01_Araba {
    String marka="Marka belirtilmedi";
    String model="Model belirtilmedi";
    int yil=1900;
    int fiyat;
    C01_Araba(){

    }

    C01_Araba(String mrk,String mdl,int  yl,int fyt){
      marka=mrk;
      model=mdl;
      yil=yl;
      fiyat=fyt;
    }

    public C01_Araba(String nissan, String note, String s, String s1) {
    }

    @Override
    public String toString() {
        return "Araba ozellikler==>"+
                "marka:'"+marka+'\''+
                ",model:'"+model+'\''+
                ",yil:"+yil+
                "fiyat="+fiyat;
    }
}
