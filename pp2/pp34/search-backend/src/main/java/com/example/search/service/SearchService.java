import com.example.search.model.SearchItem;
import com.example.search.repository.SearchItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService {
    
    @Autowired
    private SearchItemRepository searchItemRepository;
    
    public List<SearchItem> searchItems(String query) {
        return searchItemRepository.findByNameContainingIgnoreCase(query);
    }
    
    public List<String> getPlaceholderTexts() {
        return List.of("Search Curd...", "Search Chocolate...", "Search Milk...", "Search Bread...", "Search Sugar...");
    }
}