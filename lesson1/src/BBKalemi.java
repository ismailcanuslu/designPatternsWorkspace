public class BBKalemi {
    private IBasbakan basbakan;
    BBKalemi(IBasbakan basbakan){
        this.basbakan = new VekilBasbakan(basbakan);
    }

    /*
    Vatandaş başbakan'ı istiyor. Sistemse ona vekilBasbakan' ı gönderiyor.
    interface'in doğrudan bir nesnesi olması zaten mümkün değildir.
    burada ya gercekBasbakan ya da vekil'i döndürecegiz.
    Biz interface'ye baglanip vekilBasbakan döndürdük.
    Böyle yaparak gerçekte kime baglandigimizi vatandastan gizledik.
     */
    public IBasbakan banaBakaniGetir(){
        System.out.println("BBKalemi: Bakanı sana getiriyorum...");
        return basbakan;
    }
}
