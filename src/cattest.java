public class cattest {
    public static void main(String[] args) {
        cat cat1 = new cat();

cat1.name="nabi";
cat1.age=12;
cat1.breed="van cat";
cat1.color="grey";
cat1.attitude=false;

cat1.speak();
cat cat2=new cat() {
};

cat2.name="loki";
cat2.breed="domistic";
cat2.color="white";
cat2.speak();
        System.out.println(cat1.age);

    }


}


