package Services;

import java.util.List;

public interface iUserService<T> {
    List<T> getAll();
    void create(String firstName, String secondName, String adressUser, int ageUser);
}
