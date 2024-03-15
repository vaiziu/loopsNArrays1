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

        if(vardas.length() < 3 ) {
            result += vardas;
        }else {
            result += vardas.substring(vardas.length() - 3);
        }
        if(pavarde.length() < 3 ) {
            result += pavarde;
        }else {
            result += pavarde.substring(pavarde.length() - 3);
        }

        System.out.println(result);


//    5a
        String A = "An American in Paris";

        System.out.println(A.replace("a", "*").replace("A", "*"));


//6a.dfjhkdfhkdhkdjhd







    }
}