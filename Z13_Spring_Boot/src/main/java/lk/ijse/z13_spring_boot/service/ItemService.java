package lk.ijse.z13_spring_boot.service;

import lk.ijse.z13_spring_boot.dto.ItemDTO;
import lk.ijse.z13_spring_boot.entity.Item;
import lk.ijse.z13_spring_boot.repo.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {

    @Autowired
    private ItemRepo itemRepo;

    public boolean addItem(ItemDTO itemDTO){
        if (itemRepo.existsById(itemDTO.getCode())){
            return false;
        }
        Item item = new Item(
                itemDTO.getCode(),
                itemDTO.getItemName(),
                itemDTO.getPrice(),
                itemDTO.getQty()
        );
        itemRepo.save(item);
        return true;
    }
}
