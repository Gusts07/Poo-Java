package aula05;
public class Aula05 {
    public static void main(String[] args) {
     ContaBanco p1 = new ContaBanco();
     p1.setNumConta(11111111);
     p1.setDono("JUBILEU ABRAGÂO");
     p1.abrirConta("CC");

    
    ContaBanco p2 = new ContaBanco();
     p2.setNumConta(2222222);
     p2.setDono("CREUZA ASSUNÇÂO");
     p2.abrirConta("CP");
     
     p1.depositar(100);
     p2.depositar(500);
     p2.sacar(100);
     p1.sacar(150);
     p1.fecharConta();
     
     p1.estadoATual();
     p2.estadoATual();
    }
    
}