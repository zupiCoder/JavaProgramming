
public class Test41 {

    private static final boolean T = true;
    private static final boolean F = false;

    public static void main(String[] args) {
        Cetrta.Ovojnik ovojnik = new Cetrta.Ovojnik(new boolean[][]{
            {F, F, F, F, F, F, F, F, F, F, F},
            {F, F, F, F, F, F, F, F, F, F, F},
            {F, F, F, F, F, F, F, F, F, F, F},
            {F, F, F, F, F, F, F, F, F, F, F},
            {F, F, F, F, F, F, F, T, F, F, F},
            {F, F, F, T, F, F, F, F, F, F, F},
            {F, F, F, F, F, F, T, T, F, F, F},
            {F, F, F, F, F, F, F, F, F, F, F},
            {F, F, F, F, F, F, T, F, F, F, F},
            {F, F, F, F, F, F, F, F, F, F, F},
            {F, F, F, F, F, F, F, F, F, F, F},
        });
        for (Cetrta.Celica celica: ovojnik) {
            System.out.println(celica);
        }
    }
}
