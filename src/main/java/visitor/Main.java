package visitor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<PointDInteret> guideTouristique = new ArrayList<>();
        for (PointDInteret pointDInteret : guideTouristique) {
            if (pointDInteret instanceof Banque) {
                Banque banque = (Banque) pointDInteret;
                // banque
            }
            if (pointDInteret instanceof StationService) {
                StationService stationService = (StationService) pointDInteret;
                stationService.getPrixEssence();
                // stationService
            }
            //...
        }

        TouristeVisitor touristeVisitor = new TouristeVisitor();
        for (PointDInteret pointDInteret : guideTouristique) {
            pointDInteret.accept(touristeVisitor);
        }
    }
}
