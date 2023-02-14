package OneWeekJavaBasic;

public class Day4 {
    private void prob4_1() {
        int num = (int)(Math.random() * 10) + 1;
        System.out.println("数：" + num);
        for (int i = 0;i < num;i++) {
            System.out.print("▪");
        }
    }
    
    private void prob4_2() {
        int num = (int)(Math.random() * 10) + 1;
        System.out.println("数：" + num);
        
        int i= 0;
        while (i < num) {
            System.out.print("▪");
            i++;
        }
    }
    
    private void prob4_3() {
        int num = (int)(Math.random() * 10) + 1;
        System.out.println("数：" + num);
        
        int i= 0;
        do {
            System.out.print("▪");
            i++;
        } while (i < num);
    }
    
    private void prob4_4() {
        int a = 0;
        while (a < 4) {
            System.out.println("a = " + a);
            a++;
        }
    }
    
    private void prob4_5() {
        for (int i = 0;i < 4;i++) {
            System.out.println("a = " + i);
        }
    }
    
    private void prob4_6() {
        int a = 3;
        while (a >= 0) {
            System.out.println("a = " + a);
            a--;
        }
    }
    
    private void prob4_7() {
        for (int i = 3;i >= 0;i--) {
            System.out.println("a = " + i);
        }
    }
    
    private void prob4_8() {
        while (true) {
            int num = (int)(Math.random() * 10) + 1;
            System.out.println(num);
            if (num == 10) {
                System.out.println("終了します");
                break;
            }
        }
    }
    
    private void prob4_9() {
        while (true) {
            int num = (int)(Math.random() * 100) + 1;
            System.out.println(num);
            if (num % 10 == 0) {
                System.out.println("終了します");
                break;
            } 
        }
    }
    
    private void prob4_10() {
        for (int i = 0;i < 5;i++) {
            System.out.println((int)(Math.random() * 100) + 1);
        }
    }
    
    private void prob4_11() {
        int max = 0;
        for (int i = 0;i < 5;i++) {
            int num = (int)(Math.random() * 10) + 1;
            System.out.println(num);
            if (num > max) max = num;
        }
        System.out.println("最大値：" + max);
    }
    
    private void prob4_12() {
        int min = 10;
        for (int i = 0;i < 5;i++) {
            int num = (int)(Math.random() * 10) + 1;
            System.out.println(num);
            if (num < min) min = num;
        }
        System.out.println("最小値：" + min);
    }
    
    private void prob4_13() {
        int num = (int)(Math.random() * 10) + 1;
        if (num >= 5) {
            for (int i = 0;i < num;i++) {
                System.out.print("★");
            }
        } else {
            System.out.println("発生した数値：" + num);
        }
    }
    
    private void prob4_14() {
        int num = (int)(Math.random() * 10) + 1;
        String star = num % 2 == 0 ? "★" : "☆";
        for (int i = 0;i < num;i++) {
            System.out.print(star);
        }
    }
    
    private void prob4_15() {
        for (int i = 1;i <= 100;i++) {
            System.out.print(i + " ");
            if (i % 10 == 0) System.out.println();
        }
    }
    
    private void prob4_16() {
        for (int i = 1;i <= 9;i++) {
            for (int j = 1;j <= 9;j++) {
                System.out.print(String.format("%d*%d=%d ", i, j, i * j));
                if (j == 9) System.out.println();
            }
        }
    }
    
    private void prob4_17() {
        for (int i = 1;i <= 10;i++) {
            for (int j = 0;j < 10;j++) {
                System.out.print(i > j ? "■" : "□");
            }
            System.out.println();
        }
    }
    
    private void prob4_18() {
        for (int i = 0;i < 10;i++) {
            for (int j = 0;j < 10;j++) {
                System.out.print(i == j ? "■" : "□");
            }
            System.out.println();
        }
    }

    public static void main(String[] arg) {
        Day4 day4 = new Day4();
        day4.prob4_1();
        day4.prob4_2();
        day4.prob4_3();
        day4.prob4_4();
        day4.prob4_5();
        day4.prob4_6();
        day4.prob4_7();
        day4.prob4_8();
        day4.prob4_9();
        day4.prob4_10();
        day4.prob4_11();
        day4.prob4_12();
        day4.prob4_13();
        day4.prob4_14();
        day4.prob4_15();
        day4.prob4_16();
        day4.prob4_17();
        day4.prob4_18();
    }
}
