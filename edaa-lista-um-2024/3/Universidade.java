public class Universidade {
        private String nome;
        private String rua;
        private String bairro;
        private String cidade;
        private String UF;
        private String CNPJ; 

        public Universidade(String nome, String rua){
            this.nome = nome;
            this.rua = rua;
        }

        public String getNome(){
            return nome;
        }

}
