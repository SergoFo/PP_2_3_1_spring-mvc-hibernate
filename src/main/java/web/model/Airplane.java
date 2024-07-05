package web.model;

public class Airplane {
    private int id;
    private String name;
    private String model;
    private int passengerCapacity;
    private String countryOfOrigin;
    private int numberOfEngines;

    // Конструктор, геттеры и сеттеры
    public Airplane(int id, String name, String model, int passengerCapacity, String countryOfOrigin, int numberOfEngines) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.passengerCapacity = passengerCapacity;
        this.countryOfOrigin = countryOfOrigin;
        this.numberOfEngines = numberOfEngines;
    }

    // Геттеры и сеттеры
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public int getNumberOfEngines() {
        return numberOfEngines;
    }

    public void setNumberOfEngines(int numberOfEngines) {
        this.numberOfEngines = numberOfEngines;
    }
}
