public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("21655205");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            //TODO Auto-generated catch block
            System.out.println("CEP não corresponde as regras de negócio.");;
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return cep;
    }
}
