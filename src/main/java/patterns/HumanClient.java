package patterns;

public class HumanClient implements Client {

    private OrderingStrategy orderingStrategy;

    HumanClient(OrderingStrategy orderingStrategy) {
        this.orderingStrategy = orderingStrategy;
    }

    @Override
    public void happyHourStarted(Bar bar) {
        bar.startHappyHour();
    }

    @Override
    public void happyHourEnded(Bar bar) {
        bar.endHappyHour();
    }

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        orderingStrategy.wants(drink, recipe, bar);
    }
}
