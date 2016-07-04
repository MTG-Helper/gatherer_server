package MTGHelper.Team

class Minimizer {
	
	def static minimize(Data data){
		return #{
			"quantityDuels" 					-> data.quantityDuels,
			"quantityDuelsPerOpen" 				-> data.quantityDuelsPerOpen,
			"quantityDownloadedCardsImages" 	-> data.quantityDownloadedCardsImages,
			"quantitySearchedCards" 			-> data.quantitySearchedCards,
			"quantityUsedDice" 					-> data.quantityUsedDice, 
			"quantityUsedCoin" 					-> data.quantityUsedCoin,
			"quantityLifeVictories" 			-> data.quantityLifeVictories,
			"quantityPoisonVictories" 			-> data.quantityPoisonVictories,
			"diceFacesRecord" 					-> minimizeDiceRecords(data.diceFacesRecord)
		}
	}
	
	def static minimizeDiceRecords(DiceFacesRecord diceFacesRecord){
		return newLinkedHashMap(
			"one" 	-> diceFacesRecord.one,
			"two"	-> diceFacesRecord.two,
			"three"	-> diceFacesRecord.three,
			"four"	-> diceFacesRecord.four,
			"five"	-> diceFacesRecord.five,
			"six"	-> diceFacesRecord.six
			)
	}
}