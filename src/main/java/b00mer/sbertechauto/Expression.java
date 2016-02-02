package b00mer.sbertechauto;

public class Expression {

//variable declaration
String operand1, operand2, operation, result;
Double localResult;

//default constructor
public Expression() {}

//overloaded constructor
public Expression(String operand1, String operand2, String operation, String result) {

    this.operand1 = operand1;
    this.operand2 = operand2;
    this.operation = operation;
    this.result = result;
    
    this.localResult = makeOperation();
}

//operand1 to double
double getOperand1() {

    return Double.parseDouble(operand1.trim());
}
//operand2 to double
double getOperand2() {

    return Double.parseDouble(operand2.trim());
}
// result to double
public double getResult() {

    return Double.parseDouble(result.trim());
}
// local result
public double getLocalResult() {

    return localResult;
}

// making operation
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