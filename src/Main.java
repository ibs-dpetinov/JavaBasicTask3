//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] intArray = {1,2,3,4,5};

        int last = intArray[intArray.length -1];
        int first = intArray[0];
        int middle = intArray[(intArray.length / 2) + (intArray.length % 2) - 1 ];
        intArray[0] = last;
        intArray[intArray.length -1] = first;
        System.out.println("Сумма первого и среднего элементов ( " + intArray[0] + " и " + middle + " ) равна " + (intArray[0] + middle));
    }
}