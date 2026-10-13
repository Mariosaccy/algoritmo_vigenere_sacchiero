import java.util.List;

public class Cifrario {

    static public String cifra(String input, List<Integer> chiave){

        Lettera[] lettere = new  Lettera[input.length()];
        for (int i; i < input.length(); i++){
            lettere[i] = new Lettera(input[i]);
        }

        String out = "";

        for (int i = 0; i < input.length(); i++){
            int carattere = caratteri[i];
            int caratterFin = carattere + chiave.get(i%chiave.size());
            out += (char)caratterFin;
        }

        return out;

    }
}
