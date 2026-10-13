import java.util.List;

public class Cifrario {

    static public String cifra(String input, List<Integer> chiave){

        Lettera[] lettere = new  Lettera[input.length()];
        for (int i = 0; i < input.length(); i++){
            lettere[i] = new Lettera(input.charAt(i));
        }

        String out = "";
        int indiceChiave = 0;

        for (int i = 0; i < lettere.length; i++){
            if(lettere[i].cifrabile()){
                lettere[i].trasla(chiave.get(indiceChiave%chiave.size()), "+");
                indiceChiave++;
            }
            out += lettere[i].carattere;
        }
        return out;
    }

    static public String deCifra(String input, List<Integer> chiave){
        Lettera[] lettere = new  Lettera[input.length()];
        for (int i = 0; i < input.length(); i++){
            lettere[i] = new Lettera(input.charAt(i));
        }

        String out = "";
        int indiceChiave = 0;

        for (int i = 0; i < lettere.length; i++){
            if(lettere[i].cifrabile()){
                lettere[i].trasla(chiave.get(indiceChiave%chiave.size()), "-");
                indiceChiave++;
            }
            out += lettere[i].carattere;
        }

        return out;
    }
}
