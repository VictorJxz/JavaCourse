package ValuesVsReference;

class People {
    private String username;

    public void setUsername(String newUsername){
        this.username = newUsername;
    }
    public String getUsername(){
        return this.username;
    }
}

public class PassByReference2 {

    public static void main(String[] args) {

        People people = new People();
        people.setUsername("Victor");
        System.out.println("people.getUsername() = " + people.getUsername());
        test( people );
        System.out.println("people.getUsername() = " + people.getUsername());

    }
    public static void test( People people ){
        System.out.println("...........   Method Test   ...........");
        people.setUsername(" Victor Jxz");
    }

}
