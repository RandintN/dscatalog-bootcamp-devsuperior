package software.robsoncassiano.learn.dscatalog.services;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import software.robsoncassiano.learn.dscatalog.dto.CategoryDTO;
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
  public List<CategoryDTO> findAllCategories() {
    final List<Category> list = categoryRepository.findAll();

    return list.stream().map(CategoryDTO::new).collect(Collectors.toList());
  }
}
//
//  List<CategoryDTO> listDto = new ArrayList<>();
//
//    for (Category eachCategory : list ) {
//        listDto.add(new CategoryDTO(eachCategory));
//        }
//
//        return listDto;
