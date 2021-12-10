package az.iktlab.group_j4.home_work.lesson8;

public class pentagonal_num {

        public static void main(String[] args) {
            int count = 1;
            for(int i = 1; i <= 50; i++){
                System.out.printf("%-7d",PentNum(i));
                if(count % 10 == 0) System.out.println();
                count++;
            }
        }
        public static int PentNum(int i) {
            return (int) ((3*Math.pow(i,2)-i)/2);

        }

}
