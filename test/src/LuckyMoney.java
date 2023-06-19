public class LuckyMoney {
    public static void main(String args[]){
        int money = 12;
        int giftees = 2;
        System.out.println(luckyMoney(money, giftees));

    }

    public static int luckyMoney(int money, int giftees){
        int gifteesEnough = money/8;
        int moneyLeft = money%8;
        int gifteesLeft = giftees-gifteesEnough;
        if(gifteesEnough>=giftees){
            return giftees;
        }else{
            if(giftees-gifteesEnough == 1&&moneyLeft==0){
                gifteesEnough--;
                moneyLeft=8;
            }
            if(moneyLeft/gifteesLeft==4){
                return 0;
            }else return gifteesEnough;
        }

    }
}
