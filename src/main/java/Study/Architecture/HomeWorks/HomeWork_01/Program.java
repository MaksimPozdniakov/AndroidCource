package Study.Architecture.HomeWorks.HomeWork_01;

import Study.Architecture.HomeWorks.HomeWork_01.InMemoryModel.ModelStore;
import Study.Architecture.HomeWorks.HomeWork_01.InMemoryModel.Observer1;
import Study.Architecture.HomeWorks.HomeWork_01.InMemoryModel.Observer2;
import Study.Architecture.HomeWorks.HomeWork_01.ModelElements.PoligonalModel;

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
