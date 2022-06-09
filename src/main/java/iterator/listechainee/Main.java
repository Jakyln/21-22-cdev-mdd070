package iterator.listechainee;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ListeChainee listeChainee = new ListeChainee();
        listeChainee.add("a");
        listeChainee.add("b");
        listeChainee.add("c");
        traitementQuiBoucleSurUneStructure(listeChainee);

    }

    private static void traitementQuiBoucleSurUneStructure(Iterable iterable){
        for(Iterator iterator = iterable.iterator(); iterator.hasNext();){
            Object element = iterator.next();
            System.out.println(element);
        }
    }
}
