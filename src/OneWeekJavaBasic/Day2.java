package OneWeekJavaBasic;

public class Day2 {
    private void prob2_1() {
        int a = 5, b = 3;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
    }

    private void prob2_2() {
        int a = 1,b = 2,c = 3,d = 4,e = 5;
        a += 2;  //  aに2を加える
        b -= 1;  //  bから1を引く
        c *= 3;  //  cに3をかける
        d /= 2;  //  dを2で割る
        e %= 2;  //  eに、eを2で割った余りを代入する
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
    }

    public static void main(String[] args) {
        Day2 day2 = new Day2();
        day2.prob2_1();
        day2.prob2_2();
    }
}
