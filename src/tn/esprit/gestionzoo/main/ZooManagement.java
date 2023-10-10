package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;
public class ZooManagement {

    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.setName("lion");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("Water Park", "Siliana");


        Animal dog = new Animal("Canine", "Snoopy", 2, true);


        System.out.println(myZoo.addAnimal(lion));
        /* true */
        System.out.println(myZoo.addAnimal(dog));
        /* true */

        myZoo.displayAnimals();
        /* Liste des animaux de Wildlife Park:
        tn.esprit.gestionzoo.entities.Animal{family='Cats', name='Simba', age=8, isMammal=true}
        tn.esprit.gestionzoo.entities.Animal{family='Canine', name='Snoopy', age=2, isMammal=true}
        */

        System.out.println(myZoo.searchAnimal(dog));
        /* 1 */
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));
        /* -1 */
        //   System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();
        /*
        Liste des animaux de Wildlife Park:
        tn.esprit.gestionzoo.entities.Animal{family='Cats', name='Simba', age=8, isMammal=true}
        tn.esprit.gestionzoo.entities.Animal{family='Canine', name='Snoopy', age=2, isMammal=true}
         */

        System.out.println(myZoo);
        /*
        Name: Wildlife Park, City: Ariana, N° Cages/Animals: 25
        */

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(lion));
        /*
        Liste des animaux de Wildlife Park:
        tn.esprit.gestionzoo.entities.Animal{family='Cats', name='Simba', age=8, isMammal=true}
        tn.esprit.gestionzoo.entities.Animal{family='Canine', name='Snoopy', age=2, isMammal=true}
        tn.esprit.gestionzoo.entities.Animal{family='Canine', name='lll', age=2, isMammal=true}
        atrue
        */
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(dog2));
        /*
        Liste des animaux de Wildlife Park:
        tn.esprit.gestionzoo.entities.Animal{family='Canine', name='Snoopy', age=2, isMammal=true}
        afalse
        */
        myZoo.displayAnimals();
        System.out.println("a" + myZoo.removeAnimal(dog));
        /*
        Liste des animaux de Wildlife Park:
        tn.esprit.gestionzoo.entities.Animal{family='Canine', name='Snoopy', age=2, isMammal=true}
        atrue
         */
        myZoo.displayAnimals();
        /*
        Liste des animaux de Wildlife Park:
         */

        System.out.println(Zoo.comparerZoo(myZoo, notMyZoo));
        /* Name: WaterPark, City: Siliana, N° Cages/Animals: 25 */
        System.out.println(myZoo.isZooFull());
        /* false */

    }

}