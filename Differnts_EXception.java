/// Realisé par : Younes Sghyer 
import java.util.Scanner;

class Main {

  public static boolean isNumeric(String s) {
    try {
      Integer.parseInt(s);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }

  public static int forcNumeric(String s) {
    return Integer.parseInt(s);

  }

  public static void main(java.lang.String[] args) {

    int n, i, note;
    boolean Test = true;
    boolean Test_2 = true;
    String nn, note_string;

    Scanner s = new Scanner(System.in);

    do {

      System.out.println("Ecrire le nombre des etudiants : ");

      nn = s.nextLine();
      Test = isNumeric(nn);

    } while (Test != true);

    n = forcNumeric(nn);
    for (i = 0; i < n; i++) {
      do {

        System.out.printf("\n Entrer la note : %d \n", (i + 1));
        note_string = s.nextLine();
        Test_2 = isNumeric(note_string);
        note = forcNumeric(note_string);

      } while (Test_2 != true || note > 20);

      if (note < 10) {
        System.out.println("\t échec");

      } else if (note >= 10 && note < 12) {
        System.out.println("\t passable");

      } else if (note >= 12 && note < 14) {
        System.out.println("\t assez bien");

      } else if (note >= 14 && note < 16) {
        System.out.println("\t bien");

      } else if (note >= 16) {
        System.out.println("\t très bien");

      }

    }
  }
}

