package prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeEverydayDemo { // example of shallow copy
    // because the objects created are just getting returned the same
    // as what we had passed in. So it's not necessarily a true copy

    public static void main(String[] args) {
        String sql = "select * from movie where tile = ?";
        List<String> parameters = new ArrayList<>();
        parameters.add("One Piece");
        Record record = new Record();

        Statement firsStatement = new Statement(sql, parameters, record);
        System.out.println(firsStatement.getSql());
        System.out.println(firsStatement.getParameters());
        System.out.println(firsStatement.getRecord());

        Statement secondStatement = firsStatement.clone();
        System.out.println(secondStatement.getSql());
        System.out.println(secondStatement.getParameters());
        System.out.println(secondStatement.getRecord());
    }
}
