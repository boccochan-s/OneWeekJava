package OneWeekJavaBasic;

public class Day3 {
    private void prob3_1(int dice) {
        if (dice >= 5) System.out.println("5以上です");
    }

    private void prob3_2(int dice) {
        if (dice != 1) System.out.println("1ではありません");
    }

    private void prob3_3(int dice) {
        if (dice < 50) System.out.println("50未満です");
    }

    private void prob3_4(int dice) {
        if (dice <= 10 || dice >= 90) System.out.println("10以下か90以下です");
    }
    
    private void prob3_5(int dice) {
        if (dice >= 20 && dice < 80) System.out.println("20以上80未満です");
    }
    
    private void prob3_6() {
        int dice = (int)(Math.random() * 6) + 1;
        System.out.println("数値：" + dice);
        if (dice >= 3) System.out.println("3以上です。");
    }
    
    private void prob3_7(int dice) {
        String comment = dice >= 5 ? "5以上です" : "5未満です";
        System.out.println(comment);
    }

    private void prob3_8(int dice) {
        String comment = dice == 1 ? "1です。" : "1ではありません";
        System.out.println(comment);
    }

    private void prob3_9(int dice) {
        String comment = dice >= 50 ? "50以上です" : "50未満です";
        System.out.println(comment);
    }

    private void prob3_10(int dice) {
        String comment = dice <= 10 || dice >= 90 ? "10以下か90以上の値です" : "10より大きく90未満です";
        System.out.println(comment);
    }
    
    private void prob3_11(int dice) {
        String comment = dice >= 20 && dice <= 80 ? "20以上80未満です" : "20未満か、80以上です";
        System.out.println(comment);
    }
    
    private void prob3_12() {
        int num = (int)(Math.random() * 20) - 10;
        System.out.println(num);
        if (num < 0) {
            System.out.println("負の値です");
        } else if (num > 0) {
            System.out.println("正の値です");
        } else {
            System.out.println("0です");
        }
    }
    
    private void prob3_13() {
        int janken = (int)(Math.random() * 3) + 1;
        System.out.println(janken);
        switch (janken) {
        case 1:
            System.out.println("グー");
            break;
        case 2:
            System.out.println("チョキ");
            break;
        case 3:
            System.out.println("パー");
            break;
        default:
            break;
        }
    }

    private void prob3_14() {
        int a = (int)(Math.random() * 10) + 1;
        int b = (int)(Math.random() * 10) + 1;
        System.out.println("a: " + a + ", b: " + b);
        if (a > b) {
            System.out.println("aのほうが大きいです。");
        } else if (a < b) {
            System.out.println("bのほうが大きいです。");
        } else {
            System.out.println("等しいです");
        }
    }

    private void prob3_15(int score) {
        if (score >= 80) {
            System.out.println("優");
        } else if (score < 80 && score >= 70) {
            System.out.println("良");
        } else if (score < 70 && score >= 60) {
            System.out.println("可");
        } else {
            System.out.println("不可");
        }
    }

    private void prob3_16(int dice) {
        if (dice % 6 == 0) {
            System.out.println("2と3の公倍数です。");
        } else if (dice % 3 == 0) {
            System.out.println("3の倍数です。");
        } else if (dice % 2 == 0) {
            System.out.println("2の倍数です。");
        }
    }
    
    private void prob3_17(int dice) {
        if (dice <= 50 && dice % 2 == 0) {
            System.out.println("50以下の偶数です。");
        } else if (dice % 2 == 0) {
            System.out.println("偶数です。");
        } else if (dice <= 50) {
            System.out.println("50以下です。");
        }
    }
    
    private void prob3_18() {
        int temperature = (int)(Math.random() * 45) - 10;
        System.out.println(temperature);
        if (temperature >= 30) {
            System.out.println("真夏日です。");
        } else if (temperature >= 25 && temperature < 30) {
            System.out.println("夏日です。");
        } else if (temperature < 0) {
            System.out.println("真冬日です。");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Day3 day3 = new Day3();
        int diceTen = (int)(Math.random() * 10) + 1;
        int diceHundred = (int)(Math.random() * 100) + 1;

        day3.prob3_1(diceTen);
        day3.prob3_2(diceTen);
        day3.prob3_3(diceHundred);
        day3.prob3_4(diceHundred);
        day3.prob3_5(diceHundred);
        day3.prob3_6();
        day3.prob3_7(diceTen);
        day3.prob3_8(diceTen);
        day3.prob3_9(diceHundred);
        day3.prob3_10(diceHundred);
        day3.prob3_11(diceHundred);
        day3.prob3_12();
        day3.prob3_13();
        day3.prob3_14();
        day3.prob3_15(diceHundred);
        day3.prob3_16(diceHundred);
        day3.prob3_17(diceHundred);
        day3.prob3_18();
    }
}
