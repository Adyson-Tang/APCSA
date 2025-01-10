
public class Pi {
    public static void main (String[] args) {
        Fraction MILU = new Fraction (355, 113);
        final double EPSILON = Math.abs( Math.PI - MILU.toDouble() );
        Fraction approx = new Fraction(31, 10);
        while (Math.abs(Math.PI - approx.toDouble()) >= EPSILON) {
            if (approx.toDouble() < Math.PI) {
                approx.setNum(approx.getNum() + 1);
            } else {
                approx.setDenom(approx.getDenom() + 1);
            }
        }
        System.out.println(approx);
    }
}
