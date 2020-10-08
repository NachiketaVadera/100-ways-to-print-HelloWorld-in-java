public class HelloWorld_WithStars {
    // Number of lines for the alphabet's pattern 
    static int height = 5; 
  
    // Number of character width in each line 
    static int width = (2 * height) - 1; 
  
    // Function to find the absolute value 
    // of a number D 
    static int abs(int d) { 
        return d < 0 ? -1 * d : d; 
    } 

    // Function to print the pattern of 'D' 
    static void printD() { 
        int i, j; 
        for (i = 0; i < height; i++)  { 
            System.out.printf("*"); 
            for (j = 0; j < height; j++) { 
                if ((i == 0 || i == height - 1) && j < height - 1) {
                    System.out.printf("*"); 
                } else if (j == height - 1 && i != 0&& i != height - 1) { 
                    System.out.printf("*"); 
                } else {
                    System.out.printf(" "); 
                }
            } 
            System.out.printf("\n"); 
        } 
        System.out.println();
    }

    // Function to print the pattern of 'E' 
    static void printE() { 
        int i, j; 
        for (i = 0; i < height; i++)  
        { 
            System.out.printf("*"); 
            for (j = 0; j < height; j++)  
            { 
                if ((i == 0 || i == height - 1) 
                    || (i == height / 2
                        && j <= height / 2)) 
                    System.out.printf("*"); 
                else
                    continue; 
            } 
            System.out.printf("\n"); 
        } 
        System.out.println();
    }

    // Function to print the pattern of 'H' 
    static void printH() { 
        int i, j; 
        for (i = 0; i < height; i++)  
        { 
            System.out.printf("*"); 
            for (j = 0; j < height; j++) 
            { 
                if ((j == height - 1) 
                    || (i == height / 2)) 
                    System.out.printf("*"); 
                else
                    System.out.printf(" "); 
            } 
            System.out.printf("\n"); 
        } 
        System.out.println();
    }
    
    // Function to print the pattern of 'L' 
    static void printL() { 
        int i, j; 
        for (i = 0; i < height; i++)  
        { 
            System.out.printf("*"); 
            for (j = 0; j <= height; j++) 
            { 
                if (i == height - 1) 
                    System.out.printf("*"); 
                else
                    System.out.printf(" "); 
            } 
            System.out.printf("\n"); 
        } 
        System.out.println();
    }

    // Function to print the pattern of 'O' 
    static void printO() { 
        int i, j, space = (height / 3); 
        int width = height / 2 + height / 5 + space + space; 
        for (i = 0; i < height; i++)  
        { 
            for (j = 0; j <= width; j++)  
            { 
                if (j == width - abs(space) 
                    || j == abs(space)) 
                    System.out.printf("*"); 
                else if ((i == 0
                        || i == height - 1) 
                        && j > abs(space) 
                        && j < width - abs(space)) 
                    System.out.printf("*"); 
                else
                    System.out.printf(" "); 
            } 
            if (space != 0
                && i < height / 2)  
            { 
                space--; 
            } 
            else if (i >= (height / 2 + height / 5)) 
                space--; 
            System.out.printf("\n"); 
        } 
        System.out.println();
    }

    // Function to print the pattern of 'R' 
    static void printR() 
    { 
        int i, j, half = (height / 2); 
        for (i = 0; i < height; i++)  
        { 
            System.out.printf("*"); 
            for (j = 0; j < width; j++)  
            { 
                if ((i == 0 || i == half) 
                    && j < (width - 2)) 
                    System.out.printf("*"); 
                else if (j == (width - 2) 
                        && !(i == 0 || i == half)) 
                    System.out.printf("*"); 
                else
                    System.out.printf(" "); 
            } 
            System.out.printf("\n"); 
        } 
        System.out.println();
    }

    // Function to print the pattern of 'W' 
    static void printW() 
    { 
        int i, j, counter = height / 2; 
        for (i = 0; i < height; i++)  
        { 
            System.out.printf("*"); 
            for (j = 0; j <= height; j++)  
            { 
                if (j == height) 
                    System.out.printf("*"); 
                else if ((i >= height / 2) 
                        && (j == counter 
                        || j == height - counter - 1)) 
                    System.out.printf("*"); 
                else
                    System.out.printf(" "); 
            } 
            if (i >= height / 2) 
            { 
                counter++; 
            } 
            System.out.printf("\n"); 
        }
        System.out.println();
    }
    //Function to print ","
    static void printComma() {
        System.out.println();
        for (int i = 0; i < 2; i++) {
            System.out.println(" **  ");
        }
        System.out.println(" *   ");
        System.out.println("*    ");
        System.out.println();
    }

    public static void main(String[] args) {
        printH();
        printE();
        printL();
        printL();
        printO();
        printComma();
        printW();
        printO();
        printR();
        printL();
        printD();
    }
}