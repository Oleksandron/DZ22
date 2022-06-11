public class Trade {
    Integer square;
    Integer taxK;
    Integer cash;
    Integer cashRegister;

    public void Production() {
        System.out.print("Налог на недвижимость для торговли: ");
    }

    public void Production(Integer square, Integer taxK,Integer cashRegister) {
        this.square = square;
        this.taxK = taxK;
        this.cashRegister = cashRegister;
    }

    public String getValues() {
        if (cashRegister <= 100 ) {
            System.out.println("Ваша выручка меньше 100, налог не взымается");
        } else
            cash = square * taxK;
            String info = "При площади " + square + "м2 и налоге " + taxK + "$ за 1 м2 Вы заплатите " + cash + "$";
            return info;

    }
}
