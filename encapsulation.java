  class student {
    private String name;
    private int marks;
    
    public void setnames(String name){
        this.name =name;
    }
public void setmarks(int marks){
    this.marks =marks;

}
public  String  getname(){
    return name;
}

public int getmarks(){
    return marks;

}

public  class encapsulation{
    public static void main(String[] args) {
       student obj = new student ();
        obj.setnames("Aarchi" );
        System.out.println(obj.getname());
        obj.setmarks(50);
        System.out.println(obj.getmarks());
    }
}
}
