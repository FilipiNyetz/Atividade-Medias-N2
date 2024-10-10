public class ProvaFafifo extends Provauniversidade {
    public ProvaFafifo(double n1, double n2) {
        super(n1, n2);
    }
    public boolean aprovado(){
        double media=calcularMedia();
        if(media>=6){
            System.out.println("Aluno aprovado na faculdade Fafifo");
            return true;
        }else{
            System.out.println("Aluno reprovado na faculdade Fafifo");
            return false;
        }
    }

}