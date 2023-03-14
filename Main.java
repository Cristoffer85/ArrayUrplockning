/*
Du ska använda && (AND), || (OR), Continue, Break, If, For eller While

        Du har en lista på 10 personer, med namn och ålder.
        Du ska skriva ett program som går igenom listan med personer och skriver ut alla personer som uppfyller vissa kriterier.

        1. Skriv ut alla personer som är under 20 år.
        2. Skriv ut alla personer som är 20 år och alla som är under 30 år.
        3. Skriv ut alla personer som är yngre än 20 år och alla som är äldre än 29 år.
        4. Visa namn och ålder på äldsta och yngsta karaktären (1 av varje)
        5. Visa en lista på alla personer som har jämna tal i sin ålder
        6. Visa alla namn men stoppa körningen vid första person över 40 år.
*/
public class Main {
    public static void main(String[] args) {

        String[] namn = {"Elena Gilbert", "Stefan Salvatore", "Damon Salvatore", "Caroline Forbes", "Bonnie Bennett", "Tyler Lockwood", "Matt Donovan", "Alaric Saltzman", "Klaus Mikaelson", "Rebekah Mikaelson"};
        int[] ålder = {17, 162, 177, 17, 17, 22, 19, 41, 1000, 1012};

        System.out.println("\n" + "Nedan följer en lista med samtliga karaktärer i Vampire Diaries, och åldersindelning på de. ");
        System.out.println("-------------------------------------------------------------------------------------------");
// 1. Skriv ut alla personer som är under 20 år. (FUNKAR!)
        System.out.println("1. Alla personer under 20 år: ");
        for (int i = 0; i < ålder.length; i++) {
            if (ålder[i] > 20) {
                continue;
            }
            System.out.print(namn[i] + ", ");
        }

//2. Skriv ut alla personer som är 20 år. (FUNKAR!)
        System.out.println("");
        System.out.println("\n" + "2. Skriv ut alla personer som är 20 år och alla som är under 30 år. ");
        for (int i = 0; i < ålder.length; i++) {
            if (ålder[i] >= 20 && ålder[i] < 30) {
                System.out.print(namn[i] + ", ");
            }
        }

//3. Skriv ut alla personer som är yngre än 20 år och alla som är äldre än 29 år (FUNKAR!)
        System.out.println("");
        System.out.println("\n" + "3. Skriv ut alla personer som är yngre än 20 år och alla som är äldre än 29 år.");
        for (int i = 0; i < ålder.length; i++) {
            if (ålder[i] <= 20 || ålder[i] >29) {
                System.out.print(namn[i] + ", ");
            }
        }

//4. Visa namn och ålder på äldsta och yngsta karaktären (FUNKAR!)
        System.out.println("");
        System.out.println("\n" + "4. Namn och ålder på den äldsta och den yngsta karaktären: ");
        int maxPos = 0;
        int maxAge = 0;
        int minPos = 0;
        int minAge = 59000;
        for (int i = 0; i < ålder.length; i++) {
            if (ålder[i] > maxAge) {
                maxAge = ålder[i];
                maxPos = i;
            }
            if (ålder[i] < minAge) {
                minAge = ålder[i];
                minPos = i;
            }
        }
        System.out.print(namn[maxPos] + " är " + ålder[maxPos] + " år gammal, ");
        System.out.print(namn[minPos] + " är " + ålder[minPos] + " år gammal. ");


//5. Visa en lista på alla personer som har jämna tal i sin ålder (FUNKAR!)
        System.out.println("");
        System.out.println("\n" + "5. Alla personer som har jämna tal i sin ålder: ");
        for (int i = 0; i < ålder.length; i++) {
            if (ålder[i] % 2 != 0) {  //  != ej lika med
                continue;
            } else  // ta bort eles
            System.out.print(namn[i] + ", " + ålder[i] + ". ");
        }

//6. Visa alla namn men stoppa körningen vid första person över 40 år. (FUNKAR!)
        System.out.println("");
        System.out.println("\n" + "6. Visa alla namn upp till första person över 40 år: ");
        for (int i = 0; i < ålder.length; i++) {
            System.out.println(namn[i] + ", ");
            if (ålder[i] > 40) {
                break;// använd break;
            }
    }
        System.out.println("");
        System.out.print("-------------------------------------------------------------------------------------------");
}
}