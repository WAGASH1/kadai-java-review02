package sample;

public class Review01 {

    public static void main(String[] args) {
        int price = 1400; //原価
        int rate = 10; //消費税率（%）
        int consumption = tax(price,rate);
        int total = price + consumption;
        System.out.println(price + "円の商品の税込価格は" + total + "円" + "（消費税は" + consumption + "円）です。");


    }
    public static int tax(int num1, int num2) {
        int result = num1 * num2 / 100;
        return result;
    }
}
