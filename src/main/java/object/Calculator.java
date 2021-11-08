package object;

public class Calculator {

    public int currentTotal;
    private int a;
    private int b;

    public Calculator(){
        this.a = 0;
        this.b = 0;
    }
    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int sum(int i, int i1, String s){
        return a + b;
    }
    public int subtract(int i){
        return a - b;
    }
    public int div(int i){return a / b;}
    public int mult(int i){return a * b;}

    public void equal(String s) {}
    public void add(int i) {}
}
