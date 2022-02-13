public class ProgrammBeforeChange {
    public int x = 12;
    public double y = 6;
    public String s = "Hello";
    public double d;
    ProgrammBeforeChange() {
        d = x * (int) y;
    }
    public static void main(String[] args) {
        ProgrammBeforeChange programmBeforeChangeChange = new ProgrammBeforeChange();
        System.out.println((int)programmBeforeChangeChange.d);    }
    }

