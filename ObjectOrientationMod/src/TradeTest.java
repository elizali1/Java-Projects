package src;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;

class TradeTest {
    public static void main(String[] args){
        Trade newTrade = new Trade("Apple","APL", 1, 1.99);
        System.out.println(newTrade.toString());
    }

}