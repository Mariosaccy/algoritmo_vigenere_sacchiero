void main() {

    Scanner sc = new Scanner(System.in);

    System.out.println("Inserire lunghezza chiave: ");
    int lunghezza;

    do{
        try {
            lunghezza = Integer.parseInt(sc.nextLine().trim());
            if (lunghezza <= 0) {
                System.out.println("Deve essere maggiore di 0.");
            }
        } catch (Exception e) {
            System.out.println("numero non valido");
            lunghezza = 0;
        }
    } while (lunghezza <= 0);

    int[] chiave = new int[lunghezza];

    boolean errore;

    for (int i = 0; i < lunghezza; i++){
        System.out.println("inserisci cifra n " + (i+1) + " della chiave: ");
        do{
            try {
                errore = false;
                chiave[i] = Integer.parseInt(sc.nextLine().trim());
            } catch (Exception e) {
                System.out.println("numero non valido");
                errore = true;
            }
        } while (errore);
    }

    System.out.println("Cifrare-1  Decifrare-2 : ");
    int scelta;
    do{
        try {
            scelta = Integer.parseInt(sc.nextLine().trim());
            if (scelta != 1 || scelta != 2) {
                System.out.println("Deve essere 1 o 2");
            }
        } catch (Exception e) {
            System.out.println("numero non valido");
            scelta = 0;
        }
    } while (scelta == 0);

    System.out.println("inserisci testo: ");
    String input = sc.nextLine().trim().toUpperCase();

    String out;
    if(scelta == 1){
        out = Cifrario.cifra(input, chiave);
    } else {
        out = Cifrario.deCifra(input, chiave);
    }

    System.out.println("output: " + out);


}
