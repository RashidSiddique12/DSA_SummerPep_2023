// package Oops;

class Hello {
    private int value1;
    public int value2;

    Hello() {
        System.out.println("Default Constuctor");
    }

    Hello(int x, int y) {
        value1 = x;
        value2 = y;
    }

    // public void setvalue(int x) {
    // value1 = x;

    // }

    public void getvalue() {
        System.out.println("value1 : " + value1);
    }

}

public class main1 {
    public static void main(String[] args) {
        Hello h = new Hello();
        Hello h1 = new Hello(10, 20);
        // h1.value2 = 20;
        // h1.setvalue(10);
        h1.getvalue();
        System.out.println("value2 : " + h1.value2);

    }
}
