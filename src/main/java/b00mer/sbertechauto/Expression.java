package b00mer.sbertechauto;

public class Expression {

String operand1, operand2, operation, result;
Double localResult;

public Expression(String operand1, String operand2, String operation, String result) {

    this.operand1 = operand1;
    this.operand2 = operand2;
    this.operation = operation;
    this.result = result;
    
    this.localResult = makeOperation();
}
        
double getOperand1() {

    return Double.parseDouble(operand1.trim());
}
double getOperand2() {

    return Double.parseDouble(operand2.trim());
}
public String getOperation() {

    return operation;
}
public double getResult() {

    return Double.parseDouble(result.trim());
}
public double getLocalResult() {

    return localResult;
}

private Double makeOperation() {

    switch (operation.trim()) {
        case "+":
            localResult = getOperand1()+getOperand2();
            break;
        case "-":
            localResult = getOperand1()-getOperand2();
            break;
        case "*":
            localResult = getOperand1()*getOperand2();
            break;
        case "/":
            localResult = getOperand1()/getOperand2();
            break;
        default:
            localResult = null;
            break;
    }
    return localResult;
}
}