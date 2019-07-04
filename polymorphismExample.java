public class polymorphismExample {
    public static void main(String[] args) {
        Animal ref;
        cow acow = new cow();
        dog adog = new dog();
        cat acat = new cat();
        ref = acow;
        ref.speak();
        ref = adog;
        ref.speak();
        ref = acat;
        ref.speak();
    }
}
abstract class Animal{
    public abstract void speak();
}
class cow extends Animal{
    @Override
    public void speak() {
        System.out.println("moooo....");
    }
}
class dog extends Animal{
    @Override
    public void speak() {
        System.out.println("bao bao");
    }
}
class cat extends Animal{
    @Override
    public void speak() {
        System.out.println("meo meo");
    }
}