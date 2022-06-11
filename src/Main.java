public class Main {
    public static void main(String[] args) {
        Production prod = new Production();
        prod.Production();
        prod.Production(1000, 4);
        String info1 = prod.getValues();
        System.out.println(info1);
        prod.Production();
        prod.Production(2500, 4);
        String info2 = prod.getValues();
        System.out.println(info2);
        Home dom = new Home();
        dom.Production();
        dom.Production(100,2,20);
        String info3 = dom.getValues();
        System.out.println(info3);
        dom.Production();
        dom.Production(150,2,15);
        String info4 = dom.getValues();
        System.out.println(info4);
        Trade score = new Trade();
        score.Production();
        score.Production(300,3,10000);
        String info5 = score.getValues();
        System.out.println(info5);
        score.Production();
        score.Production(200,3,5000);
        String info6 = score.getValues();
        System.out.println(info6);
    }
}
