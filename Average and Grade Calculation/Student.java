public class Student{
    private int id;
    private String name;
    private int[] marks;
    private float average;
    private char grade;
    public void setId(int i){
        this.id=i;
    }
    public void setName(String n){
        this.name=n;
    }
    public void setMarks(int[] m){
        this.marks=m;
    }
    public void setAverage(float a){
        this.average=a;
    }
    public void setGrade(char g){
        this.grade=g;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int[] getMarks(){
        return this.marks;
    }
    public float getAverage(){
        return this.average;
    }
    public char getGrade(){
        return this.grade;
    }
    public void calculateAvg(){
        int sum=0;
        for(int i=0;i<this.marks.length;i++){
            sum+=this.marks[i];
        }
        this.average=(float)sum/(float)this.marks.length;
        setAverage(this.average);
    }
    public void findGrade(){
        for(int i=0;i<this.marks.length;i++)
        if(this.marks[i]<50)
        {setGrade('F'); return;}
        
        if(this.average>=80 && this.average<=100)
        setGrade('O');
        else if(this.average>=50 && this.average<80)
        setGrade('A');
        else
        setGrade('F');
    }
}