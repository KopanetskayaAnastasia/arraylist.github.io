import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        Library l=new Library();
        System.out.println("Enter n for list:");
        int n=sc.nextInt();
        System.out.println("Enter n Book:");
        String name;
        String author;
        int year;
        for (int i=0;i<n;i++){
            name=sc.next();
            author=sc.next();
            year=sc.nextInt();
            Book s=new Book(name,author,year);
            l.add(s);
        }
        System.out.println("Enter y1,y2:");
        int y1=sc.nextInt();
        int y2=sc.nextInt();
        l.deleteInRange(y1,y2);
        l.print();

    }

}
