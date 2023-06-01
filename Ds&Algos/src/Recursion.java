public class Recursion {
    public float fact(float num){
            if(num==0){
                return 1;
            }else if(num<0){
                throw new AssertionError("Undefined");
            }else{
                return num * fact(num-1);
            }
        }

        public static void main(String[] args) {
            Recursion factorial = new Recursion();
            System.out.println(factorial.fact(5));
        }
}
