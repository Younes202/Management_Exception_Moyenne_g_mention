/// Realisé par : Younes Sghyer 
import java.util.Scanner;

class Main {

  public static boolean isNumeric(String s) {   // Fonction qui vérifier est ce que la valeur entrée  nombre ou non 
    try {
      Integer.parseInt(s);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }

  public static int forcNumeric(String s) {  // Fonction qui forcer un nombre de type string à un nombre de type integer
    return Integer.parseInt(s);

  }

  public static void main(java.lang.String[] args) {

    int n, i, note;
    boolean Test = true;
    boolean Test_2 = true;
    String nn, note_string;

    Scanner s = new Scanner(System.in);
    // Pr tache : La vérification (Implémentation de la méthode isNumeric()) est ce que le nombre qui va entrer de type int ou non 
    do {

          System.out.println("Ecrire le nombre des etudiants : ");

          nn = s.nextLine();
          Test = isNumeric(nn);

    } while (Test != true);
  
        // dm tache :  (Implémentation de la méthode forcNumeric()) pour rendre le nombre de type string à un entier 

          n = forcNumeric(nn);
       // Donner la main pour insertion des notes 
   
    for (i = 0; i < n; i++) {
      
        // Tester sur la valeur de note Entrer et on a fait l'attention même à  les exceptions suivants
        // 1 : il ne faut pas accepter n'importe qu'il valeur  sauf s'il est entier  (Dans ce cas on a choisit les notes comme des entiers)
        // 1 : il ne faut pas accepter une valeur > 20  
        do {

            System.out.printf("\n Entrer la note : %d \n", (i + 1));
            note_string = s.nextLine();
            Test_2 = isNumeric(note_string);
            note = forcNumeric(note_string);

        }while (Test_2 != true || note > 20);
        // 1 : si les valeurs qu'on a entrées est compatible avec les excigences qu'on a fait , les tests suivants seront exécutés [Félicitations : hhh]   

         if (note < 10) {
             System.out.println("\t Echec");
           }
         else if (note >= 10 && note < 12) {
             System.out.println("\t Passable");
           }
         else if (note >= 12 && note < 14) {
             System.out.println("\t Assez bien");
           }
         else if (note >= 14 && note < 16) {
             System.out.println("\t Bien");
           }
         else if (note >= 16) {
             System.out.println("\t Très bien");
           }

    }
  }
}

