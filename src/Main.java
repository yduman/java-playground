import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        var wrong = IntStream.range(1, 10).limit(5).distinct();
        System.out.println(wrong);

        var right = IntStream.range(1, 15).limit(10).distinct().sum();
        System.out.println(right);

        /*
        Immutable Builder
         */
        var unconsumed = Student.Builder.newInstance().withId(123).withName("FooBar").withAddress("SomeAddress");
        System.out.println(unconsumed);

        var consumed = Student.Builder.newInstance().withId(123).withName("FooBar").withAddress("SomeAddress").build();
        System.out.println(consumed);

        /*
        GoF Design Patterns - Builder Pattern

        Product         => House
        Builder         => HouseBuilder
        ConcreteBuilder => ConcreteHouseBuilder
        Director        => ConstructionEngineer
         */
        HouseBuilder houseBuilder = new ConcreteHouseBuilder();
        ConstructionEngineer engineer = new ConstructionEngineer(houseBuilder);
        House house = engineer.constructHouse();
        System.out.println(house);

        /*
        Step Builder
         */
        var email = Email.builder().from("foo@bar.com").to("bar@foo.com").subject("test").content("testContent").build();
        System.out.println(email);
    }
}

