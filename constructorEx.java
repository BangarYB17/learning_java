/* without constructor */
/*class constructorEX{
    String name;
    void setName(String name){
        this.name = name;
    }

    public static void main(String[] args){
        constructorEX obj = new constructorEX();
        obj.setName("Lekhit Gulambi");
        System.out.println(obj.name);
    }
} */

class constructorEX{
    String name;
    
    constructorEX(String name){
        this.name=name;
    }

    public static void main(String[] args){
        constructorEX obj = new constructorEX("jayesh nagya");
        // obj.setName("Lekhit Gulambi");
        System.out.println(obj.name);
    }
}