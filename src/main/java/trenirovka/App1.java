package trenirovka;

import java.util.Random;

public class App1 {
    public static void main(String[] args) {
//        FileNasl file1 = new FileNasl("Hello");

//        FileNasl file1 = new FileNasl("Hello1", "25", 13);

        File a = new FileNasl("HelloB", "dataB", 19);

        System.out.println("a начальный " + a.abc());

//
        FileNasl b = (FileNasl) a;

        File c = new File();

        System.out.println("a после " + a.abc());

        System.out.println("b после " + b.abc());

        System.out.println("c начальный " + c.abc());

        System.out.println(b.sum());

        a.d2();


//        FileNasl file3 = new FileNasl();

        //        File file1 = new File();
//
//        file1.setName("My file");
//        file1.setData ("24082022");
//        System.out.println(file1.getName());
//        System.out.println(file1.getData());

//        System.out.println(file2.getName());
//        System.out.println(file2.getData());

//        file3.setName("Hello33");
//        System.out.println(file3.getName());
//        System.out.println(file3.getData());
////
//
//        System.out.println(file1.spec(4));


//        File cop = file2.coping();

//        System.out.println(file1.getName());
//        System.out.println(file1.getData());
//        System.out.println(cop.getName());
//        System.out.println(cop.getData());

//        System.out.println(file2.coping1(4));
//
//        System.out.println(file2.sum());

//        if(file2 instanceof FileNasl){
//            System.out.println("Object type is Square");
//        }
//
//
//        else if(cop instanceof FileNasl){
//            System.out.println("Object type is Rectangle");
//        }



//        if(file3 instanceof FileNasl){
//            System.out.println("Object type is Square");
//        }
//
//
//        else if(file3 instanceof File){
//            System.out.println("Object type is Rectangle");
//        }



//        file1.setName("No My file");
//        file1.setData (String.valueOf(11));
//        System.out.println(file1.getName());
//        System.out.println(file1.getData());
//
//        File fileCopy = file1.coping();
//
//
//        System.out.println("New file name: " + fileCopy.getName());
//        System.out.println("New file data: " + fileCopy.getData());
//
//        File file2 = new File();
//        file2.setName("MY");
//        file2.setData (String.valueOf(1));
//        System.out.println(file2.getName());
//        System.out.println(file2.getData());
//
//        System.out.println(file1.getName());
//        System.out.println(file1.getData());
    }
}
