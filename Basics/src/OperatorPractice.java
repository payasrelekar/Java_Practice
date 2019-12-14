public class OperatorPractice {
    public static void main(String[] args) {
            // if int a = 010
            // Java considers it as octal value
            // of 8 as number starts with 0.
            int a = 0x0005;
            int b = 0x0006;

            long c = 0xfffffff;

            System.out.println(a);
            System.out.println(c);

            // bitwise and
            // 0101 & 0110=
            System.out.println("a&b = " + (a & b));

            // bitwise or
            // 0101 | 0111=0111
            System.out.println("a|b = " + (a | b));

            // bitwise xor
            // 0101 ^ 0111=0010
            System.out.println("a^b = " + (a ^ b));

            // bitwise and
            // ~0101=1010
            System.out.println("~a = " + ~a);

            // can also be combined with
            // assignment operator to provide shorthand
            // assignment
            // a=a&b
            a &= b;
            System.out.println("a= " + a);

//            Float f = new Float("3.0");
//            byte bt = f.byteValue();
//            byte bt2 = (byte)f.value;

            System.out.println("----------------------------");
            System.out.println(2.5/2);

            System.out.println((int)2.5/(float)2);
    }
}
