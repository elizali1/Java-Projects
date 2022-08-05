public class CardRecordTest {
    public static void main(String[] args) {
        Card tenOfDiamonds = new Card("diamonds", "10");
        System.out.println(tenOfDiamonds);
    }
}

record Card(String suit, String number) {}
