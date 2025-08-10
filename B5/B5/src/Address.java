public class Address {
    private String diachi;
    private int number;

    public Address(){

    }
    public Address(String diachi, int number){
        this.diachi = diachi;
        this.number = number;
    }

    private String getDiachi(){
        return diachi;
    }
    void setDiachi(String diachi){
        this.diachi = diachi;
    }

    private int getNumber(){
        return number;
    }
    private void setNumber(int number){
        this.number = number;
    }
}
