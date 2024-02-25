public class Programa{
public static void main(String[] args) {
    Cachorro cachorro = new Cachorro();
    cachorro.setId(1);
    cachorro.setIdade(10);
    cachorro.setNome("Thor");
    System.out.println(cachorro.getNome());
    System.out.println(cachorro.getIdade());
    System.out.println(cachorro.getId());

}



}