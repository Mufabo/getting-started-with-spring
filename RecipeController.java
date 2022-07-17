
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