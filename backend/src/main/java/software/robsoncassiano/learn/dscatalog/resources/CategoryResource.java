package software.robsoncassiano.learn.dscatalog.resources;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import software.robsoncassiano.learn.dscatalog.entities.Category;
import software.robsoncassiano.learn.dscatalog.services.CategoryService;

@RestController
@RequestMapping(path = "/categories")
public class CategoryResource {
  private final CategoryService categoryService;

  @Autowired
  public CategoryResource(CategoryService service) {
    this.categoryService = service;
  }

  @GetMapping
  public ResponseEntity<List<Category>> findAllCategories() {
    final List<Category> list = categoryService.findAllCategories();
    return ResponseEntity.ok().body(list);
  }

}
