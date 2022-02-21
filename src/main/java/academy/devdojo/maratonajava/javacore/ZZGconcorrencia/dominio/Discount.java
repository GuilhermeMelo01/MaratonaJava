package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio;


public class Discount {
    public enum Code {
        NONE(0), SUPER_SAYAJIN(5), SUPER_SAYAJIN2(10), SUPER_SAYAJI3(15);
        private final int percentage;

        Code(int parcentage) {
            this.percentage = parcentage;
        }

        public int getPercentage() {
            return percentage;
        }
    }
}
