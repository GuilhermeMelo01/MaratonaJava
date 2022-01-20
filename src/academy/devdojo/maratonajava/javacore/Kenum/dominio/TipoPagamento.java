package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum TipoPagamento {
    CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    }, DEBITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public double calcularDesconto(double valor){
        return 0;
    }
}
