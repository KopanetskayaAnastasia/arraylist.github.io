import java.util.ArrayList;

public class Library {
    ArrayList <Book> list;
    Library(){
        list=new ArrayList<Book>();
    }
    void add(Book s){
        list.add(s);
    }
    void del(String name){
        int p=-1;
        for (int i=0;i<list.size();i++){
            if(name.equalsIgnoreCase(list.get(i).getName()))
                p=i;
        }
        if(p>-1){
            list.remove(p);
            System.out.println("Deleted Book:"+name);
        }
        else {
            System.out.println("No such book");
        }
    }
    void print(){
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i).toString());
        }
    }
    void sortByName(){
        list.sort(Book.NameComparator);
    }
    void sortByYear(){
        list.sort(Book.YearComparator);
    }
    void deleteInRange(int y1,int y2){
        for (int i=0;i< list.size();){
            if (list.get(i).getYear()>y1 && list.get(i).getYear()<y2)
                list.remove(i);
            else i++;
        }
    }
}
