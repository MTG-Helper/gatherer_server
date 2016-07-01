package MTGHelper.Team

import org.uqbar.xtrest.api.XTRest
import org.uqbar.xtrest.api.annotation.Body
import org.uqbar.xtrest.api.annotation.Controller
import org.uqbar.xtrest.api.annotation.Get
import org.uqbar.xtrest.api.annotation.Post
import org.uqbar.xtrest.json.JSONUtils


@Controller
class Gatherer {
	static extension JSONUtils = new JSONUtils	
	
	@Post('/stats')
    def postStats(@Body String body) {
    	try {
	    	body.fromJson(Data).save()							    	
	    	ok()
    	}
    	catch (Exception e) {
    		badRequest(''' { "error" : "«e.message»" }''')
    	}
    }
	
	@Get("/stats")
	def getStats() {
		response.contentType = "application/json"
    	    	    	
		ok(Minimizer.minimize(DataBase.instance.data).toJson)
	}	
	
	def static void main(String[] args) {
		// Levantando el servidor
		XTRest.start(Gatherer, 9000)
	}
}

