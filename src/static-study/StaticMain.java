public class StaticMain {

    public static void main(String[] args) {

        VariableStatics var1 = new VariableStatics();
        VariableStatics var2 = new VariableStatics();

        var1.printStaticVariable();
        var2.printStaticVariable();

        VariableStatics.increment();

        var1.printStaticVariable();
        var2.printStaticVariable();

        StaticPublic.setPublicVariable(1);
        System.out.println(StaticPublic.getPublicVariable());
    }
}

class VariableStatics {

    private static int staticVariable;

    public static void increment() {
        staticVariable++;
    }

    public void printStaticVariable() {
        System.out.println(staticVariable);
    }
}

class StaticPublic {

    private static int publicVariable;

    public static void setPublicVariable(int value) {
        publicVariable = value;
    }

    public static int getPublicVariable() {
        return publicVariable;
    }
}
