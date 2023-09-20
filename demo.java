package capsulator;
public class demo{
    public static void main(String args[]){
      student st = new student();
        st.display("10","adc", "10", "1020202020");
    }
}
class student{
    String id;
    String name;
    String std;
    String contact;

    void display( String id,String name,String std,String contact){
        this.id = id;
        this.name=name;
        this.std=std;
        this.contact=contact;

        System.out.println("id = "+id);
        System.out.println("name = "+name);
        System.out.println("std = "+std);
        System.out.println("contact = "+contact);
        
    }

    public void display(int i, String name2, int j, int k) {
    }
}

