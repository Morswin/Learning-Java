package pl.lamiglowki.sklepnielogarytmiczny.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.lamiglowki.sklepnielogarytmiczny.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

}
