public class Lettera {

    private static int min = 32;
    private static int max = 126;
    private static int n = max-min+1;

    public  char carattere;

    public  Lettera(char carattere){
        this.carattere = carattere;
    }

    public boolean cifrabile() {
        return carattere >= min && carattere <= max;
    }

    public  void trasla(int salto, String direzione){

        if(!cifrabile()){
            return;
        }

        int segno = direzione.equals("+") ? 1 : -1;
        int posizione = carattere-min;
        int nuova = posizione+(segno*salto);
        carattere = (char)(nuova+min);
    }
}
