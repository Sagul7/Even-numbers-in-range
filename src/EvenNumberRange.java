import java.util.Scanner;

public class EvenNumberRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        for (int i=0;i<size;i++)
        {
            array[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        findEvennumber(array,q);
    }
    public static void findEvennumber(int[] array,int q)
    {
        Scanner sc = new Scanner(System.in);
        int p[] = new int[array.length];
        p[0] = array[0]%2==0?1:0;

        for(int i=1;i< array.length;i++)
        {
            p[i] = p[i-1] + (array[i]%2==0?1:0);
        }
        while(q-->0)
        {
            int L = sc.nextInt();
            int R = sc.nextInt();

            if(L==0)
            {
                System.out.println(p[R]);
            }
            else
            {
                System.out.println(p[R]-p[L-1]);
            }

        }
    }
}
