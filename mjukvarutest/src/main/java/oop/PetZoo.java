package oop;

public class PetZoo {
    public static void main(String[] args) {
        Pet myDog = new Pet("Dogy");
        Pet myCat = new Pet("Caty");
        Pet myRabbit = new Pet("Rabby");

        String dogName;
        String catName;
        String rabbitName;

        dogName = myDog.getName();
        catName = myCat.getName();
        rabbitName = myRabbit.getName();


        for (int i = 0; i < 1; i++) {
            System.out.println(dogName);
            System.out.println(catName);
            System.out.println(rabbitName);


        }

    }

}

