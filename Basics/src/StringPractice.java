public class StringPractice {
    int i;
    String name = "qqq";

    StringPractice(int ival, String nameval) {
        i = ival;
        name = nameval;
    }

    @Override
    public int hashCode() {
        return this.i;
    }

    @Override
    public boolean equals(Object o) {
        return this.hashCode() == o.hashCode();
    }

    public static void main(String[] args) {
        String one = "abcd";
        String two = "qwer";
        String three = "abcd";

        if(one == two) {
            System.out.println("one==two");
        }
        if(one == three) {
            System.out.println("one == three");
        }
        if(two == three) {
            System.out.println("two == three");
        }
        if(one.equals(two)) {
            System.out.println("one.equals(two)");
        }
        if(one.equals(three)) {
            System.out.println("one.equals(three)");
        }
        if(two.equals(three)) {
            System.out.println("two.equals(three)");
        }

        System.out.println("--------------------");

        one = "two";

        if(one.equals(three)) {
            System.out.println("one.equals(three)_second");
        }
        if(one == three) {
            System.out.println("one == three_second");
        }

        System.out.println("--------------------");

        three = "two";

        if(one.equals(three)) {
            System.out.println("one.equals(three)_third");
        }
        if(one == three) {
            System.out.println("one == three_third");
        }

        System.out.println("--------------------");

        StringPractice sp1 = new StringPractice(0, "sp1");
        StringPractice sp2 = new StringPractice(2, "sp2");
        StringPractice sp3 = new StringPractice(2, "sp3");

        System.out.println(sp1.i);
        System.out.println(sp2.i);
        System.out.println(sp3.i);

        System.out.println("--------------------");

        System.out.println(sp2);
        System.out.println(sp3);

        System.out.println("--------------------");

        if(sp2 == sp3) {
            System.out.println("sp1 == sp2");
        }
        if(sp2.equals(sp3)) {
            System.out.println("sp1.equals(sp2)");
        }
    }


}
