import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class recipeBookClass {
    public static void main(String[] args)
    {
        List<Integer> countRecipiList = new ArrayList<>();
        int countRecipi ;
        List<String> nameList = new ArrayList<String>();
        String name="";
        List<Integer> servingSizeList = new ArrayList<>();
        int servingSize;
        List<String> typeList = new ArrayList<String>();
        String type;
        List<Double> timeList = new ArrayList<>();
        double time;
        List<String> difficultyList = new ArrayList<>();
        String difficulty;
        String recipi="";

        Scanner myScan = new Scanner(System.in);

        outputLine("How many do you have recipe ? ");
        countRecipi = myScan.nextInt();

        while (!name.equalsIgnoreCase("quit") )
        {
            //outputLine("Enter the name of recipi : ");
            countRecipiList.add(countRecipi);
            outputLine("Enter the name of recipi : ");
            name = myScan.next();
            if (name.equals("quit")) {
                break;
            }
            nameList.add(name);
            outputLine("Enter serving size : ");
            servingSize = myScan.nextInt();
            servingSizeList.add(servingSize);
            outputLine("Enter serving type : ");
            type = myScan.next();
            typeList.add(type);
            outputLine("Enter time : ");
            time = myScan.nextDouble();
            timeList.add(time);
            outputLine("Enter difficulty : ");
            difficulty = myScan.next();
            difficultyList.add(difficulty);

        }
        outputLine("===========================================");
        outputLine("Name" + "\t" + "Serving Size" + "\t" + "Serving Type" + "\t" + "Time" + "\t" + "Difficulty");
        for (int i=0 ; i< countRecipiList.size() ; i++) {
            recipi = nameList.get(i) + "\t\t" + servingSizeList.get(i)
                    + "\t\t\t" + typeList.get(i) + "\t\t\t" + timeList.get(i) + "\t\t" + difficultyList.get(i);
            outputLine(recipi);
        }
    }
    private static void outputLine( String message)
    {
        System.out.println(message);
    }
}
