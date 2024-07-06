public class VekilBasbakan implements IBasbakan {
    private IBasbakan basbakan;
    public VekilBasbakan(IBasbakan basbakan){
        this.basbakan = basbakan;
    }

    @Override
    public String dertDinle(String dert) {
        System.out.println("Vekil: derdinizi dinliyorum.");


        boolean ayiklananIstekler = ayikla(dert);
        if (ayiklananIstekler){
            ilet(dert);
        }
        return dert;
    }

    @Override
    public String isBul(String cozum) {
        System.out.println("Vekil: İş isteğinizi dinliyorum. Bakana iletmiyeceğim ama sen yinede anlat");
        return cozum;
    }

    private boolean ayikla(String dert){
        boolean sonuc = true;
        //... kontrol mekanizmalari
        return sonuc;
    }

    /*
    ayiklama ve iletme gibi metodlar gizli olmali.
    vekil olma, aracı olma durumundan karşımızdaki kişinin
    haberi olmamalı.
     */

    private void ilet(String dert){
        basbakan.dertDinle(dert);
    }
}
