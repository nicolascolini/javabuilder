public class Cafe {
    private String tipoGrao;
    private int quantidadeAgua;
    private int quantidadeLeite;
    private String tamanho;

    // Construtor privado para obrigar o uso do Builder
    private Cafe(CafeBuilder builder) {
        this.tipoGrao = builder.tipoGrao;
        this.quantidadeAgua = builder.quantidadeAgua;
        this.quantidadeLeite = builder.quantidadeLeite;
        this.tamanho = builder.tamanho;
    }

    // Getters para acessar as propriedades do Café
    public String getTipoGrao() {
        return tipoGrao;
    }

    public int getQuantidadeAgua() {
        return quantidadeAgua;
    }

    public int getQuantidadeLeite() {
        return quantidadeLeite;
    }

    public String getTamanho() {
        return tamanho;
    }

    // Classe estática Builder
    public static class CafeBuilder {
        private String tipoGrao;
        private int quantidadeAgua;
        private int quantidadeLeite;
        private String tamanho;

        // Métodos para definir cada propriedade do Café
        public CafeBuilder setTipoGrao(String tipoGrao) {
            this.tipoGrao = tipoGrao;
            return this;
        }

        public CafeBuilder setQuantidadeAgua(int quantidadeAgua) {
            this.quantidadeAgua = quantidadeAgua;
            return this;
        }

        public CafeBuilder setQuantidadeLeite(int quantidadeLeite) {
            this.quantidadeLeite = quantidadeLeite;
            return this;
        }

        public CafeBuilder setTamanho(String tamanho) {
            this.tamanho = tamanho;
            return this;
        }

        // Método para construir o objeto Cafe com as propriedades definidas
        public Cafe build() {
            return new Cafe(this);
        }
    }

    @Override
    public String toString() {
        return "Cafe{" +
                "tipoGrao='" + tipoGrao + '\'' +
                ", quantidadeAgua=" + quantidadeAgua +
                ", quantidadeLeite=" + quantidadeLeite +
                ", tamanho='" + tamanho + '\'' +
                '}';
    }

    // Método main para testar o Builder
    public static void main(String[] args) {
        Cafe cafe = new Cafe.CafeBuilder()
                .setTipoGrao("Cappuccino")
                .setQuantidadeAgua(100)
                .setQuantidadeLeite(100)
                .setTamanho("Médio")
                .build();

        System.out.println(cafe);
    }
}