package Study.Architecture.Seminar_01.InMemory;

import Study.Architecture.Seminar_01.Models.OrderEntity;

import java.util.Collection;

public class StoreService {

    public static void processOrders(Collection<OrderEntity> orders){
        for (OrderEntity order: orders) {
            //TODO: process orders ...
        }
    }

}
