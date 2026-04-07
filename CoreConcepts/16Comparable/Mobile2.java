public class Mobile2 {
    String name;
    int ram;
    int rom;
    double price;
    String color; 

    public Mobile2(String name, int ram, int rom, double price, String color){
       this.name=name;  this.ram=ram;  this.rom=rom; this.price=price; this.color=color;
    }
    
    @Override
    public String toString(){
        return "Mobile : [name="+name+", ram="+ram+", rom="+rom+", price="+price+", color="+color+"]";
    }

}