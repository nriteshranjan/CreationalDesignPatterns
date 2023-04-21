package factory;

import factory.ModuleType.DemoModule;
import factory.ModuleType.IntroModule;
import factory.ModuleType.SummaryModule;

public class HLD extends Course {
    @Override
    public void createCourse() {
        modules.add(new IntroModule());
        modules.add(new DemoModule());
        modules.add(new SummaryModule());
    }
}
