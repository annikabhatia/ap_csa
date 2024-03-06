public class problem21 {
    public static void main(String[] args) {
        System.out.println(sumFromTo(4,7));
        System.out.println(sumFromTo(-3,1));
        System.out.println(sumFromTo(7,4));

    }

    public static int sumFromTo (int first, int last)
    {
        int i = 0;
        int sum = 0;
        if (first < last)
            for (i = first; i <= last; i++)
                sum += i;
        else
            for (i = first; i >= last; i--)
                sum += i;
        return sum;
    }
}