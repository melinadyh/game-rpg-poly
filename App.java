public class App {
    public static void main(String[] args) throws Exception {
        Hero h1 = new Hero();
        h1.move(); 
        h1.move("Melina");
        Hero h2 = new Fighter();
        h2.move(); 

        Enemy e1 = new Enemy();
        e1.move(); 
        e1.move(1);
        Enemy e2 = new Witch();
        e2.move(); 
        
        Character chr1 = new Hero();
        chr1.move(); 
        Character chr2 = new Enemy();
        chr2.move(); 
        Character chr3 = new Witch();
        chr3.move(); 
        Character chr4 = new Fighter();
        chr4.move(); 
        
        Character chr5 = new Witch();
        chr5.move(); 
        Hero hero3 = (Hero) chr5;
        Fighter fgh1 = (Fighter) hero3;
        fgh1.move(); 
    }
}