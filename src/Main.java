import bank.BankAccount;
import bank.SavingsAccount;
import generique.Boite;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*

        Animal[] animals = new Animal[2];

        animals[0] = new Dog("Rex", 5);
        animals[1] = new Cat("Mia", 3);

        for (Animal animal : animals) {
            animal.displayInfo();
            animal.makeSound();
        }

        */

        /*
        BankAccount account = new BankAccount(45604, 200.0, "Mr X");
        SavingsAccount savingsAccount = new SavingsAccount(450, 3000.0, "Mr Y", 12.5f);

        System.out.println("Balance = " + account.getBalance() + "€");

        double depositAmount = 300.0;
        System.out.println("-------- Dépôt de " + depositAmount + "€ -----------");
        account.deposit(depositAmount);

        double withdrawAmount = 350.0;
        System.out.println("Balance = " + account.getBalance() + "€");
        System.out.println("-------- Rétrait de " + withdrawAmount + "€ -----------");
        account.withdraw(withdrawAmount);
        System.out.println("Balance = " + account.getBalance() + "€");

        System.out.println("------------- Compte épargne --------------");
        System.out.println("Balance du compte épargne = " + savingsAccount.getBalance() + "€");
        savingsAccount.applyInterest();
        savingsAccount.deposit(depositAmount);
        System.out.println("solde après dépôt = " + savingsAccount.getBalance() + "€");
        savingsAccount.withdraw(withdrawAmount);
        System.out.println("solde après retrait = " + savingsAccount.getBalance() + "€");

        BankAccount account1 = new  BankAccount(454, 270.0, "Mr H");
        BankAccount account2 = new BankAccount(4890, -58.5, "Mr D");

        System.out.println("Nombre de compte créés = " + BankAccount.nbCreatedAccounts);
        System.out.println("-------- Account info ----------");
        account1.displayAccountInfo();
        account2.displayAccountInfo();

        */

        // Test générique
        // Boîte pour stocker des String
        Boite<String> boiteDeString = new Boite<>();
        boiteDeString.add("Bonjour");
        boiteDeString.add("Monde");

        // Boîte pour stocker des Integer
        Boite<Integer> boiteDeInteger = new Boite<>();
        boiteDeInteger.add(42);
        boiteDeInteger.add(2025);

        // Affichage des contenus
        System.out.println("Contenu de la boîte de String : " + boiteDeString.getContenu());
        System.out.println("Contenu de la boîte d'Integer : " + boiteDeInteger.getContenu());

        // Test de merge
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list1.add("Bonjour");
        list2.add("comment ça va ?");

        List<String> resultatMerge = Boite.merge(list1, list2);

        System.out.println("Résultat du merge : " + resultatMerge);
    }

    public static <T> void afficheBoites(List<Boite<T>> boites) {
        for (Boite<T> boite : boites) {
            System.out.println(boite);
        }
    }
}