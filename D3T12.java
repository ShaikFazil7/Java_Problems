class FormValidator
{
    String name = "";
}
public class D3T12 {
    public static void main(String[] args) {
        FormValidator fv = new FormValidator();
        System.out.println("check whether the input is empty:" + fv.name.isEmpty());
        if(fv.name.isEmpty())
        {
            System.out.println("Name is requried");
        }
        else{
            System.out.println("name Submitted Successfully");
        }
    }
}
