package Study.Architecture.Seminars.Seminar_01.Ex_home_work;

import Study.Architecture.Seminars.Seminar_01.Ex_home_work.InMemoryModel.ModelStore;
import Study.Architecture.Seminars.Seminar_01.Ex_home_work.InMemoryModel.Observer1;
import Study.Architecture.Seminars.Seminar_01.Ex_home_work.InMemoryModel.Observer2;
import Study.Architecture.Seminars.Seminar_01.Ex_home_work.ModelElements.PoligonalModel;

public class Program {

    public static void main(String[] args) {

        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();

        ModelStore modelStore = new ModelStore();
        modelStore.registerModelChanger(observer1);
        modelStore.registerModelChanger(observer2);


        modelStore.addModel(new PoligonalModel());






    }
}
