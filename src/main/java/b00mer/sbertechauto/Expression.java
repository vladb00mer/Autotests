package b00mer.sbertechauto;

public class Expression {

String operand1, operand2, operation, result = new String();

public Expression() {}

public Expression(String operand1, String operand2, String operation, String result) {

    this.operand1 = operand1;
    this.operand2 = operand2;
    this.operation = operation;
    this.result = result;
}

double getOperand1() {

    return Double.parseDouble(operand1);
}

double getOperand2() {

    return Double.parseDouble(operand2);
}

double getResule() {

    return Double.parseDouble(result);
}


}
