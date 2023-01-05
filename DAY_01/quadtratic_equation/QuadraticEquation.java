package DAY_01.quadtratic_equation;

public class QuadraticEquation {
    private final static boolean POSITIVE = true, NEGATIVE = false;
    private int a,b,c;
    private double d;
    QuadraticEquation(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void calculateDiscriminant(){
        d = (b*b) - (4*a*c);
    }
    public void solve(){
        calculateDiscriminant();
        if(d > 0){
            System.out.printf("Discriminant %.2f is greater than 0\nHence, There are two possible roots\n", d);
            double root1 = findRoot(POSITIVE);
            double root2 = findRoot(NEGATIVE);
            System.out.printf("\tx1 = %.2f and x2 = %.2f\n", root1 , root2);
        }else if(d == 0){
            System.out.printf("Discriminant 0 is equal to  0\nHence, Both roots are same\n");
            double root = findRoot(POSITIVE);
            System.out.printf("\tx1 = x2 = %.2f\n", root);
        }else{
            System.out.printf("Discriminant %.2f is less than 0\nHence, Roots are complex\n", d);
            double realPart = -b / (2*a);
            double imaginary = Math.sqrt(Math.abs(d)) / (2*a);
            System.out.println("\tRoots are");
            System.out.printf("x1 = %.2f + %.2fi\n",realPart, imaginary);
            System.out.printf("x1 = %.2f - %.2fi\n",realPart, imaginary);

        }
    }

    private double findRoot(boolean isPositive){
        return (-b + Math.sqrt(d) * (isPositive ? 1 : -1)) / (2*a);
    }

    public static void main(String[] args) {
        QuadraticEquation eq = new QuadraticEquation(1,6,15);
        eq.solve();

    }

}
