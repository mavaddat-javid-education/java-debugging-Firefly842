public class DemoArray2
{
    public static void main(String[] args) {
        double[] salaries = {12.25, 13.55, 14.25, 16.85};
        System.out.println("One by one, the salaries are:");
        for (double salary : salaries) {
            System.out.println(salary);
        }
        //System.out.println(salaries[4]);
     }
}