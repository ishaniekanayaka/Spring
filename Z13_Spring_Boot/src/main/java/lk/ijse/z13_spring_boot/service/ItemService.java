package lk.ijse.z13_spring_boot.service;

import lk.ijse.z13_spring_boot.dto.ItemDTO;

import java.util.List;

public interface ItemService {
    public String addItem(ItemDTO itemDTO);

    public List<ItemDTO> getAllItems();

    public void updateItem(ItemDTO itemDTO);

    public void deleteItem(int code);
}
