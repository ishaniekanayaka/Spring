package lk.ijse.z13_spring_boot.service.impl;

import lk.ijse.z13_spring_boot.dto.ItemDTO;
import lk.ijse.z13_spring_boot.entity.Item;
import lk.ijse.z13_spring_boot.repo.ItemRepo;
import lk.ijse.z13_spring_boot.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepo itemRepo;

    @Override
    public String addItem(ItemDTO itemDTO){
        if (itemRepo.existsById(itemDTO.getCode())){
            return " Item already exists :(";
        }
        Item item = new Item(
                itemDTO.getCode(),
                itemDTO.getItemName(),
                itemDTO.getPrice(),
                itemDTO.getQty()
        );
        itemRepo.save(item);
        return "Item saved successfully :)";
    }

    @Override
    public List<ItemDTO> getAllItems(){
        List<Item> items = itemRepo.findAll();
        return items.stream().map(item -> new ItemDTO(
                item.getCode(),
                item.getItemName(),
                item.getPrice(),
                item.getQty()
        )).collect(Collectors.toList());
    }

    @Override
    public void updateItem(ItemDTO itemDTO){
        Item item = itemRepo.findById(itemDTO.getCode()).orElse(null);
        if (item!=null){
            item.setItemName(itemDTO.getItemName());
            item.setPrice(itemDTO.getPrice());
            item.setQty(itemDTO.getQty());
            itemRepo.save(item);
        }
    }
    public void deleteItem(int code){

        itemRepo.deleteById(code);
    }
}
