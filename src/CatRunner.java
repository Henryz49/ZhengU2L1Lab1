public class CatRunner {
    public static void main(String[] args){
        Cat cat1 = new Cat("bob", 3, 40.5);
        cat1.printCatInfo();
        cat1.introduce();

        Cat cat2 = new Cat("joe", 4, 20.334);
        cat2.printCatInfo();
        cat2.introduce();

    }
}
