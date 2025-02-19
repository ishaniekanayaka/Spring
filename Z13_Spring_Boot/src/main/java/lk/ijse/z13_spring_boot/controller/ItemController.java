package lk.ijse.z13_spring_boot.controller;

import lk.ijse.z13_spring_boot.dto.ItemDTO;
import lk.ijse.z13_spring_boot.service.impl.ItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/item")
@CrossOrigin(origins = "http://localhost:63342",allowedHeaders = "*")
public class ItemController {

    @Autowired
    private ItemServiceImpl itemService;

    @PostMapping("save")
    public String saveItem(@RequestBody ItemDTO itemDTO){
        String result = itemService.addItem(itemDTO);
        return result;
    }

    @GetMapping("getAll")
    public List<ItemDTO> getAllItems(){
        return itemService.getAllItems();
    }

    @PutMapping("update")
    public String updateItem(@RequestBody ItemDTO itemDTO){
        itemService.updateItem(itemDTO);
        return "Item Updated Successfully :)";
    }

    @DeleteMapping("delete/{id}")
    public String deleteItem(@PathVariable("id") int id){
        itemService.deleteItem(id);
        return "Item deleted successfully :)";
    }
}
