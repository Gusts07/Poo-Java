package aula12;
public class Aula12 {
public static void main(String[] args) {
    Mamifero m = new Mamifero();
    Reptil r = new Reptil();
    Peixe p = new Peixe();
    Ave a = new Ave();
    
    m.setPeso(35.3f);
    m.setCorPelo("Amarelo");
    m.alimentar();
    m.emitirSom();
    m.locomover();
    
    
    
    }   
}
