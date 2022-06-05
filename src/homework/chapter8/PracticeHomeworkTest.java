package homework.chapter8;

public class PracticeHomeworkTest {
    public static void main(String[] args) {
        PracticeHomework ph = new PracticeHomework();
        System.out.println(ph.convert(1));
        System.out.println(ph.calcAge(2));
        System.out.println(ph.nextNumber(15));
        System.out.println(ph.isSameNum(4, 5));
        System.out.println(ph.lessThanOrEqualToZero(32));
        System.out.println(ph.reverseBool(true));
        System.out.println(ph.maxLength(new int[21], new int[14]));
    }
}
