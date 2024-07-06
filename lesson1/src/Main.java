public class Main {
    public static void main(String[] args) {
        IBasbakan basbakan = new Basbakan();
        //interface'den gercek basbakan'a erisim sagliyoruz.
        BBKalemi bbKalemi = new BBKalemi(basbakan);
        Vatandas rica = new Vatandas(bbKalemi);
        rica.derdiniAnlat();
        rica.isIste();

        /*
        Durum şu: Vatandaş aslında bbKalemi ile görüşüyor.
        Ama vatandaş gerçek başbakan ile görüştüğünü sanıyor.
        Sistem çıktısıda gerçek başbakan'a ulaştınız şeklinde.

        Diğer önemli bir husus, vekilBaskan gercekBasbakan ' a
        interface üzerinden ulaşıyor.
        Basbakan instancesi yaratılmıyor. Interface'in instancesi yaratılıyor.

        Network sistemleri gibi modellemeye çalışırsam:
        Vatandaş : Kullanicidan gelen istek.
        BBKalemi: Kullanicidan gelen isteği gerekli yere gönderir.
        BBKalemi Interface'e baglanarak vekil'in bir instancesini alır.
        Bu şekilde istegin vekilemi yoksa gercek bakanami gittigi gizlenmis olur.
        Vekil: BBKaleminin göndermiş olduğu isteğin bakan'a yani bir üst katmana
        ulaşıp ulaşmayacağına karar verir. Üst katmana ulaşmasa bile isteği gönderen kişi
        üst katmana ulaştığı sonucunu görür.
        Basbakan: İstek tüm katmanları geçerek buraya geldi.

        Örneğin instagram web sitesine baglanmak istiyorsun.
        Eğer senin cihazın gerekli kontrolleri gecerse web sitesine erişirsin.
        Yoksa baglanti kurulamaz.
         */
    }
}