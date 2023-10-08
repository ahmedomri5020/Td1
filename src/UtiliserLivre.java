import Exercice3.Livre;

public class UtiliserLivre {
    public static void main(String[] args) {
        Livre livre1 = new Livre("Amine", "Titre1");
        Livre livre2 = new Livre("Amine", "Titre2");

        if (livre1.getAuteur() == livre2.getAuteur()) {
            System.out.println("le meme auteur");
        } else {
            System.out.println(" n'ont pas le même auteur.");
        }

        Livre livre = new Livre("Paulo Coelho", "L'Alchimiste");
        livre.setNbPages(225);
        livre.decrire();
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------");
        Livre[] livres = new Livre[3];

        livres[0] = new Livre("L'alchimiste", "Coelho", 225);
        livres[1] = new Livre("Le Coran", 508);
        livres[2] = new Livre("Harry Potter", "JK Rowling");

        for (int i = 0; i < livres.length; i++) {
            System.out.println("Livre " + (i + 1) + ": " + livres[i]);
        }

        livres[1].setAuteur("Paulo Coelho");

        livres[2].setNbPages(461);
        for (int i = 0; i < livres.length; i++) {
            livres[i].decrire();
        }
        Livre livre3 = new Livre("Amine", "Titre1");
        System.out.println("Livre 3 --> Prix fixé : " + livre3.testPrix());
        livre3.setPrix(19.99);
        System.out.println("Livre 3 - Prix fixé : " + livre3.testPrix());
        livre3.setPrix(29.99);

        Livre livre4 = new Livre("Amine", "Titre2", 24);
        System.out.println("Livre 4 --> Prix fixé : " + livre4.testPrix());

        livre4.setPrix(34.99);
    }
}
