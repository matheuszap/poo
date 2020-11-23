public class grupo {
    private pessoa[] pessoas = new pessoa[5];
    private int numeroPessoas = 0;

    public grupo() {

    }

    public void setPessoa(pessoa p) {
        if(this.numeroPessoas < 5) {
            pessoas[this.numeroPessoas] = p;
            this.numeroPessoas++;
        }
    }

    public void ordena() {
        for(int i=0; i<5; i++) {
            for(int j=i+1; j<5; j++) {
                if(this.pessoas[j].calculaImc() > this.pessoas[i].calculaImc()) {
                    pessoa aux = this.pessoas[j];
                    this.pessoas[j] = this.pessoas[i];
                    this.pessoas[i] = aux;
                }
            }
        }
    }
}
