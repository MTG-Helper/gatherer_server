package MTGHelper.Team;

import MTGHelper.Team.Data;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@Accessors
@SuppressWarnings("all")
public class DataBase {
  private static DataBase instance = new DataBase();
  
  private Data data;
  
  public static DataBase getInstance() {
    boolean _equals = DataBase.instance.equals(null);
    if (_equals) {
      DataBase _dataBase = new DataBase();
      DataBase.instance = _dataBase;
    }
    return DataBase.instance;
  }
  
  public DataBase() {
    Data _data = new Data();
    this.data = _data;
  }
  
  public void save(final Data newData) {
    this.data.sum(newData);
  }
  
  @Pure
  public Data getData() {
    return this.data;
  }
  
  public void setData(final Data data) {
    this.data = data;
  }
}
