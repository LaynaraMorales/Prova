import lang.stride.*;

public class TesteUrna
{

    public static Urna urna;

    /**
     * 
     */
    static public void main(String[] args)
    {
        urna =  new  Urna();
        System.out.println("Total de votos feitos: " + urna.totalVotos());

        Candidato vereador1 =  new  Candidato("Lionel", "25.260.951-0", 1, 36251);
        Candidato vereador2 =  new  Candidato("Guilherme", "52.997.275-x", 1, 25999);
        Candidato vereador3 =  new  Candidato("Leticia", "20.620.360-8", 1, 75222);
        Candidato vereador4 =  new  Candidato("Linda", "50.000.633-1", 1, 12777);
        Candidato vereador5 =  new  Candidato("Maycon", "02.225.147-9", 1, 12666);
        System.out.println("Vereador 1 foi adicionado? " + urna.adicionarCandidato(vereador1) + "\n" + "Vereador 2 foi adicionado? " + urna.adicionarCandidato(vereador2) + "\n" + "Vereador 3 foi adicionado? " + urna.adicionarCandidato(vereador3)
        + "\n" + "Vereador 4 foi adicionado? " + urna.adicionarCandidato(vereador4) + "\n"+ "Vereador 5 foi adicionado? " + urna.adicionarCandidato(vereador5) + "\n"+ "Prefeito 6 foi adicionado? " + urna.adicionarCandidato( new  Candidato()));

        Candidato prefeito1 =  new  Candidato("Lucas", "10.265.223-0", 2, 30);
        Candidato prefeito2 =  new  Candidato("Murilo", "03.005.772-1", 2, 62);
        Candidato prefeito3 =  new  Candidato("Sandra", "21.520.036-3", 2, 95);
        Candidato prefeito4 =  new  Candidato("Nicole", "11.865.702-6", 2, 50);
        Candidato prefeito5 =  new  Candidato("João", "41.468.236-9", 2, 10);
        System.out.println("Prefeito 1 foi adicionado? " + urna.adicionarCandidato(prefeito1) + "\n" + "Prefeito 2 foi adicionado? " + urna.adicionarCandidato(prefeito2) + "\n" + "Prefeito 3 foi adicionado? " + urna.adicionarCandidato(prefeito3)
        + "\n" + "Prefeito 4 foi adicionado? " + urna.adicionarCandidato(prefeito4) + "\n"+ "Prefeito 5 foi adicionado? " + urna.adicionarCandidato(prefeito5) + "\n"+ "Prefeito 6 foi adicionado? " + urna.adicionarCandidato( new  Candidato()));

        Eleitor eleitor1 =  new  Eleitor("Mirella", "88.228.336-x");
        Eleitor eleitor2 =  new  Eleitor("Davi", "65.027.369-1");
        Eleitor eleitor3 =  new  Eleitor("Neide", "29.951.756-5");
        Eleitor eleitor4 =  new  Eleitor("Harry", "15.695.158-0");
        Eleitor eleitor5 =  new  Eleitor("Ravi", "08.351.220-9");

        urna.adicionarVoto(12345, 10, eleitor1);
        urna.adicionarVoto(12654, 90, eleitor2);
        urna.adicionarVoto(12345, 10, eleitor3);
        urna.adicionarVoto(69512, 10, eleitor4);
        urna.adicionarVoto(12654, 55, eleitor5);
        urna.adicionarVoto(69512, 53, eleitor5);
        System.out.println("Total de votos feitos: " + urna.totalVotos());
        urna.mostrarEleito();
    }
}
