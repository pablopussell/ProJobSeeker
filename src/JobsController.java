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

            ArrayList<Job> Jobs = new ArrayList<Job>();
            ArrayList<String> Categories = new ArrayList<String>();
            Categories.add("Programming");
            Categories.add("Design");
            Job aJob = new Job();
            aJob.setTitle("name1");
            aJob.setCompany("Company1");
            aJob.setCategoryName("Programming");
            aJob.setDescription("Description");
            aJob.setLocation("location");
            Jobs.add(aJob);
            
            Job aJob2 = new Job();
            aJob2.setTitle("name2");
            aJob2.setCompany("Company2");
            aJob2.setCategoryName("Programming");
            aJob2.setDescription("Description");
            aJob2.setLocation("location");
            Jobs.add(aJob2);
            
            Job aJob3 = new Job();
            aJob3.setTitle("name3");
            aJob3.setCompany("Company3");
            aJob3.setCategoryName("Design");
            aJob3.setDescription("Description");
            aJob3.setLocation("location");
            Jobs.add(aJob3);
            
            attributes.put("jobs", Jobs);
            attributes.put("categories", Categories);
            // The hello.ftl file is located in directory:
            // src/test/resources/spark/template/freemarker
            return new ModelAndView(attributes, "views/jobs/index.ftl");
        }, freeMarkerEngine);	}

}
