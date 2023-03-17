import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        BinarrySearch binarrySearch;
        Scanner scanner = new Scanner(System.in);
        double[] number;
        System.out.println("Введите количество символов");
        int i = scanner.nextInt();

        double[] array = new double[i];
        for (int x = 0; x < array.length; x++)
        {
            System.out.println("Введите array[" + (x+1) + "]");
            array[x] = scanner.nextInt();
        }
        System.out.println("Исходный массив");
        for (int x = 0; x < array.length; x++)
        {
            System.out.println(array[x] + " ");
        }

        binarrySearch = new BinarrySearch(array);

        System.out.println("Введите цифру которую хотите найти");
        double nmbr = scanner.nextDouble();

        double newNumber = binarrySearch.serachElement(nmbr);

        System.out.println("Найденый индекс" + newNumber);

        for (int x = 0; x < binarrySearch._array.length; x++)
        {
            System.out.println(binarrySearch._array[x]);
        }
    }

}