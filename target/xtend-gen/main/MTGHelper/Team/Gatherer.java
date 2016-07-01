package MTGHelper.Team;

import MTGHelper.Team.Data;
import MTGHelper.Team.DataBase;
import MTGHelper.Team.Minimizer;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.server.Request;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.uqbar.xtrest.api.Result;
import org.uqbar.xtrest.api.XTRest;
import org.uqbar.xtrest.api.annotation.Body;
import org.uqbar.xtrest.api.annotation.Controller;
import org.uqbar.xtrest.api.annotation.Get;
import org.uqbar.xtrest.api.annotation.Post;
import org.uqbar.xtrest.json.JSONUtils;
import org.uqbar.xtrest.result.ResultFactory;

@Controller
@SuppressWarnings("all")
public class Gatherer extends ResultFactory {
  @Extension
  private static JSONUtils _jSONUtils = new JSONUtils();
  
  @Post("/stats")
  public Result postStats(@Body final String body, final String target, final Request baseRequest, final HttpServletRequest request, final HttpServletResponse response) {
    Result _xtrycatchfinallyexpression = null;
    try {
      Result _xblockexpression = null;
      {
        Data _fromJson = Gatherer._jSONUtils.<Data>fromJson(body, Data.class);
        _fromJson.save();
        _xblockexpression = ResultFactory.ok();
      }
      _xtrycatchfinallyexpression = _xblockexpression;
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(" ");
        _builder.append("{ \"error\" : \"");
        String _message = e.getMessage();
        _builder.append(_message, " ");
        _builder.append("\" }");
        _xtrycatchfinallyexpression = ResultFactory.badRequest(_builder.toString());
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return _xtrycatchfinallyexpression;
  }
  
  @Get("/stats")
  public Result getStats(final String target, final Request baseRequest, final HttpServletRequest request, final HttpServletResponse response) {
    Result _xblockexpression = null;
    {
      response.setContentType("application/json");
      DataBase _instance = DataBase.getInstance();
      Data _data = _instance.getData();
      Map<String, Serializable> _minimize = Minimizer.minimize(_data);
      String _json = Gatherer._jSONUtils.toJson(_minimize);
      _xblockexpression = ResultFactory.ok(_json);
    }
    return _xblockexpression;
  }
  
  public static void main(final String[] args) {
    XTRest.start(Gatherer.class, 9000);
  }
  
  public void handle(final String target, final Request baseRequest, final HttpServletRequest request, final HttpServletResponse response) throws IOException, ServletException {
    {
    	Matcher matcher = 
    		Pattern.compile("/stats").matcher(target);
    	if (request.getMethod().equalsIgnoreCase("Get") && matcher.matches()) {
    		// take parameters from request
    		
    		// take variables from url
    		
    		
    	    Result result = getStats(target, baseRequest, request, response);
    	    result.process(response);
    	    
    	    baseRequest.setHandled(true);
    	    return;
    	}
    }
    {
    	Matcher matcher = 
    		Pattern.compile("/stats").matcher(target);
    	if (request.getMethod().equalsIgnoreCase("Post") && matcher.matches()) {
    		// take parameters from request
    		String body = readBodyAsString(request);
    		
    		// take variables from url
    		
    		
    	    Result result = postStats(body, target, baseRequest, request, response);
    	    result.process(response);
    	    
    	    baseRequest.setHandled(true);
    	    return;
    	}
    }
    this.pageNotFound(baseRequest, request, response);
  }
  
  public void pageNotFound(final Request baseRequest, final HttpServletRequest request, final HttpServletResponse response) throws IOException, ServletException {
    response.getWriter().write(
    "<html><head><title>XtRest - Page Not Found!</title></head>" 
    +"<body>"
    +"	<h1>Page Not Found !</h1>"
    +"	Supported resources:"
    +"	<table>"
    +"		<thead><tr><th>Verb</th><th>URL</th><th>Parameters</th></tr></thead>"
    +"		<tbody>"
    +"			<tr>"
    +"				<td>GET</td>"
    +"				<td>/stats</td>"
    +"				<td></td>"
    +"			</tr>"
    +"			<tr>"
    +"				<td>POST</td>"
    +"				<td>/stats</td>"
    +"				<td>body</td>"
    +"			</tr>"
    +"		</tbody>"
    +"	</table>"
    +"</body>"
    );
    response.setStatus(404);
    baseRequest.setHandled(true);
  }
}
