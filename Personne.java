//Mohamed Camara
//DBE

class Personne {
    String nom;
    int age;
    double salaire;

//structure
    public Personne(String nom, int age, double salaire) {
        
        this.nom = nom;
        this.age = age;
        this.salaire = salaire;

    }
//somme des salaire
    public static double somme(Personne[] personnes) {
        double somme = 0.0;

        for (Personne personne : personnes) {
            somme += personne.salaire;
        }

        return somme;
    }

    public static void main(String[] args) {

        Personne p1 = new Personne("Ibou", 30, 50000.0);
        Personne p2 = new Personne("Malick", 29, 60000.0);
        Personne p3 = new Personne("Fallou", 38, 70000.0);

        Personne[] tableauPersonnes = {p1, p2, p3};

        double somme = somme(tableauPersonnes);

        System.out.println("La somme Total: " + somme);
    }
}
