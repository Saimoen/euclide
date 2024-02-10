import java.util.Scanner;

class myfirstcode
{
    public static void main(final String[] args)
    {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Bonjour !");

            // Euclide
            System.out.println("Euclide(72,60)"+euclide.par_soustraction(72, 60));
            System.out.println("Euclide(6660,3996)"+euclide.par_soustraction(6660, 3996));

            System.out.println("Euclide(72,60)"+euclide.modulo(72, 60));
            System.out.println("Euclide(6660,3996)"+euclide.modulo(6660, 3996));

            System.out.println("Euclide(72,60)"+euclide.par_recursivite(72, 60));
            System.out.println("Euclide(6660,3996)"+euclide.par_recursivite(6660, 3996));


            // Fibonnacci
            System.out.println("Quelle indice de Fibonnacci ?");
            int f = Integer.parseInt(scanner.nextLine());
            System.out.println("Fibonnacci(7)"+fibonnacci.par_iterative(f));
            System.out.println("Fibonnacci(7)"+fibonnacci.par_recursive(f));
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}