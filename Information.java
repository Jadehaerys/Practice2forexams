public class Information {

    private String name1;
    private int age1;
    
    
    public Information(String name1, int age1){
    
    this.name1 = name1;
    this.age1 = age1;
    
    }
    public String getName()
    {
    return this.name1;
    }
    public int getAge()
    {
    return this.age1;
    }
    
    public int brothersAge(){
    
    return getAge()/2;
    }
    
    
    }