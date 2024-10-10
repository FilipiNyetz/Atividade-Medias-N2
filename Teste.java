//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Teste {
    public static void main(String[] args) {
        ProvaUCB alunoUCB = new ProvaUCB(2, 2);
        alunoUCB.aprovado();

        ProvaFafifo alunoFafifo = new ProvaFafifo(6,6);
        alunoFafifo.aprovado();
    }
}