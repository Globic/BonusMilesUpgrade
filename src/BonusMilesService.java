public class BonusMilesService {
    public int calculate(int price) {
        int miles = price / 20;
        if (miles <= 0) {
            System.out.println("Стоимость билета не может быть отрицательной или равной 0");
        }
        return miles;
    }
}
