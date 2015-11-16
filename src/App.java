import static spark.Spark.*;

import java.util.*;

import freemarker.cache.TemplateLoader;
import freemarker.template.Configuration;
import spark.template.freemarker.FreeMarkerEngine;
import spark.ModelAndView;

public class App {

	public static void main(String[] args) {
		staticFileLocation("/Resources");

		FreeMarkerEngine freeMarkerEngine = new FreeMarkerEngine();
        Configuration configuration = new Configuration();
        configuration.setClassForTemplateLoading(App.class, "/resources");
		freeMarkerEngine.setConfiguration(configuration);
		
		JobsController jobController = new JobsController(freeMarkerEngine);
	}	
}
