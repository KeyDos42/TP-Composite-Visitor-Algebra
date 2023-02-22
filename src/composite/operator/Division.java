package composite.operator;
import composite.Expression;
import composite.Number;
import composite.Operator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Division extends Operator {
    public Division() {
        super('/');
    }

    public int interpret() {
        int res = this.arguments.get(0).interpret();
        arguments.remove(arguments.get(0));
        if (this.arguments.size() == 1){
            for (Expression argument : arguments) {
                res /= argument.interpret();
            }
        } else {
            throw new IllegalArgumentException("Not arguments size !");
        }

        return res;
    }
}
