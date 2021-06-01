package hello.micronaut;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;

import java.util.Random;

@Controller("/hello")
public class HelloController {
    @Get("/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String helloWorld(String name) {
        String dato = "";
        dato = datorandom();
        return "Hello " + name + "\n" +dato;
    }
    public String datorandom(){
        String datorandom = "";
        Random rnd = new Random();
        int numero = rnd.nextInt(5);
        if(numero == 0){

        }else if(numero == 1){
            datorandom = "El primer correo electronico fue QWERTYUIOP";
        }else if(numero == 2){
            datorandom = "Chanel realizo el anuncio mas caro de la historia";
        }else if(numero == 3){
            datorandom = "Existen dos paises donde no se puede comprar Coca Cola";
        }else if(numero == 4){
            datorandom = "Antes se creía que la fotografía capturaba el alma de las personas";
        }else if(numero == 5){
            datorandom = "Facebook es azul debido a que Mark Zuckerberg es daltónico";
        }
        return datorandom;
    }
}