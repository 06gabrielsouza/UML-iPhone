public class iPhone {
    public static void main(String[] args) throws Exception {

        reprodutorMusical rep = new reprodutorMusical();
        aparelhoTelefonico apa = new aparelhoTelefonico();
        navegadorInternet nav = new navegadorInternet();

         rep.tocar();
         rep.pausar();
         rep.selecionarMusica("Orochi- Balão");

         apa.numero("8198423-7977");
         apa.atender();
         apa.iniciarCorreioVoz();

         nav.adicionarNovaAba();
         nav.atualizarPagina();
         nav.exibirPagina("google.com");
        
    }
}
