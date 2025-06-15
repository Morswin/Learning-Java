package pl.lamiglowki.sklepnielogarytmiczny;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import pl.lamiglowki.sklepnielogarytmiczny.model.Item;
import pl.lamiglowki.sklepnielogarytmiczny.repository.ItemRepository;

import java.math.BigDecimal;
import java.util.List;

@Configuration
public class DbInit implements CommandLineRunner {
    private final ItemRepository itemRepository;

    @Autowired
    public DbInit(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if(itemRepository.count()==0) {
            itemRepository.saveAll(List.of(
                    new Item("Ołówek", new BigDecimal("1.30"), "https://static.vecteezy.com/system/resources/thumbnails/002/098/203/small_2x/silver-tabby-cat-sitting-on-green-background-free-photo.jpg"),
                    new Item("Ołówek", new BigDecimal("1.40"), "https://cdn.hswstatic.com/gif/frog-1.jpg"),
                    new Item("Ołówek", new BigDecimal("1.90"), "https://static.libertyprim.com/files/familles/pomme-large.jpg?1569271834")
            ));
        }
    }
}
