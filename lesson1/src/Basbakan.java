public class Basbakan implements IBasbakan {
    Basbakan(){
        //System.out.println("Gerçek basbakan size ulasiyor.");
    }

    @Override
    public String dertDinle(String dert) {
        System.out.println("Basbakan: Dert dinliyor.");
        return dert;
    }

    @Override
    public String isBul(String cozum) {
        System.out.println("Basbakan: İş bulmayla ilgilenmiyorum.");
        return cozum;
    }
}
