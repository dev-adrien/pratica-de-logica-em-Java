import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class MaiorMenor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        while(true){
            System.out.println("Digite um numero: ");
            int n = input.nextInt();
            nums.add(n);
            System.out.println("Quer digitar outro? (s/n)");
            String res = input.next();
            if(res.equals("n")){
                break;
            }
        }
        int maior = nums.get(0);
        int menor = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if(nums.get(i) > maior){
                maior = nums.get(i);
            }
            if(nums.get(i) < menor){
                menor = nums.get(i);
            }
        }
        System.out.println("Maior: " + maior + "\nMenor: " + menor);
    }
}
