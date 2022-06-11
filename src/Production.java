public class Production {
    Integer square;
    Integer taxK;
    Integer cash;

    public void Production() {
        System.out.print("Налог на недвижимость для производств: ");
    }

    public void Production(Integer square, Integer taxK) {
        this.square = square;
        this.taxK = taxK;
    }

    public String getValues() {
        cash = square * taxK;
        String info = "При площади " + square + "м2 и налоге " + taxK + "$ за 1 м2 Вы заплатите " + cash + "$";
        return info;
    }
}
