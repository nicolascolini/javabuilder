public class Car {
    private String brand;
    private String model;
    private int year;
    private String color;

    private Car(CarBuilder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    // Classe estática Builder
    public static class CarBuilder {
        private String brand;
        private String model;
        private int year;
        private String color;

        // Métodos para definir cada propriedade do Carro
        public CarBuilder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public CarBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        // Método para construir o objeto Car com as propriedades definidas
        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }

    // Método main para testar o Builder
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .setBrand("Toyota")
                .setModel("Corolla")
                .setYear(2023)
                .setColor("Blue")
                .build();

        System.out.println(car);
    }
}