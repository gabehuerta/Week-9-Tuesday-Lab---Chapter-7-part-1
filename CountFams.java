import java.util.Scanner;

public class CountFams
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter size of family: ");
        int k = keyboard.nextInt();
        
        double[] incomes = new double[k];
        
        double maxIncome =0;
        for (int i = 0; i <incomes.length ; i++) {
            System.out.print("enter income"+(i+1)+": ");
            incomes[i] = keyboard.nextDouble();
            if(i==0)
            {
                maxIncome = incomes[i];
            }
            if(maxIncome<incomes[i])
            {
                maxIncome = incomes[i];
            }
        }
        
        double value = maxIncome*0.1;
        int count=0;
        for (int i = 0; i < incomes.length; i++) {
            if(incomes[i]<value)
                count++;
        }
        System.out.println(count+ " families that make less than "+value+" of this "+maxIncome);
        System.out.print("Families income: \n");
        for (int i = 0; i < incomes.length; i++) {
            System.out.print(incomes[i]+" ");
        }
        System.out.print("\n");
    }
}