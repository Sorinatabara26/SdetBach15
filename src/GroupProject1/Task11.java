package GroupProject1;

public class Task11 {
    public static void main(String[] args) {
    String [] words = {"Java" ,"Fun","Java","Fun","Done"};
    for (int i = 0; i < words.length; i++) {
        for (int j = i + 1; j < words.length; j++) {
            if (words[i] == words[j]){
                System.out.println( " The duplicate words are :  " + words[j]);
            }

        }
    }
}




}
