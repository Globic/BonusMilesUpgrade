public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int priceTicket1 = 20000;
        int bonusMiles1 = service.calculate(priceTicket1);
        System.out.println("Вам начислят" + bonusMiles1);

        int priceTicket2 = -1;
        int bonusMiles2 = service.calculate(priceTicket2);
        System.out.println("Вам начислят" + bonusMiles2);

        int priceTicket3 = 1_000_000;
        int bonusMiles3 = service.calculate(priceTicket3);
        System.out.println("Вам начислят " + bonusMiles3);

        int priceTicket4 = 66;
        int bonusMiles4 = service.calculate(priceTicket4);
        System.out.println("Вам начислят " + bonusMiles4);

        int priceTicket5 = 0;
        int bonusMiles5 = service.calculate(priceTicket5);
        System.out.println("Вам начислят " + bonusMiles5);
    }
}
