public class Home {
    Integer square;
    Integer taxK;
    Integer cash;
    Integer subsidy;

    public void Production() {
        System.out.print("Налог на недвижимость для дома: ");
    }

    public void Production(Integer square, Integer taxK,Integer subsidy) {
        this.square = square;
        this.taxK = taxK;
        this.subsidy = subsidy;
    }

    public String getValues() {
        cash = square * taxK - (square * taxK * subsidy/100);
        String info = "При площади " + square + "м2 и налоге " + taxK + "$ за 1 м2, минус субсидия хозяина " + subsidy + "% Вы заплатите " + cash + "$";
        return info;
    }
}
