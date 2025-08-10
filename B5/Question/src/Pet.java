public class Pet {
    private String name;
    private String species;
    private double weight;

    public Pet(){

    }
    public Pet(String name, String species, double weight) {
        this.name = name;
        this.species = species;
        this.weight = weight;
    }

    public void printInfor(){
        System.out.printf("Tên: %s | Loài: %s | Cân nặng: %.2f kg\n",this.name,this.species,this.weight);
    }
    public boolean isOverweight(){
        if (this.weight <= 10) return false;
        else return true;
    }
    String getBasicInfo() {
        return this.name + " - " + this.species;
    }

    public String getName(){

        return name;
    }
    public void setName(String name){

        this.name = name;
    }

    public String getSpecies(){

        return species;
    }
    public void setSpecies(String species){

        this.species = species;
    }

    public double getWeight(){

        return weight;
    }
    public void setWeight(double weight){

        this.weight = weight;
    }
}
