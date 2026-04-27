package JavaCodes;

interface i1 {
    abstract void show();
}

interface i2 {
    abstract void display();
}

interface i3 {
    abstract void print();
}

class myclass implements i1, i2, i3 {
    public void show() {
        System.out.println("Show");
    }

    public void display() {
        System.out.println("Display");
    }

    public void print() {
        System.out.println("Print");
    }
}

class Interface {
    public static void main(String[] args) {
        myclass m = new myclass();
        m.show();
        m.display();
        m.print();
    }
}