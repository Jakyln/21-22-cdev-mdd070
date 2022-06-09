package observator.exercice;

import java.util.ArrayList;
import java.util.List;

public class Bourse {
    private int prixBTC;
    private List<BourseSubscriber> bourseSubscriberList = new ArrayList<>();

    public void setPrixBTC(int prixBTC) {
        this.prixBTC = prixBTC;
        for (BourseSubscriber bourseSubscriber : bourseSubscriberList) {
            bourseSubscriber.update(prixBTC);
        }

    }

    public int getPrixBTC() {
        return prixBTC;
    }

    public List<BourseSubscriber> getBourseSubscriberList() {
        return bourseSubscriberList;
    }

    public void setBourseSubscriberList(List<BourseSubscriber> bourseSubscriberList) {
        this.bourseSubscriberList = bourseSubscriberList;
    }

    public void subscribe(BourseSubscriber subscriber) {
        this.bourseSubscriberList.add(subscriber);
    }

    public void unsubscribe(BourseSubscriber subscriber) {
        this.bourseSubscriberList.remove(subscriber);
    }

}
