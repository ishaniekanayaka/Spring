package lk.ijse.z13_spring_boot.service;

import lk.ijse.z13_spring_boot.dto.ItemDTO;
import lk.ijse.z13_spring_boot.entity.Item;
import lk.ijse.z13_spring_boot.repo.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    public List<ItemDTO> getAllItems(){
        List<Item> items = itemRepo.findAll();
        return items.stream().map(item -> new ItemDTO(
                item.getCode(),
                item.getItemName(),
                item.getPrice(),
                item.getQty()
        )).collect(Collectors.toList());
    }

    public void updateItem(ItemDTO itemDTO){
        Item item = itemRepo.findById(itemDTO.getCode()).orElse(null);
        if (item!=null){
            item.setItemName(itemDTO.getItemName());
            item.setPrice(itemDTO.getPrice());
            item.setQty(itemDTO.getQty());
            itemRepo.save(item);
        }
    }
}
