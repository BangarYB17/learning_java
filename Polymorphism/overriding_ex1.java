class animal{
    void sound(){
        System.out.println("Animal Make Sound");
    }
}

class dog extends animal{
    void sound(){
        System.out.println("Dog Sound");
    }
}

class overriding_ex1{
    public static void main(String[] args){
        dog d = new dog();
        d.sound();

        animal a = new animal();
        a.sound();
    }
    
}