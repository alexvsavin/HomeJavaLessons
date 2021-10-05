package Lesson06;

public class HomeWorkApp06 {

    public static void main(String[] args) {

        Cat cat = new Cat("Барсик", "Белый", 200, 10);

        cat.animalsInfo();
       // cat.catInfo();
        cat.animalsRun(cat.run);
        cat.animalsSwim(cat.swim);
        //cat.catRun();

        Cat cat1 = new Cat("Мурзик", "Рыжий", 500, 10);

        cat1.animalsInfo();
        cat1.animalsRun(cat1.run);
        cat1.animalsSwim(cat1.swim);

        Dog dog = new Dog("Шарик", 500, 10);

       dog.animalsInfo();
       dog.animalsRun(dog.run);
       dog.animalsSwim(dog.swim);


    }

}
