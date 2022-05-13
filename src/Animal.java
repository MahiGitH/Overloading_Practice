public class Animal {
    private String name;
    private Boolean isADog;

    public Animal(String name, Boolean isADog){
        this.name = name;
        this.isADog = isADog;
    }

    public Animal(String name){
        this.name = name;
        this.isADog = isADog;
    }

    public Animal(Boolean isADog){
        this.isADog = isADog;
    }

    public Animal(){
        this.isADog = isADog;
    }
    public String getName() {
        return name;
    }

    public Boolean getADog() {
        return isADog;
    }

    @Override
    public String toString() {
        return getName() + ", is a dog = " + getADog();
    }
}
