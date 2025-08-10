import java.util.ArrayList;

public class Cage {
    String cageCode;
    ArrayList<Pet> petList;
    private int currentPetCount;
    static int totalCages = 0;
    final int MAX_CAPACITY = 3;

    public Cage(){

    }

    public Cage(String cageCode){
        this.cageCode = cageCode;
        this.petList = new ArrayList<>();
        this.currentPetCount = 0;
        totalCages++;
    }


    public void addPet(Pet pet){
        if (currentPetCount < MAX_CAPACITY){
            petList.add(pet);
            currentPetCount++;
        }else System.out.println("Lồng đã đầy");
    }
    public void printAllPet(){
        System.out.println();
        for (Pet pet : petList) {
            pet.printInfor();
        }
    }
}
