package software.robsoncassiano.learn.dscatalog.resources;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import software.robsoncassiano.learn.dscatalog.entities.Category;

@RestController
@RequestMapping(path = "/categories")
public class CategoryResource {

  @GetMapping(path = "/oi")
  public ResponseEntity<List<Category>> findAllCategory() {
    final List<Category> list = new ArrayList<>();
    list.add(new Category(1L, "Books"));
    list.add(new Category(2L, "Eletronics"));

    return ResponseEntity.ok(list);
  }

}
