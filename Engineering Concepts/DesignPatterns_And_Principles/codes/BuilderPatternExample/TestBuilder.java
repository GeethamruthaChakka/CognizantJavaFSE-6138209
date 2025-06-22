package BuilderPatternExample;

public class TestBuilder {
    public static void main(String[] args) {
        // Basic computer
        Computer basicComputer = new Computer.Builder("Intel i3", "8GB").build();
        System.out.println("Basic Computer Configuration:");
        basicComputer.displayConfiguration();

        // Gaming computer
        Computer gamingComputer = new Computer.Builder("Intel i7", "16GB")
                                    .setStorage("1TB SSD")
                                    .setGraphicsCard("NVIDIA RTX 3060")
                                    .build();
        System.out.println("Gaming Computer Configuration:");
        gamingComputer.displayConfiguration();

        // Office computer with extra storage
        Computer officeComputer = new Computer.Builder("AMD Ryzen 5", "8GB")
                                    .setStorage("512GB SSD")
                                    .build();
        System.out.println("Office Computer Configuration:");
        officeComputer.displayConfiguration();
    }
}
