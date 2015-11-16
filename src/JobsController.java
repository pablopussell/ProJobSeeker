import static spark.Spark.get;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

public class JobsController {
	
	public JobsController(FreeMarkerEngine freeMarkerEngine) {
		get("/jobs", (request, response) -> {
            Map<String, Object> attributes = new HashMap<>();

            ArrayList<Job> Job = new ArrayList<Job>();
            Job aJob = new Job();
            aJob.setTitle=name1;
            
            	
            
            // The hello.ftl file is located in directory:
            // src/test/resources/spark/template/freemarker
            return new ModelAndView(attributes, "views/jobs/index.ftl");
        }, freeMarkerEngine);	}

}
