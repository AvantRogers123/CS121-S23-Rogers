package Activity15;

public class ArrayFromInput { Scanner input = new Scanner(System.in);

    // array of Strings
    String[] names = new String[3];
  System.out.println("Enter three names:");
  for(int i = 0; i < names.length; i++) {
        names[i] = input.nextLine();
    }

    // array of ints
    int[] ages = new int[3];
  System.out.println("Enter the ages of the three people:");
  for(int i = 0; i < ages.length; i++) {
        ages[i] = input.nextInt();
        input.nextLine(); // consume newline
    }

    // array of doubles
    double[] prices = new double[3];
  System.out.("Enter the prices of three items:");
  for(int i = 0; i < prices.length; i++) {
        prices[i] = input.nextDouble();
        input.nextLine(); // consume newline
    }

    // print header
  System.out.printf("%-10s%-10s%-10s\n", "Name", "Age", "Price");
    // print contents of arrays in a table
  for(int i = 0; i < names.length; i++) {
        System.out.printf("%-10s%-10d%-10.2f\n", names[i], ages[i], prices[i]);
    }
}

}
}
