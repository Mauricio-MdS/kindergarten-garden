import java.util.ArrayList;
import java.util.List;

class KindergartenGarden {
    List<Plant> firstRow;
    List<Plant> secondRow;

    enum Children {
        Alice, Bob, Charlie, David,
        Eve, Fred, Ginny, Harriet,
        Ileana, Joseph, Kincaid, Larry
    }

    KindergartenGarden(String garden) {
        firstRow = new ArrayList<>();
        secondRow = new ArrayList<>();

        var splitGarden = garden.split("\n");
        splitGarden[0].chars().forEach(n ->
                this.firstRow.add(Plant.getPlant((char) n))
        );
        splitGarden[1].chars().forEach(n ->
                this.secondRow.add(Plant.getPlant((char) n))
        );
    }

    List<Plant> getPlantsOfStudent(String student) {
        int cup = Children.valueOf(student).ordinal() * 2;
        List<Plant> plants = new ArrayList<>();
        plants.add(firstRow.get(cup));
        plants.add(firstRow.get(cup + 1));
        plants.add(secondRow.get(cup));
        plants.add(secondRow.get(cup + 1));
        return plants;
    }

}
