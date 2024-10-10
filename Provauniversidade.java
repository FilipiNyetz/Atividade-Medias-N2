public class Provauniversidade {
    double n1;
    double n2;

    public Provauniversidade(double n1,double n2) {
        this.n1 = n1;
        this.n2=n2;
    }
    public double calcularMedia() {
        return (n1 + n2) / 2; // Calcula a média usando as variáveis de instância
    }
}
