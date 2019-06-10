import java.util.*;
import java.util.stream.Collectors;

public class RockPaperScissor {

    public static void main(String[] args) {

        float f1 = 2.6f;
        float f2 = 1.6f;

        float sum = f1+f2;
        Integer soulution = Math.round(sum);
        Integer floor = (int) Math.floor(sum);
        System.out.println(floor);

        List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,8,9);

        List<Integer> collect = intList.stream().map(x -> x * x).collect(Collectors.toList());
        List<Integer> collect1 = intList.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());

        int even = intList.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
        System.out.println(collect1);
        System.out.println(even);


        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named RockPaperScissor. */
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        String s1 = scan.nextLine();
        char[] s = scan.nextLine().toCharArray();
        int totalAWin =0;
        int totalBWin=0;

        for (int k=1;k<2*i;k=k+2){
            if (s[k]=='P'){
                if (s[k-1] == 'R'){
                    System.out.println("B WINS");
                    totalBWin++;

                } else {
                    if (s[k-1]=='S'){
                        System.out.println("A WINS");
                        totalAWin++;
                    } else {
                        System.out.println("DRAW");
                    }
                }

            }
            if (s[k]=='R'){
                if (s[k-1] == 'S'){
                    System.out.println("B WINS");
                    totalBWin++;

                } else {
                    if (s[k-1]=='P'){
                        System.out.println("A WINS");
                        totalAWin++;
                    } else {
                        System.out.println("DRAW");
                    }
                }

            }
            if (s[k]=='S'){
                if (s[k-1] == 'P'){
                    System.out.println("B WINS");
                    totalBWin++;

                } else {
                    if (s[k-1]=='R'){
                        System.out.println("A WINS");
                        totalAWin++;
                    } else {
                        System.out.println("DRAW");
                    }
                }

            }

        }
        if (totalAWin == totalBWin){
            System.out.println("DRAW");
        } else {
            if (totalAWin > totalBWin) {
                System.out.println("A WINS TOURNAMENT");
            } else {
                System.out.println("B WINS TOURNAMENT");
            }
        }
    }


}