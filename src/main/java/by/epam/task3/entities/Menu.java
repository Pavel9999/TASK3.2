
package by.epam.task3.entities;

import java.io.Serializable;
import java.util.Objects;


public class Menu implements Serializable{
    
    private String menu;
    private String typeOfmenu;
    private int id;
    private String img;
    private String title;
    private String description;
    private String portion;
    private String weight;
    private int ration_1;
    private int ration_2;
    private int ration_3;
    private int ration_4;
    private String currency;
    private int price;
    private String quantity;
    
    
    public String getMenu(){
        return menu;
    }
    
    public void setMenu(String menu){
        this.menu=menu;
    }
    
    
    public String getTypeOfMenu(){
        return typeOfmenu;
    }
    
    public void setTypeOfMenu(String typeOfmenu){
        this.typeOfmenu=typeOfmenu;
    }
    
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id=id;
    }
    
    
    public String getImg(){
        return img;
    }
    
    public void setImg(String img){
        this.img=img;
    }
    
    
    public String getTitle(){
        return title;
    }
    
    public void setTitle(String title){
        this.title=title;
    }
    
    
    public String getDescription(){
        return description;
    }
    
    public void setDescription(String description){
        this.description=description;
    }
    
    
    public String getPortion(){
        return portion;
    }
    
    public void setPortion(String portion){
        this.portion=portion;
    }
    
    
     public String getWeight(){
        return weight;
    }
    
    public void setWeight(String weight){
        this.weight=weight;
    }
    
    
    public int getRation_1(){
        return ration_1;
    }
    
    public void setRation_1(int ration_1){
        this.ration_1=ration_1;
    }
    
    public int getRation_2(){
        return ration_2;
    }
    
    public void setRation_2(int ration_2){
        this.ration_2=ration_2;
    }
    
    
    public int getRation_3(){
        return ration_3;
    }
    
    public void setRation_3(int ration_3){
        this.ration_3=ration_3;
    }
    
    
    public int getRation_4(){
        return ration_4;
    }
    
    public void setRation_4(int ration_4){
        this.ration_4=ration_4;
    }
    
    
    
    
    public String getCurrency(){
        return currency;
    }
    
    public void setCurrency(String currency){
        this.currency=currency;
    }
    
    
    
    public int getPrice(){
        return price;
    }
    
    public void setPrice(int price){
        this.price=price;
    }
    
    
    
    public String getQuantity(){
        return quantity;
    }
    
    public void setPrice(String quantity){
        this.quantity=quantity;
    }
    
    
    
    
    
    
   @Override
    public int hashCode() {

        return Objects.hash( typeOfmenu,id,img, title, description,portion,weight,ration_1, ration_2,
               ration_3,ration_4,currency,price,quantity );
    }
    
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Menu menu = (Menu) o;
         return typeOfmenu == menu.typeOfmenu &
                Objects.equals(id, menu.id)&&
                Objects.equals(title, menu.title)&& 
                 Objects.equals(description, menu.description)&&
                 Objects.equals(portion, menu.portion)&&
                 Objects.equals(weight, menu.weight)&&
                 Objects.equals(ration_1, menu.ration_1)&&
                 Objects.equals(ration_2, menu.ration_2)&&
                 Objects.equals(ration_3, menu.ration_3)&&
                 Objects.equals(ration_4, menu.ration_4)&&
                 Objects.equals(currency, menu.currency)&&
                 Objects.equals(price, menu.price)&&
                 Objects.equals(quantity, menu.quantity);        
    }
    
    
    @Override
    public String toString() {
        return this.getTypeOfMenu()+this.getId()+this.getTitle()+this.getDescription()+this.portion+
                this.getWeight()+this.getRation_1()+this.getRation_2()+this.getRation_3()+this.getRation_4()+
                this.getPrice()+this.getCurrency()+this.getQuantity();
    }
    
    
    
    
    
    
    
    
    
    
    
}
