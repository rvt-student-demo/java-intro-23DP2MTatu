package lv.rvt;
import java.util.*;

public class App 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nameList = new ArrayList<>();
        Integer index = 0;
        while (true) {
            nameList.add(scanner.nextLine());
            if(nameList.get(index) == ""){
                break;
            }
            index++;
        }
        System.out.println(nameList.get(2));

    }
} 