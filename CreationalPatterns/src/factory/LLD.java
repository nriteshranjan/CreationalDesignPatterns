package factory;

import factory.ModuleType.ExerciseModule;
import factory.ModuleType.IntroModule;
import factory.ModuleType.SummaryModule;

public class LLD extends Course {
    @Override
    public void createCourse() {
        modules.add(new IntroModule());
        modules.add(new ExerciseModule());
        modules.add(new SummaryModule());
    }
}
