

import com.example.search.model.SearchItem;
import com.example.search.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/search")
public class SearchController {
    
    @Autowired
    private SearchService searchService;
    
    @GetMapping
    public List<SearchItem> search(@RequestParam String query) {
        return searchService.searchItems(query);
    }
    
    @GetMapping("/placeholders")
    public List<String> getPlaceholders() {
        return searchService.getPlaceholderTexts();
    }
}