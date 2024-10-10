public class ProvaUCB extends Provauniversidade {
    public ProvaUCB(double n1, double n2) {
        super(n1, n2);
    }
    public boolean aprovado(){
        double media=calcularMedia();
        if(media>=7){
            System.out.println("Aluno aprovado na faculdade UCB");
             return true;
        }else{
            System.out.println("Aluno reprovado na faculdade UCB");
            return false;
        }
    }

}