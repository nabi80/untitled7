public class cartester {

    public static void main(String[] args) {
        carclass car1 = new carclass();
        car1.make = "iron";
        car1.color = "green";
        int year = 2013;
        car1.moveforword();
        car1.applybreak();

        System.out.println(car1.make);


carclass car2 = new carclass();
car2.make="plastic";
car2.year=2014;
car2.color="red";
car2.applybreak();
car2.moveforword();

        System.out.println(car2.color);





    }
}
