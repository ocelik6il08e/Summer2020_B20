package day20_whileLoops;

public class BranchingStatements {

    public static void main(String[] args) {
        char ch = 'A';

        while(ch <= 'E'){

            if(ch == 'F'){
               ch++;
                continue;// skips everything even the iterator
            }

            System.out.println(ch);
            ch++;
        }

        if(true){
            System.exit(0);
        }
        System.out.println("Done");
    }
}
