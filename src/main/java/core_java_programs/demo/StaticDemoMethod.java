package com.example.demo;

class SuperClass{
    static void method(){
        System.out.println("superClass method");
    }
}
class SubClass extends SuperClass{
    static void method(){
        System.out.println("SubClass method");
    }
}
public class StaticDemoMethod {

    public static void main(String[] args) {
        SuperClass obj=new SubClass();
        obj.method();
    }
}



//•	Static method cannot be overridden with non-static method, any attempt to do this will cause
// compilation error.

//class SuperClass{
//    static void method(){
//        System.out.println("superClass method");
//    }
//}
//class SubClass extends SuperClass{
//     void method(){
//        System.out.println("SubClass method");
//    }
//}
//public class StaticDemoMethod {
//
//    public static void main(String[] args) {
//        SuperClass obj=new SubClass();
//        obj.method();
//    }
//}

//•	Non-static method cannot be overridden with static method, any attempt to do this will cause compilation
// error.

//class SuperClass{
//     void method(){
//        System.out.println("superClass method");
//    }
//}
//class SubClass extends SuperClass{
//    static void method(){
//        System.out.println("SubClass method");
//    }
//}
//public class StaticDemoMethod {
//
//    public static void main(String[] args) {
//        SuperClass obj=new SubClass();
//        obj.method();
//    }
//}


//restricted access modifier
//
//class SuperClass{
//    protected void method(){
//        System.out.println("superClass method");
//    }
//}
//class SubClass extends SuperClass{
//     void method(){
//        System.out.println("SubClass method");
//    }
//}
//public class StaticDemoMethod {
//
//    public static void main(String[] args) {
//        SuperClass obj=new SubClass();
//        obj.method();
//    }
//}