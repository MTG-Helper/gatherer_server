package MTGHelper.Team

import org.eclipse.xtend.lib.annotations.Accessors

@Accessors
class DataBase {
	static DataBase instance = new DataBase()
	private Data data
	
	
	static def DataBase getInstance(){
		if(instance.equals(null)){
			instance = new DataBase()
		}
		return instance
	}
	
	new(){
		data = new Data()
	}
	
	def void save(Data newData){
		data.sum(newData)
	}
	
	
}

@Accessors 
class Data {
	
	int quantityDuels					= 0
	private int quantityDuelsPerOpen			= 0
	private int quantityDownloadedCardsImages	= 0
	private int quantitySearchedCards			= 0
	private int quantityUsedDice				= 0
	private int quantityUsedCoin				= 0
	private int quantityLifeVictories			= 0
	private int quantityPoisonVictories			= 0
	private DiceFacesRecord diceFacesRecord		= new DiceFacesRecord()
	
	
	
	def void sum(Data other){
		quantityDuels += other.quantityDuels
		quantityDuelsPerOpen += other.quantityDuelsPerOpen
		quantityDownloadedCardsImages += other.quantityDownloadedCardsImages
		quantitySearchedCards += other.quantitySearchedCards
		quantityUsedDice += other.quantityUsedDice
		quantityUsedCoin += other.quantityUsedCoin
		quantityLifeVictories += other.quantityLifeVictories
		quantityPoisonVictories += other.quantityPoisonVictories
		diceFacesRecord.sum(other.diceFacesRecord)
	}
	
	def void save(){
		DataBase.instance.save(this)
	}
	
}


@Accessors 
class DiceFacesRecord {
	
	private int one 	= 0
	private int two 	= 0
	private int three 	= 0
	private int four 	= 0
	private int five 	= 0
	private int six 	= 0
	
	def void sum(DiceFacesRecord other){
		one += other.one
		two += other.two
		three += other.three
		four += other.four
		five += other.five
		six += other.six
	}
	
}

