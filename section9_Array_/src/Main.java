//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.println("Lets breakdown the array and rearrange them");

        int[] nums = {1, 4, 6, 7, 9, 0};

        int n = nums.length / 2;

        System.out.println(n);

        //Create new Array to store rearranged elements.
        int[] rearranged = new int[nums.length];
        System.out.println("this is rearranged array" + rearranged);

        for (int i = 0; i < n; i++) {
            rearranged[2 * i] = nums[i];
            rearranged[2 * i + 1] = nums[i + n];


        }
        System.out.print("Rearranged Array: ");
        for (int i : rearranged) {
            System.out.print(i + "");
        }


    }
}