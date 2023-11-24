package TestConNicola;
//Scrivere un metodo che calcoli la somma
// di tutti i numeri dispari all’interno dell’array e stampi l’informazione a video.

//mplementare una funzione che, dato un array di stringhe, verifichi la presenza di una stringa
// di lunghezza specifica inserita dall'utente e restituisca il risultato della ricerca sotto forma di
// valore booleano (true o false). Il risultato dovrebbe essere visualizzato a video.
public class Exercise {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        System.out.println(sumOdds(array));

        String [] array2= {"this is the string","this is another string"};
    }

    public static boolean check(String[] stringInput, int lengthInput){
        boolean result = false;
        for(String i :stringInput){
            if(i.length()==lengthInput){
                result=true;
                break;
            }
        }
        return result;
    }



    public static int sumOdds(int[] arrayInput) {
        int sum = 0;
        for (int i = 0; i < arrayInput.length; i++) {
            if (arrayInput[i] % 2 != 0) {
                sum += arrayInput[i];
            }
        }

        return sum;
    }
}