/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_vale;

/**
 *
 * @author Valeria
 */
public class Inventory {
    
// Variables asignadas segun proyecto.
    //Codigo, mascota, Nombre, Precio, Cantidad y tipo
    
    private Long id;
    private Object petType;
    private String name;
    private Double priceValue;
    private Integer quantity;
    private Object itemType;

    public Long getId() {
        return id;
    }
    
    public Inventory setId(Long id) {
        this.id = id;
        return this;
    }
    
    public Object getPetType() {
        return petType;
    }
    
    public Inventory setPetType(Object petType) {
        this.petType = petType;
        return this;
    }
    
    public String getName() {
        return name;
    }
    
    public Inventory setName(String name) {
        this.name = name;
        return this;
    }
    
    public Double getPriceValue() {
        return priceValue;
    }
    
    public Inventory setPriceValue(Double priceValue) {
        this.priceValue = priceValue;
        return this;
    }
    
    public Integer getQuantity() {
        return quantity;
    }
    
    public Inventory setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
    
    public Object getItemType() {
        return itemType;
    }
    
    public Inventory setItemType(Object itemType) {
        this.itemType = itemType;
        return this;
    }
}
    

