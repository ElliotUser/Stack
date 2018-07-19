package exc01;

public class StackApp {
    public static void main(String[] args) {
        StackX stackX = new StackX(10);

        stackX.push(2);
        stackX.push(4);
        stackX.push(6);
        stackX.push(8);
        stackX.push(10);

        while (!stackX.isEmpty()){
            long value = stackX.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println();
    }
}
