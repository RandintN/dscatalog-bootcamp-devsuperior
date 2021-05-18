package software.robsoncassiano.learn.dscatalog.dto;

import java.io.Serializable;
import software.robsoncassiano.learn.dscatalog.entities.Category;

public class CategoryDTO implements Serializable {
  private final String name;

  public CategoryDTO(String name) {
    this.name = name;
  }

  public CategoryDTO(Category entity) {
    this.name = entity.getName();
  }

  public String getName() {
    return name;
  }
}
