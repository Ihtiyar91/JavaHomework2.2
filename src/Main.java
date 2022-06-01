public class Main {
    public static void main(String[] args) {
        int basic = 100;
        int addition = 500;
        int bonus;
        if (addition > 1000) {
            bonus = basic + addition + addition / 100;
        } else {
            bonus = basic + addition;
        }
        System.out.println(" Итоговая сумма " +  bonus);
    }
}
