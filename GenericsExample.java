public class GenericsExample {
    public static void main(String[] args) {
        box<Integer> integerBox = new box<Integer>();
        integerBox.setT(new Integer(10));
        Integer someInteger = integerBox.getT();
        System.out.println(someInteger);

        box<Float> floatBox = new box<Float>();
        floatBox.setT (new Float(10.2323));
        Float somefloat = floatBox.getT();
        System.out.println(somefloat);

    }

}
class box<T>{
    private T t;
    public void setT(T t) {
        this.t = t;
    }
    public T getT() {
        return t;
    }
}
