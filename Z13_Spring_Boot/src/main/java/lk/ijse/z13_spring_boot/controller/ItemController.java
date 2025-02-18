package lk.ijse.z13_spring_boot.controller;

import lk.ijse.z13_spring_boot.dto.ItemDTO;
import lk.ijse.z13_spring_boot.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/item")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @PostMapping("save")
    public boolean saveItem(@RequestBody ItemDTO itemDTO){
        itemService.addItem(itemDTO);
        return true;
    }

    @GetMapping("getAll")
    public List<ItemDTO> getAllItems(){
        return itemService.getAllItems();
    }

    @PutMapping("update")
    public boolean updateItem(@RequestBody ItemDTO itemDTO){
        itemService.updateItem(itemDTO);
        return true;
    }
}
