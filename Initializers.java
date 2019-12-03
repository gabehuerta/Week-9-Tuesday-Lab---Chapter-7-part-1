import java.util.Scanner;

public class Initializers
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

	int[] array01 = {2,4,6,8,10,12,14,16,18,20};
	for (int i = 0; i <array01.length ; i++) {
            System.out.print(array01[i]+" ");
        }

        System.out.print("\n");
        System.out.print("Enter the size of array: ");
        int size = keyboard.nextInt();
        int[] array1 = new int[size];
 
        int value=2;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = value;
            value+=2;
        }
        for (int i = 0; i <array1.length ; i++) {
            System.out.print(array1[i]+" ");
        }
        System.out.print("\n");
    }
}