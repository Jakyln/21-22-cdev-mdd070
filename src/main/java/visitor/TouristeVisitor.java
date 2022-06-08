package visitor;

public class TouristeVisitor implements Visitor {
    @Override
    public void doForBanque(Banque banque) {
        // je m'en fou
    }

    @Override
    public void doForStationService(StationService stationService) {
        // je m'en fou

    }

    @Override
    public void doForLieuTouristique(LieuTouristique lieuTouristique) {
        // ajouter ce lieu à mes favoris.
    }
}
