package lk.ijse.z13_spring_boot.repo;

import lk.ijse.z13_spring_boot.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepo extends JpaRepository<Item, Integer> {
}
