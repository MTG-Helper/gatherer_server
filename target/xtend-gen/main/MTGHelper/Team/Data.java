package MTGHelper.Team;

import MTGHelper.Team.DataBase;
import MTGHelper.Team.DiceFacesRecord;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class Data {
  private int quantityDuels = 0;
  
  private int quantityDuelsPerOpen = 0;
  
  private int quantityDownloadedCardsImages = 0;
  
  private int quantitySearchedCards = 0;
  
  private int quantityUsedDice = 0;
  
  private int quantityUsedCoin = 0;
  
  private int quantityLifeVictories = 0;
  
  private int quantityPoisonVictories = 0;
  
  private DiceFacesRecord diceFacesRecord = new DiceFacesRecord();
  
  public void sum(final Data other) {
    int _quantityDuels = this.quantityDuels;
    this.quantityDuels = (_quantityDuels + other.quantityDuels);
    int _quantityDuelsPerOpen = this.quantityDuelsPerOpen;
    this.quantityDuelsPerOpen = (_quantityDuelsPerOpen + other.quantityDuelsPerOpen);
    int _quantityDownloadedCardsImages = this.quantityDownloadedCardsImages;
    this.quantityDownloadedCardsImages = (_quantityDownloadedCardsImages + other.quantityDownloadedCardsImages);
    int _quantitySearchedCards = this.quantitySearchedCards;
    this.quantitySearchedCards = (_quantitySearchedCards + other.quantitySearchedCards);
    int _quantityUsedDice = this.quantityUsedDice;
    this.quantityUsedDice = (_quantityUsedDice + other.quantityUsedDice);
    int _quantityUsedCoin = this.quantityUsedCoin;
    this.quantityUsedCoin = (_quantityUsedCoin + other.quantityUsedCoin);
    int _quantityLifeVictories = this.quantityLifeVictories;
    this.quantityLifeVictories = (_quantityLifeVictories + other.quantityLifeVictories);
    int _quantityPoisonVictories = this.quantityPoisonVictories;
    this.quantityPoisonVictories = (_quantityPoisonVictories + other.quantityPoisonVictories);
    this.diceFacesRecord.sum(other.diceFacesRecord);
  }
  
  public void save() {
    DataBase _instance = DataBase.getInstance();
    _instance.save(this);
  }
  
  @Pure
  public int getQuantityDuels() {
    return this.quantityDuels;
  }
  
  public void setQuantityDuels(final int quantityDuels) {
    this.quantityDuels = quantityDuels;
  }
  
  @Pure
  public int getQuantityDuelsPerOpen() {
    return this.quantityDuelsPerOpen;
  }
  
  public void setQuantityDuelsPerOpen(final int quantityDuelsPerOpen) {
    this.quantityDuelsPerOpen = quantityDuelsPerOpen;
  }
  
  @Pure
  public int getQuantityDownloadedCardsImages() {
    return this.quantityDownloadedCardsImages;
  }
  
  public void setQuantityDownloadedCardsImages(final int quantityDownloadedCardsImages) {
    this.quantityDownloadedCardsImages = quantityDownloadedCardsImages;
  }
  
  @Pure
  public int getQuantitySearchedCards() {
    return this.quantitySearchedCards;
  }
  
  public void setQuantitySearchedCards(final int quantitySearchedCards) {
    this.quantitySearchedCards = quantitySearchedCards;
  }
  
  @Pure
  public int getQuantityUsedDice() {
    return this.quantityUsedDice;
  }
  
  public void setQuantityUsedDice(final int quantityUsedDice) {
    this.quantityUsedDice = quantityUsedDice;
  }
  
  @Pure
  public int getQuantityUsedCoin() {
    return this.quantityUsedCoin;
  }
  
  public void setQuantityUsedCoin(final int quantityUsedCoin) {
    this.quantityUsedCoin = quantityUsedCoin;
  }
  
  @Pure
  public int getQuantityLifeVictories() {
    return this.quantityLifeVictories;
  }
  
  public void setQuantityLifeVictories(final int quantityLifeVictories) {
    this.quantityLifeVictories = quantityLifeVictories;
  }
  
  @Pure
  public int getQuantityPoisonVictories() {
    return this.quantityPoisonVictories;
  }
  
  public void setQuantityPoisonVictories(final int quantityPoisonVictories) {
    this.quantityPoisonVictories = quantityPoisonVictories;
  }
  
  @Pure
  public DiceFacesRecord getDiceFacesRecord() {
    return this.diceFacesRecord;
  }
  
  public void setDiceFacesRecord(final DiceFacesRecord diceFacesRecord) {
    this.diceFacesRecord = diceFacesRecord;
  }
}
