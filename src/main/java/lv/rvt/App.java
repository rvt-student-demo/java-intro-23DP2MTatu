package lv.rvt;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        
        // Mes gribam uzzinat no lietotaja vārdu, uzvardu un gruppu
        System.out.println("Uzrakstiet savu vārdu: ");
        String name = scanner.nextLine();
        System.out.println("Uzrakstiet savu uzvārdu: ");
        String lastname = scanner.nextLine( );
        System.out.println("Uzrakstiet savu gruppu: ");
        String gruppa = scanner.nextLine( );
    
        // Un begias gribam visu printet kopa viena rinda izmantojot string savienošanu
        System.out.println(name +" "+ lastname +" "+ gruppa);
        
    }
}
