
public class Test39 {

    private static final boolean T = true;
    private static final boolean F = false;

    public static void main(String[] args) {
        Cetrta.Ovojnik ovojnik = new Cetrta.Ovojnik(new boolean[][]{
            {T, F, T, F, T, T, F, F, F, T, F, F, F, T, F, F, F, F, F, F, T},
            {F, T, T, F, F, T, F, T, T, F, T, T, T, F, F, T, T, T, F, F, F},
            {T, F, F, F, F, F, T, F, F, T, F, F, T, F, F, T, T, F, F, T, F},
            {F, T, T, F, T, F, F, F, F, T, T, T, T, F, T, F, T, T, T, F, T},
            {T, F, F, F, T, T, T, F, F, T, T, T, F, F, T, T, T, F, F, F, T},
            {F, T, F, F, T, T, F, F, F, T, F, T, F, F, T, T, F, F, T, T, F},
            {F, F, T, T, F, T, F, F, T, T, F, F, T, F, T, F, F, F, F, F, F},
            {F, F, T, F, T, T, T, F, F, F, F, F, T, F, F, F, F, F, T, F, T},
            {F, F, F, F, T, T, F, T, T, F, T, T, T, T, F, F, F, T, T, T, T},
            {F, T, F, F, T, F, T, F, F, T, T, T, F, F, T, T, T, F, F, T, F},
            {T, T, F, F, F, F, F, F, F, T, T, F, T, F, T, T, T, F, F, F, F},
            {F, F, T, T, T, T, F, T, F, F, T, F, F, F, F, F, T, F, F, T, F},
            {F, F, T, F, F, T, T, F, T, T, F, F, F, F, F, F, F, F, T, T, T},
            {F, F, F, F, F, F, F, F, F, F, F, T, T, F, T, F, T, F, T, F, T},
            {F, F, F, F, T, F, F, F, T, T, F, T, T, F, F, F, F, T, T, F, F},
            {F, T, F, T, F, T, F, F, T, T, F, F, T, F, F, F, F, T, F, F, F},
            {F, F, F, F, T, F, F, F, F, F, F, T, T, T, F, T, F, F, T, F, T},
            {F, F, T, F, F, T, T, F, T, F, T, F, F, F, F, F, F, F, F, F, T},
            {F, F, F, T, F, F, T, F, T, F, F, F, F, T, T, F, T, F, F, F, F},
            {F, F, F, T, F, T, T, F, F, F, F, F, F, T, T, F, F, F, T, F, F},
            {F, F, F, T, F, F, T, T, F, T, F, F, T, F, F, F, T, T, F, T, F},
        });
        for (Cetrta.Celica celica: ovojnik) {
            System.out.println(celica);
        }
    }
}
