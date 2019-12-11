public class Calculator1 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        for(int b : a){
            for(int c : a){
                System.out.printf("%4d", b*c);
            }
            System.out.println();
        }
    }
}
// тренировка с git 