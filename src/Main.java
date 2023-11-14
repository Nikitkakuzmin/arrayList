import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Players pl1 = new Players("Kamaz",12500,28);
        Players pl2 = new Players("Rulon",13200,19);
        Players pl3 = new Players("Ulov", 15100,24);
        Players pl4 = new Players("Razvod",11600,27);
        Players pl5 = new Players("Razrez",18900,31);


        ArrayList <Double> players = new ArrayList<Double>();
        players.add(pl1.getPrice());
        players.add(pl2.getPrice());
        players.add(pl3.getPrice());
        players.add(pl4.getPrice());
        players.add(pl5.getPrice());


        double pr = 0;

        for(int i = 0; i < players.size(); i ++){
            pr += players.get(i);
        }

        double aver = pr/ players.size();
        System.out.println(aver);

        ArrayList <Integer> players1 = new ArrayList<Integer>();
        players1.add(pl1.getAge());
        players1.add(pl2.getAge());
        players1.add(pl3.getAge());
        players1.add(pl4.getAge());
        players1.add(pl5.getAge());

        int sum = 0;
        for(int i = 0; i < players1.size();i ++){
            sum += players1.get(i);
        }
        System.out.println(sum);

        System.out.println(pl1.getAge());
    }
}

