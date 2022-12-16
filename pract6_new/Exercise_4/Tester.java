package Exercise_4;

public class Tester {
    public static void main(String[] args){
        CPU cp = new CPU(20000, 4000, 4);
        GPU gp = new GPU(30000, 3000, 4, 5);
        System.out.println(gp.getPrice());
        System.out.println(cp.getPrice());
    }
}
