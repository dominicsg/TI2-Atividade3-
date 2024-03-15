package app;

import static spark.Spark.*;
import service.CarService;


public class Aplicacao {
	
	private static CarService carService = new CarService();
	
    public static void main(String[] args) {
        port(4568);
        
        staticFiles.location("/public");
        
        post("/produto/insert", (request, response) -> carService.insert(request, response));

        get("/produto/:id", (request, response) -> carService.get(request, response));
        
        get("/produto/list/:orderby", (request, response) -> carService.getAll(request, response));

        get("/produto/update/:id", (request, response) -> carService.getToUpdate(request, response));
        
        post("/produto/update/:id", (request, response) -> carService.update(request, response));
           
        get("/produto/delete/:id", (request, response) -> carService.delete(request, response));

             
    }
}