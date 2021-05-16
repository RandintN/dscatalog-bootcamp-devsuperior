package software.robsoncassiano.learn.dscatalog.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import software.robsoncassiano.learn.dscatalog.entities.Category;
import software.robsoncassiano.learn.dscatalog.repositories.CategoryRepository;

@Service
public class CategoryService {

  private final CategoryRepository categoryRepository;

  @Autowired
  public CategoryService(CategoryRepository categoryRepository) {
    this.categoryRepository = categoryRepository;
  }

  @Transactional(readOnly = true)
  public List<Category> findAllCategories() {
    return categoryRepository.findAll();
  }
}
