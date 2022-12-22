package task4;

public class Add extends BinaryOperation {
    public Add(Expression left, Expression right) {
        super(left, right);
    }

    @Override
            // переменное количество аргументов
    public int evaluate(int... vars) {
        return Math.addExact(left.evaluate(vars), right.evaluate(vars));
    }// Возвращает сумму аргументов

    @Override
    public String toString() {
        return String.format("(%s + %s)", left, right);
    }
}
