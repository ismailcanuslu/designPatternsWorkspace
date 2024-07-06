public class Vatandas {
    private IBasbakan basbakan;
    public Vatandas(BBKalemi bbKalemi){
        basbakan = bbKalemi.banaBakaniGetir();
    }
    public String derdiniAnlat(){
        basbakan.dertDinle("Mor ve Ötesi - Bir Derdim Var...");
        return "baskanla dertlerimi konustum!!!";
    }
    public String isIste(){
        basbakan.isBul("is lazimdir abey.");
        return "baskanla is hakkinda konustum!!!";
    }
}
