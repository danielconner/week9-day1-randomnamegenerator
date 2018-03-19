import static spark.Spark.get;

import models.Name;
import spark.ModelAndView;
import spark.Spark;
import spark.template.velocity.VelocityTemplateEngine;

import java.util.HashMap;

public class controller {



    public static void main(String[] args) {
        VelocityTemplateEngine velocityTemplateEngine = new VelocityTemplateEngine();

        get("/randomiser/one", (req, res) -> {
            String result = Name.oneName();
            HashMap<String, Object> model = new HashMap<>();
            model.put("name", result);
            return new ModelAndView(model, "result.vtl");
        }, velocityTemplateEngine);

        get("/randomiser/two", (req, res) -> {
            String result = Name.twoNames();
            HashMap<String, Object> model = new HashMap<>();
            model.put("name", result);
            return new ModelAndView(model, "result.vtl");
        }, velocityTemplateEngine);

        get("/randomiser/three", (req, res) -> {
            String result = Name.threeNames();
            HashMap<String, Object> model = new HashMap<>();
            model.put("name", result);
            return new ModelAndView(model, "result.vtl");
        }, velocityTemplateEngine);


    }




}
