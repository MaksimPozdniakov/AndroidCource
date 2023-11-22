package Study.Architecture.Seminar_01.Models;

import java.util.Collection;

public interface OrderEntity {

    String getAddress();

    String getPhone();

    Collection<OrderItem> getItems();

}
