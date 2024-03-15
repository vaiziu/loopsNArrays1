public class Main {
    public static void main(String[] args) {
        String name = "Ben";
        String surname = "Afleck";
        System.out.println(name.length());
        if (name.length() > surname.length()) {
            System.out.println(surname);
        } else if (name.length() == surname.length()) {
            System.out.println("vardo ir pavardes ilgis vienodi");
        } else {
            System.out.println(name);
        }


//2a

//        name = "Ben";
//        surname = "Afleck";
        System.out.println(name.toUpperCase());
        System.out.println(surname.toLowerCase());

//3a

        name.charAt(1);

        System.out.println(name.charAt(0) + "" + surname.charAt(0));

        System.out.println(name.substring(0, 1) + surname.substring(0, 1));


//4a
        String vardas = "Al";
//        int ilgis = a.length();
        int vardoilgis = vardas.length() - 3;

        String pavarde = "Puccino";
        int pavardesilgis = pavarde.length() - 3;
        String result = "";

        if (vardas.length() < 3) {
            result += vardas;
        } else {
            result += vardas.substring(vardas.length() - 3);
        }
        if (pavarde.length() < 3) {
            result += pavarde;
        } else {
            result += pavarde.substring(pavarde.length() - 3);
        }

        System.out.println(result);


//    5a
        String A = "An American in Paris";

        System.out.println(A.replace("a", "*").replace("A", "*"));


//6a.Sukurti kintamąjį su stringu: “An American in Paris”.
// Jame ištrinti visas balses. Rezultatą atspausdinti.
// Kodą pakartoti su stringais: “Breakfast at Tiffany's”,
// “2001: A Space Odyssey” ir “It's a Wonderful Life”

        String balses = "An American in Paris";
        String bebalses = "";
        bebalses = balses.replaceAll("[a,i]", "");
        System.out.println("be balsiu: " + bebalses);

        balses = "Breakfast at Tiffany's";
        bebalses = balses.replaceAll("[aeiouy]", "");
        System.out.println("be balsiu: " + bebalses);
        bebalses
                .replace("a", "")
                .replace("e", "")
                .replace("i", "");


        System.out.println("asd984a1a6sdAEEADS168aesasd13asds".replaceAll("[^a-zA-Z]", ""));

//7a uzd
//        Stringe, kurį generuoja toks kodas: "Star Wars: Episode "+ " ".repeat( (int) (Math.random() * 10))+((int) (Math.random() * 7)+1) + " - A New Hope" Surasti ir atspausdinti epizodo numerį.

//  int skaicius = Math.random() * 10))+((int) (Math.random() * 7)+1);
//
//        System.out.println((Math.random() * 10))+((int) (Math.random() * 7)+1));

        String episode = ("Star Wars: Episode " + " ".repeat((int) (Math.random() * 10)) + ((int) (Math.random() * 7) + 1) + " - A New Hope");

//        System.out.println("Star Wars: Episode " + " ".repeat((int) (Math.random() * 10)) + ((int) (Math.random() * 7) + 1) + " - A New Hope");

        System.out.println(episode);

        System.out.println(episode.replaceAll()



    }
}