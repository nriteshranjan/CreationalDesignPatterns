package builder.LunchOrder;

public class BuilderLunchOrderDemo {
    public static void main(String[] args) {
        LunchOrder.Builder builder = new LunchOrder.Builder(); // create new instance with static inner class

        builder.bread("Wheat").condiments("Lettuce").dressing("Mayo").meat("Turkey");

        LunchOrder lunchOrder = builder.build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());
    }
}
