final class FinalClass {
    final int constantValue = 100;

    public final void displayValue() {
        System.out.println("Value: " + constantValue);
    }
}

class FinalClassNew {
    final int data;

    FinalClassNew(int value) {
        data = value;
    }

    public void show() {
        System.out.println("Data: " + data);
    }
}

public class finalKeyword {

    public static void main(String[] args) {
        FinalClassNew obj = new FinalClassNew(50);
        obj.show();

        FinalClass finalClass = new FinalClass();
        finalClass.displayValue();
    }
}
