package az.iktlab.group_j4.homeworks.lesson8;

public class PentagonalNumbers {
    public static void main(String[] args) {
        PentNum(50);
    }
    public static void PentNum(int cnt){
        for (int i = 1; i <=cnt ; i++) {
            int pn=(int)((3* Math.pow(i,2)-i)/2);
            System.out.print(pn+" ");
        }
    }
}
