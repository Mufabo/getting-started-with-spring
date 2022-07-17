package recipes;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {
    private Recipe rec;

    @GetMapping("/api/recipe")
    public Recipe getRecipe(){
        return rec;
    }

    @PostMapping("/api/recipe")
    public void setRecipe(@RequestBody Recipe recipe){
        this.rec = recipe;
    }
}