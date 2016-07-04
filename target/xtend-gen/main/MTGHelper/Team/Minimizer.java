package MTGHelper.Team;

import MTGHelper.Team.Data;
import MTGHelper.Team.DiceFacesRecord;
import java.io.Serializable;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Pair;

@SuppressWarnings("all")
public class Minimizer {
  public static Map<String, Serializable> minimize(final Data data) {
    int _quantityDuels = data.getQuantityDuels();
    Pair<String, Integer> _mappedTo = Pair.<String, Integer>of("quantityDuels", Integer.valueOf(_quantityDuels));
    int _quantityDuelsPerOpen = data.getQuantityDuelsPerOpen();
    Pair<String, Integer> _mappedTo_1 = Pair.<String, Integer>of("quantityDuelsPerOpen", Integer.valueOf(_quantityDuelsPerOpen));
    int _quantityDownloadedCardsImages = data.getQuantityDownloadedCardsImages();
    Pair<String, Integer> _mappedTo_2 = Pair.<String, Integer>of("quantityDownloadedCardsImages", Integer.valueOf(_quantityDownloadedCardsImages));
    int _quantitySearchedCards = data.getQuantitySearchedCards();
    Pair<String, Integer> _mappedTo_3 = Pair.<String, Integer>of("quantitySearchedCards", Integer.valueOf(_quantitySearchedCards));
    int _quantityUsedDice = data.getQuantityUsedDice();
    Pair<String, Integer> _mappedTo_4 = Pair.<String, Integer>of("quantityUsedDice", Integer.valueOf(_quantityUsedDice));
    int _quantityUsedCoin = data.getQuantityUsedCoin();
    Pair<String, Integer> _mappedTo_5 = Pair.<String, Integer>of("quantityUsedCoin", Integer.valueOf(_quantityUsedCoin));
    int _quantityLifeVictories = data.getQuantityLifeVictories();
    Pair<String, Integer> _mappedTo_6 = Pair.<String, Integer>of("quantityLifeVictories", Integer.valueOf(_quantityLifeVictories));
    int _quantityPoisonVictories = data.getQuantityPoisonVictories();
    Pair<String, Integer> _mappedTo_7 = Pair.<String, Integer>of("quantityPoisonVictories", Integer.valueOf(_quantityPoisonVictories));
    DiceFacesRecord _diceFacesRecord = data.getDiceFacesRecord();
    LinkedHashMap<String, Integer> _minimizeDiceRecords = Minimizer.minimizeDiceRecords(_diceFacesRecord);
    Pair<String, LinkedHashMap<String, Integer>> _mappedTo_8 = Pair.<String, LinkedHashMap<String, Integer>>of("diceFacesRecord", _minimizeDiceRecords);
    return Collections.<String, Serializable>unmodifiableMap(CollectionLiterals.<String, Serializable>newHashMap(_mappedTo, _mappedTo_1, _mappedTo_2, _mappedTo_3, _mappedTo_4, _mappedTo_5, _mappedTo_6, _mappedTo_7, _mappedTo_8));
  }
  
  public static LinkedHashMap<String, Integer> minimizeDiceRecords(final DiceFacesRecord diceFacesRecord) {
    int _one = diceFacesRecord.getOne();
    Pair<String, Integer> _mappedTo = Pair.<String, Integer>of("one", Integer.valueOf(_one));
    int _two = diceFacesRecord.getTwo();
    Pair<String, Integer> _mappedTo_1 = Pair.<String, Integer>of("two", Integer.valueOf(_two));
    int _three = diceFacesRecord.getThree();
    Pair<String, Integer> _mappedTo_2 = Pair.<String, Integer>of("three", Integer.valueOf(_three));
    int _four = diceFacesRecord.getFour();
    Pair<String, Integer> _mappedTo_3 = Pair.<String, Integer>of("four", Integer.valueOf(_four));
    int _five = diceFacesRecord.getFive();
    Pair<String, Integer> _mappedTo_4 = Pair.<String, Integer>of("five", Integer.valueOf(_five));
    int _six = diceFacesRecord.getSix();
    Pair<String, Integer> _mappedTo_5 = Pair.<String, Integer>of("six", Integer.valueOf(_six));
    return CollectionLiterals.<String, Integer>newLinkedHashMap(_mappedTo, _mappedTo_1, _mappedTo_2, _mappedTo_3, _mappedTo_4, _mappedTo_5);
  }
}
