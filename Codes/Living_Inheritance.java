class Living {
    public void run() {
        System.out.println("All Living being have brain ");
    }
}
    class animal extends Living{
        public void eat(){
            System.out.println("Animal can run");
        }
    }
    class bird extends animal{
        public void fly(){
            System.out.println("Bird can fly");
        }
    }
    class parrot extends bird {
        public void speak() {
            System.out.println("Parrot can speak");
        }

        public static void main(String[] args) {
            parrot pc = new parrot();
            pc.run();
            pc.fly();
            pc.eat();
            pc.speak();
        }
    }

